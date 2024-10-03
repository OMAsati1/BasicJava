import java.util.Scanner;

public class fuct4 { 
    public static void tellEvenOrNot(int n) {
        if(n%2 == 0) {
            System.out.println("even"); 
        } else {
            System.out.println("not even");
        }
    }
   public static void main(String[] args) {
    System.out.println("enter number to know it is even or not:");
    try (Scanner sc = new Scanner(System.in)) {
        int n = sc.nextInt();
       tellEvenOrNot(n); 
    }
   } 
}
