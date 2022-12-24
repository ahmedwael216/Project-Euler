package src;
public class Problem_39 {
    public static void main(String[] args) {
        int maxPerimeter = 0;
        int maxTriangles = 0;
        for (int p = 1; p <= 1000; p++) {
            int triangles = countSolutions(p);
            if (triangles > maxTriangles) {
                maxTriangles = triangles;
                maxPerimeter = p;
            }
        }
        System.out.println(maxPerimeter);
    }
    public static int countSolutions(int p) {
        int count = 0;
        for (int a = 1; a <= p; a++) {
            for (int b = a; b <= p; b++) {
                int c = p - a - b;
                if (b <= c && a * a + b * b == c * c)
                    count++;
            }
        }
        return count;
    }
}
