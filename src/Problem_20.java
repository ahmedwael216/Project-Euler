package src;

import java.math.BigInteger;

public class Problem_20 {
    public static void main(String[] args) {

        System.out.println(sumDigits(fac(100).toString()));
    }

    public static BigInteger fac(int number) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = number; i > 0; i--) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }

    public static int sumDigits(String s){
        int sol=0;
        for(char c:s.toCharArray()){
            sol+= Integer.parseInt(c+"");
        }
        return sol;
    }

}
