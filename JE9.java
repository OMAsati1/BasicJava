import java.util.Scanner;

public class JE9 {
    public static void main(String[] args) { 
        System.out.print("write how many term do you want to print:");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
      int n1 = 0; int n2 = 1; int sum = 0; 
      System.out.print(n1+" "+n2);
   
   for(int i=2; i<n; i++) {
      System.out.print(" "+sum);
      sum=n1+n2;
      n1=n2;
      n2=sum; 
   }
        }
    }
}
