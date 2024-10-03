import java.util.Scanner;

public class fuct5 {
    public static void PrintTable(int n) {
        for(int i = 1; i<=10; i++) {
System.out.println(n*i);
        }
    }
public static void main(String[] args) { 
    System.out.print("enter the number:");
    
    try (Scanner sc = new Scanner(System.in)) {
        int n = sc.nextInt();
        PrintTable(n);
    }
}
    }  
    

