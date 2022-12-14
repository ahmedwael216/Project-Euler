package src;


import java.util.Arrays;

public class Problem_32 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 10000; i++) {
            if (hasPandigitalProduct(i))
                sum += i;
        }
        System.out.println(sum);
    }
    public static boolean hasPandigitalProduct(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && isPandigital("" + n + i + n/i))
                return true;
        }
        return false;
    }

    public static boolean isPandigital(String s) {
        if (s.length() != 9)
            return false;
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return Arrays.toString(arr).equals("[1, 2, 3, 4, 5, 6, 7, 8, 9]");
    }
}
