import java.util.Scanner;

public class circle {
    public static void main(String[] args) { 
        System.out.print("enter radius of circle:");
        try (Scanner sc = new Scanner(System.in)) {
            double r = sc.nextInt();
            
            
            
            double area = Math.PI*Math.pow(r,2);
            
            double circumference = 2*Math.PI*r;
            System.out.println("circumference:");
            
System.out.println(circumference);
System.out.println("area:");
System.out.println(area);

        }
    }
}
