package src;
public class Problem_23 {
    static boolean[] isAbundant;
    public static void main(String[] args) {
        int limit = 28123;
        isAbundant = new boolean[limit + 1];

        for (int i = 1; i < isAbundant.length; i++) {
            isAbundant[i] = isAbundant(i);
        }
        int sum = 0;
        for (int i = 1; i <= limit; i++) {
            if (!isSumOf2Abundants(i))
                sum += i;
        }
        System.out.println(sum);
    }


    private static boolean isSumOf2Abundants(int n) {
        for (int i = 0; i <= n; i++) {
            if (isAbundant[i] && isAbundant[n - i]){
                return true;
            }
        }
        return false;
    }

    private static boolean isAbundant(int n) {
        int sum = 1;
        int end = (int) Math.sqrt(n);
        for (int i = 2; i <= end; i++) {
            if (n % i == 0)
                sum += i + n / i;
        }
        if (end * end == n)
            sum -= end;
        return sum > n;
    }
}
