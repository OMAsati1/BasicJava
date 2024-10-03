import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("Menu:");
            System.out.println("1. Enter student's marks");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter student's marks (out of 100): ");
                    int marks = scanner.nextInt();
                    printGrade(marks);
                    break;
                case 0:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1 or 0.");
            }
        } while (choice != 0);
        
        scanner.close();
    }
    
    public static void printGrade(int marks) {
        if (marks >= 90) {
            System.out.println("This is Good");
        } else if (marks >= 60) {
            System.out.println("This is also Good");
        } else if (marks >= 0) {
            System.out.println("This is Good as well\nBecause marks don't matter but our effort does.");
        } else {
            System.out.println("Invalid marks entered.");
        }
    }
}