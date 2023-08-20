import java.util.Scanner;

public class TrigSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter angle in radians: ");
        double angle = scanner.nextDouble();

        int numTerms = 10; // Number of terms in the series

        double sinValue = computeSin(angle, numTerms);
        double cosValue = computeCos(angle, numTerms);

        System.out.println("Sine(" + angle + ") = " + sinValue);
        System.out.println("Cosine(" + angle + ") = " + cosValue);

        scanner.close();
    }

    // Function to compute sine series
    public static double computeSin(double x, int terms) {
        double result = 0.0;
        for (int n = 0; n < terms; n++) {
            result += Math.pow(-1, n) * (Math.pow(x, 2 * n + 1) / factorial(2 * n + 1));
        }
        return result;
    }

    // Function to compute cosine series
    public static double computeCos(double x, int terms) {
        double result = 0.0;
        for (int n = 0; n < terms; n++) {
            result += Math.pow(-1, n) * (Math.pow(x, 2 * n) / factorial(2 * n));
        }
        return result;
    }

    // Function to compute factorial
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
