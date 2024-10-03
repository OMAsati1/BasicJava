import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        try (// Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in)) {
            // Prompt the user to enter a number
            System.out.print("Enter a number: ");
            
            // Read the number from the user
            int number = scanner.nextInt();
            
            // Print the multiplication table
            System.out.println("Multiplication table for " + number + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " * " + i + " = " + (number * i));
            }
        }
  }
}
