package src;

import java.math.BigInteger;

public class Problem_14 {
    public static void main(String[] args){
        int max=Integer.MIN_VALUE;
        int sol=0;
        for (int j = 1; j < 1000000; j++) {
            int temp=1; // accounting for the number itself in the sequence
            long i=j;
            while(i!=1) {
                temp++;
                if (i % 2 == 0) {
                    i /= 2;
                } else {
                    i = 3 * i + 1;
                }
            }
            if(temp>max){
                max=temp;
                sol=j;
            }
        }
        System.out.println(sol);
    }
}
