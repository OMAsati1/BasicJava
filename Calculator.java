import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Taking input from the user
            System.out.print("Enter the first number: ");
            double a = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double b = scanner.nextDouble();

            System.out.print("Enter the operation (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            double result;

            // Performing the operation based on the operator entered
            switch (operator) {
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                    result = a * b;
                    break;
                case '/':
                    if (b != 0) {
                        result = a / b;
                    } else {
                        System.out.println("Error: Cannot divide by zero");
                        return;
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operation");
                    return;
            }

            System.out.println("Result: " + result);
        }
    }
}