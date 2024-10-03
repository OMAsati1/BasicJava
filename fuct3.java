import java.util.Scanner;

public class fuct3 { 
    public static void tellNumberType( int num) {
    { if(num<1) {
        System.out.println("not prime");
        return;
    }}


    
     { int count = 0;
        
        for(int i=1; i<=num; i++) {
            if(num%i == 0) {
                count++;
            }
        } if(count==2) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }   
}    
     
    public static void main(String[] args) {
        System.out.println("enter the number to know whether it is prime or not");
     try (Scanner sc = new Scanner(System.in)) {
        int num = sc.nextInt();
        
        
        
tellNumberType(num);;
    }
}
}