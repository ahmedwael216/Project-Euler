package src;
public class Problem_10 {
    public static void main(String[] args){
        boolean[] primes=sieve(2000000);
        long sum=0;
        for(int i=0;i<primes.length;i++){
            if(primes[i]){
                sum+=i;
            }
        }
        System.out.println(sum);
    }

    public static boolean[] sieve(int n){
        boolean[] sieve = new boolean[n+1];
        for (int i = 2; i <= n; i++) {
            sieve[i] = true;
        }

        for (int factor = 2; factor*factor <= n; factor++) {
            // if factor is prime, then mark multiples of factor as non-prime
            if (sieve[factor]) {
                for (int j = factor; factor*j <= n; j++) {
                    sieve[factor*j] = false;
                }
            }
        }
        return sieve;
    }
}
