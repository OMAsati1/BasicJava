import java.util.Scanner;

public class JE4 { 
    public static double circumference(double r) {
       double circumference =  (2 * Math.PI * r);
       return circumference ;
    }
    public static void main(String[] args) { 
        System.out.print("enter the radius of circle:");
       try (Scanner sc = new Scanner(System.in)) {
        double r = sc.nextDouble(); 
        System.out.print("its circumference:");
        System.out.println(circumference(r));
    }
    }
}
