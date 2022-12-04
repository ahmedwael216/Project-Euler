package src;

public class Problem_19 {
    public static void main(String[] args) {
        int sol=0;
        for (int y = 1901; y <= 2000; y++) {
            for (int m = 1; m <= 12; m++) {
                if (dayOfWeek(y, m, 1) == 0) { // Sunday
                    sol++;
                }
            }
        }
        System.out.println(sol);
    }

    private static int dayOfWeek(int year, int month, int day) {
        // Zeller's congruence algorithm
        int m = (month - 3 + 4800) % 4800;
        int y = (year + m / 12) % 400;
        m %= 12;
        return (y + y/4 - y/100 + (13 * m + 2) / 5 + day + 2) % 7;
    }

}
