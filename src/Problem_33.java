package src;
public class Problem_33 {
    public static void main(String[] args) {
        int numer = 1;
        int denom = 1;
        for (int d = 10; d < 100; d++) {
            for (int n = 10; n < d; n++) {
                int n0 = n % 10, n1 = n / 10;
                int d0 = d % 10, d1 = d / 10;
                if (n1 == d0 && n0 * d == n * d1 || n0 == d1 && n1 * d == n * d0) {
                    numer *= n;
                    denom *= d;
                }
            }
        }
        System.out.println(denom / gcd(numer,denom));
    }
    public static int gcd(int x,int y) {
        if (y == 0)
            return x;
        else
            return gcd(y, x % y);
    }
}
