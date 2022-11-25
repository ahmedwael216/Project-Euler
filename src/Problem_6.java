package src;

public class Problem_6 {
    public static void main(String[] args){
        int sum = (100*101)/2;
        int squareOfSum = (int) Math.pow(sum,2);
        int sumOfSquares = (100*101*201)/6;
        int sol=squareOfSum-sumOfSquares;
        System.out.println(sol);
    }


}
