package src;
public class Problem_12 {
    public static void main(String[] args){
        int num=0;
        for(int i=1; ;i++){
            if(countDevisors(num)>500){
                break;
            }
            num+=i;
        }
        System.out.println(num);
    }
    public static int countDevisors(int x){
        int count=0;
        for (int i = 1; i < Math.sqrt(x); i++) {
            if(x % i ==0){
                count +=2;
            }
        }
        if(Math.sqrt(x)*Math.sqrt(x)==x){ //perfect square
            count++;
        }
        return count;
    }
}
