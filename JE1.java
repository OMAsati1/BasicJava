import java.util.Scanner;

public class JE1 { 
    public static float printAverage(float a, float b, float c) { 
        
     return (a+b+c)/3;
    }
    public static void main(String[] args) { 
        System.out.println("enter any 3 numbers:");
    try (Scanner sc = new Scanner(System.in)) {
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        
        System.out.println(" average of the above numbers: "+printAverage(a, b, c)); 
        
    }    
    }
}
