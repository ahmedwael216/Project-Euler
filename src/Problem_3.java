package src;

public class Problem_3 {
    public static void main(String[] args){
        long n= 600851475143L;
        long latest =0;
        for(int i = 2; i< n; i++) {
            while(n % i == 0) {
                latest=i;
                n = n / i;
            }
        }
        if(n >2 ) {
            latest=n;
        }
        System.out.println(latest);
    }
}
