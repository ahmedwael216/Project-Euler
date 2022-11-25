package src;

public class Problem_7 {
    public static void main(String[] args){
        long i=2; // skipping false positives at i=0 and i=1
        int counter=0;
        while(true){
            if (isPrime(i)){
                counter++;
            }
            if(counter == 10001){
                break;
            }
            i++;
        }
        System.out.println(i);
    }
    public static  boolean isPrime(long num)
    {
        for(int i=2;i<=num/2;i++)        {
            if((num%i)==0){
                return  false;
            }
        }
        return true;
    }
}
