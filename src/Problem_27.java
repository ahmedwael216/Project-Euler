package src;


public class Problem_27 {
    public static void main(String[] args) {
        int maxa=Integer.MIN_VALUE;
        int maxb=Integer.MIN_VALUE;
        int maxNumberOfPrimes =0;
        for (int i = -999; i < 1000; i++) {
            for (int j = -999; j < 1000 ; j++) {
                int val = 2;
                int n=-1;
                while(isPrime(val)){
                    val = n*n + i*n + j;
                    n++;
                }
                if(n>maxNumberOfPrimes){
                    maxa=i;
                    maxb=j;
                    maxNumberOfPrimes=n;
                }
            }
        }
        System.out.println(maxa*maxb);
    }

    public static  boolean isPrime(int num){
        if(num<2){
            return false;
        }
        for(int i=2;i * i <=num;i++){
            if((num%i)==0){
                return  false;
            }
        }
        return true;
    }

}