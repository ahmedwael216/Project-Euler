package src;

public class Problem_4 {
    public static void main(String[] args){
        int sol=0;
        for(int i=100;i<1000;i++){
            for(int j=100;j<1000;j++){
                int prod=i*j;
                if(isPalindrome(prod) && prod > sol){
                    sol=prod;
                }
            }
        }
        System.out.println(sol);
    }
    public static boolean isPalindrome(int x) {
        String s=x+"";
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)==s.charAt(s.length()-1-i)){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}
