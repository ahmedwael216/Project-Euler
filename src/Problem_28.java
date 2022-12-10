package src;


public class Problem_28 {
    public static void main(String[] args) {
        int dimension = 1001;
        int n= (dimension-1)/2;

        int sol = (3 + 2 * n * ( 8*n*n + 15*n + 13)) / 3;
        System.out.println(sol);
    }
}
