public class Lab1 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int n = 0;
        int m = 0;

        final int C = 1;

        double s = 0;
        boolean wasNoDivisionByZero = true;
        for (int i = a; i <= n; i++) {
            if (i + C == 0) {
                System.out.println("Error! Division by zero.");
                wasNoDivisionByZero = false;
                break;
            } else {
                for (int j = b; j <= m; j++) {
                    s += (double) (i + j) / (i + C);
                }
            }
        }

//        if (s != 0) {
        if (wasNoDivisionByZero) {
            System.out.println("S = " + s);
        }
    }
}
