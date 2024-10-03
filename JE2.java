import java.util.Scanner;

public class JE2 { 
    public static void printOddNUmbers(int n) {
        for(int i =1; i<=n; i++) { 
        System.out.println(2*i-1);
        }
    }
public static void main(String[] args) { 
    System.out.print("enter how many first n odd number do you want to print:");
 try (Scanner sc = new Scanner(System.in)) {
    int n = sc.nextInt();
    printOddNUmbers(n);
} 
    
}
}    

