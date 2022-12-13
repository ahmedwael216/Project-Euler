package src;


public class Problem_31 {
    public static void main(String[] args) {
        final int TOTAL = 200;
        int[] COINS = {1, 2, 5, 10, 20, 50, 100, 200};
        int[][] ways = new int[COINS.length + 1][TOTAL + 1];
        ways[0][0] = 1;
        for (int i = 0; i < COINS.length; i++) {
            int coin = COINS[i];
            for (int j = 0; j <= TOTAL; j++)
                ways[i + 1][j] = ways[i][j] + (j >= coin ? ways[i + 1][j - coin] : 0);
        }
        System.out.println(ways[COINS.length][TOTAL]);
    }
}
