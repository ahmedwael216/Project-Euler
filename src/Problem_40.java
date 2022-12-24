package src;
public class Problem_40 {
    public static void main(String[] args) {
        int i=1;
        StringBuilder sb=new StringBuilder();
        while(sb.length()<1000000){
            sb.append(i);
            i++;
        }
        String s=sb.toString();
        int sol= Integer.parseInt(s.charAt(1-1)+"")*Integer.parseInt(s.charAt(10-1)+"")*Integer.parseInt(s.charAt(100-1)+"")*Integer.parseInt(s.charAt(1000-1)+"")*Integer.parseInt(s.charAt(10000-1)+"")*Integer.parseInt(s.charAt(100000-1)+"")*Integer.parseInt(s.charAt(1000000-1)+"");
        System.out.println(sol);
    }
}
