package src;


import java.math.BigInteger;
import java.util.HashSet;

public class Problem_29 {
    public static void main(String[] args) {
        HashSet<BigInteger> hs =new HashSet<>();
        for (int a = 2; a <= 100; a++) {
            for (int b = 2; b <= 100; b++) {
                hs.add(BigInteger.valueOf(a).pow(b));
            }
        }
        System.out.println(hs.size());
    }
}
