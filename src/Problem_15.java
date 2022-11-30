package src;

import java.math.BigInteger;

public class Problem_15 {
    public static void main(String[] args){
        BigInteger sol= fac(40).divide(fac(20).multiply(fac(20)));
        System.out.println(sol.toString());
    }
    public static BigInteger fac(int number) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = number; i > 0; i--) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
}
