import java.util.Scanner;

public class JE5 { 
    public static void activeVoter(int n) {
        if(n>18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote"); 
        }
    }
    public static void main(String[] args) { 
        System.out.print("Enter candidate age:");
       try (Scanner sc = new Scanner(System.in)) {
        int n = sc.nextInt();
           activeVoter(n);
    } 
    }
}
