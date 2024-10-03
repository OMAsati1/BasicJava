import java.util.Scanner;

public class aa3 {
    public static void main(String[] args) { 
        System.out.print("enter size of rows:"); 
        try (Scanner sc = new Scanner(System.in)) {
            int rows = sc.nextInt(); 
            System.out.print("enter size of cloumns:");
            int cols = sc.nextInt();
            int[][] numbers = new int[rows][cols];
            System.out.println("enter input:");
            for(int i = 0; i<rows;i++) { 
                for(int j = 0; j<cols;j++) {
                    numbers[i][j] = sc.nextInt();
                }
            } System.out.println("The transpose is:");
            
            for(int j=0;j<rows;j++) {
                for(int i=0;i<cols;i++) {
                    
                        System.out.print(numbers[i][j]+" ");
                    } System.out.println();
                } 
                
            }
        }
    }

