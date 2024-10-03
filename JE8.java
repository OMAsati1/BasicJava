import java.util.Scanner;

public class JE8 { 

    public static void GreatestCommonDivisor(int a, int b) {
        int n = Math.min(a, b);
        int gcd = 0;
       for(int i=1; i<=n; i++) {
        if(a%i == 0 & b%i == 0) {
            gcd =i;
        }
        
        } System.out.println("their hcf is: "+gcd);
    int lcm = a*b/gcd;
    System.out.println("their lcm is: "+lcm);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) { 
            System.out.print("enter the 1st number:");
            int a = sc.nextInt();
            System.out.print("enter the 2nd number:");
            int b = sc.nextInt();
            GreatestCommonDivisor(a,b);
        }
        
    }
}
