package src;

import java.math.BigInteger;

public class Problem_17 {
    private static String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private static String[] tenToNineteen = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    public static void main(String[] args) {
        int sol = 0;
        for (int i = 1; i <= 1000; i++) {
            sol += toEnglish(i).length();
            //System.out.println(toEnglish(i)+" "+i);
        }
        System.out.println(sol);
    }
    public static String toEnglish(int x){
        if(x<100){
            if(x<10){
                return ones[x]; //number from 1-9
            }
            if(x>=10 && x<20){
                return tenToNineteen[x-10]; //number from 10-19
            }
            if(x%10 ==0 && x <=90){
                return tens[x/10]; //numbers from twenty to ninety
            }
            return tens[x/10]+toEnglish(x%10); // composite numbers from 20-99
        }else{
            if(x==1000){
                return "onethousand"; //handling 1000
            }
            if(x%100==0){
                return toEnglish(x/100)+"hundred"; //numbers in the form x hundred
            }
            return toEnglish(x/100)+"hundredand" + toEnglish(x%100);  //composite numbers
        }
    }

}
