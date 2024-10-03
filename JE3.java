import java.util.Scanner;

    public class JE3 {
    public static void GreaterNumber( int a, int b) {
        if(a>b) {
            System.out.print("a is  greater than b");
        } else {
            System.out.print("a is less than b");
        }
         
    } 
         
    public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) { 
        System.out.print("enter number a:");
        int a = sc.nextInt();
        System.out.print("enter number b:"); 
          int b = sc.nextInt(); 
         GreaterNumber(a, b);
    }
    }
}
