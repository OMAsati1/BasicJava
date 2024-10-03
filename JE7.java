import java.util.Scanner;

public class JE7 { 
    public static double calculateExponent(double x, double n) {
        double result =  Math.pow(x, n);
     return  result;
    }

    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) { 
        System.out.print("enter the base:");
        int x = sc.nextInt(); 
        System.out.print("enter the power:");
           int n = sc.nextInt();
         System.out.print("Result:"+calculateExponent(x, n));
    }
    }
}
