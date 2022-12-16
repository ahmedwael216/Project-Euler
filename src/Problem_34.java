package src;
public class Problem_34 {
    public static int[] factorials = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};
    public static void main(String[] args) {
        var sum = 0;
        for (var i = 10; i <= 1499999; i++) {
            if (i == factorialSum(i)) {
                sum+= i;
            }
        }
        System.out.println(sum);
    }

    public static int factorialSum(int i) {
        int sol=0;
        while (i > 0) {
            int d = i % 10;
            i /= 10;
            sol += factorials[d];
        }
        return sol;
    }
}
