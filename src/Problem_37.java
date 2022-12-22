package src;
public class Problem_37 {
    public static void main(String[] args) {
        long sum = 0;
        int n=10;
        int count=0;
        while(count<11) {
            if (isTruncatablePrime(n)) {
                sum += n;
                count++;
            }
            n++;
        }
        System.out.println(sum);
    }
    public static boolean isTruncatablePrime(int n) {
        for (long i = 10; i <= n; i *= 10) {
            if (!isPrime(n % (int)i)) {
                return false;
            }
        }
        for (; n != 0; n /= 10) {
            if (!isPrime(n)) {
                return false;
            }
        }

        return true;
    }
    public static  boolean isPrime(int num){
        if(num==2){
            return true;
        }
        if(num<2 || num%2 ==0){
            return false;
        }
        for(int i=3;i * i <=num;i+=2){
            if((num%i)==0){
                return  false;
            }
        }
        return true;
    }
}
