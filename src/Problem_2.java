package src;

public class Problem_2 {
    public static void main(String[] args){
        int sum=0;
        int f1=1;
        int f2=1;
        while((f1+f2)<4000000){
            if((f1+f2)%2==0){
                sum+=(f1+f2);
            }
            int temp=f1;
            f1=f2;
            f2=temp+f1;
        }
        System.out.println(sum);
    }
}
