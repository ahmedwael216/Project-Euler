package src;
public class Problem_9 {
    public static void main(String[] args){
        for(int i=1;i<1000;i++){
            for (int j = i+1; j < 1000 ; j++) {
                int k=1000-i-j;
                if(i*i+j*j==k*k){
                    System.out.println(i*j*k);
                }
            }
        }
    }
}
