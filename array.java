import java.util.Scanner;

public class array {
    public static void main(String[] args) { 
        System.out.print("enter size:");
    try (Scanner sc = new Scanner(System.in)) { 
        int size = sc.nextInt();
        System.out.println("enter input:");
        //int[]marks = new int[3];
        int numbers[] = new int[size];
        // marks[0]=75;
        // marks[1]=89;
        // marks[2]=85;
        // // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        for(int i = 0; i<size;i++) {
            numbers[i] = sc.nextInt();
        } 
        System.out.print("enter number 'x3' from input in order to know its index:");
int x = sc.nextInt();

        for(int i = 0; i<numbers.length;i++) {
           if(numbers[i]==x) {
           System.out.println("x found at index:"+i);
           }
        }
    }
}
}