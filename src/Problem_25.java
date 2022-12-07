package src;
import java.math.BigInteger;
import java.util.Arrays;

public class Problem_25 {
    public static void main(String[] args) {
        BigInteger prev = BigInteger.ZERO;
        BigInteger fib = BigInteger.ONE;
        int index = 1;
        while(fib.toString().length()!=1000){
            index++;
            BigInteger temp =fib.add(prev);
            prev = fib;
            fib =temp;
        }
        System.out.println(index);
    }
}
