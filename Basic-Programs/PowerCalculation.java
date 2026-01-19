import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take inputs
        System.out.print("Enter the base number: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble();

        // Calculate power
        double result = Math.pow(base, exponent);

        // Display result
        System.out.println("Result: " + result);

        scanner.close();
    }
}
