package src;
public class Problem_36 {
    public static void main(String[] args) {
        int sol=0;
        for (int i = 1; i <1000000 ; i++) {
            if(isPalindrome(i+"") && isPalindrome(Integer.toBinaryString(i))){
                sol+=i;
            }
        }
        System.out.println(sol);
    }
    public static boolean isPalindrome(String str) {
        String rev = "";
        boolean ans = false;
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            ans = true;
        }
        return ans;
    }
}
