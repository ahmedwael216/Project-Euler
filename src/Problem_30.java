package src;


import java.math.BigInteger;
import java.util.HashSet;

public class Problem_30 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i < 1000000; i++) {
            if (i == fifthPowerDigitSum(i))
                sum += i;
        }
        System.out.println(sum);
    }
    public static int fifthPowerDigitSum(int x){
        int sum=0;
        while (x != 0) {
            int y = x % 10;
            sum += y * y * y * y * y;
            x /= 10;
        }
        return sum;
    }
}
