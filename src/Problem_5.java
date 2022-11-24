package src;

public class Problem_5 {
    public static void main(String[] args){
        int[] arr = new int[20];
        for(int i=0;i<20;i++){
            arr[i]=i+1;
        }
        long sol=1;
        for(int i=0;i<20;i++){
            sol=lcm(sol,arr[i]);
        }
        System.out.println(sol);
    }
    public static long gcd(long x,long y) {
        if (y == 0)
            return x;
        else
            return gcd(y, x % y);
    }

    public static long lcm(long x, long y){
        return (x*y)/gcd(x,y);
    }
}
