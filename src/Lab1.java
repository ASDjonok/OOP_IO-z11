public class Lab1 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int n = -1;
        int m = 0;

        final int C = 1;

        if ((a <= -C) && (-C <= n)) {
            System.out.println("Error! Division by zero.");
        } else {
            double s = 0;
            for (int i = a; i <= n; i++) {
                for (int j = b; j <= m; j++) {
                    s += (double) (i + j) / (i + C);
                }
            }
            System.out.println("S = " + s);
        }
    }
}
