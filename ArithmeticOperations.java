import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        // Arithmetic operations
        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;
        double modulus = num1 % num2;

        // Display results
        System.out.println("\nResults:");
        System.out.println("Addition = " + addition);
        System.out.println("Subtraction = " + subtraction);
        System.out.println("Multiplication = " + multiplication);
        System.out.println("Division = " + division);
        System.out.println("Modulus = " + modulus);

        // Increment and Decrement
        num1++;
        num2--;

        System.out.println("\nAfter Incrementing first number:");
        System.out.println("num1 = " + num1);

        System.out.println("\nAfter Decrementing second number:");
        System.out.println("num2 = " + num2);

        sc.close();
    }
}