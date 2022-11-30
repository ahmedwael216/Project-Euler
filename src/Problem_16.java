package src;

import java.math.BigInteger;

public class Problem_16 {
    public static void main(String[] args){
        BigInteger sol= BigInteger.TWO;
        for (int i = 0; i < 10; i++) {
            sol=sol.pow(2);
        }
        //sol reached 2^1024
        for (int i = 0; i <24 ; i++) {
            sol=sol.divide(BigInteger.TWO);
        }
        System.out.println(sumDigits(sol.toString()));
        //alternative
        //System.out.println(sumDigits(BigInteger.TWO.pow(1000).toString()));
    }

    public static int sumDigits(String s){
        int sol=0;
        for(char c:s.toCharArray()){
            sol+= Integer.parseInt(c+"");
        }
        return sol;
    }

}
