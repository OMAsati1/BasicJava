import java.util.Scanner;

public class fuct1 { 
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
     try (Scanner sc = new Scanner(System.in)) {
        String name = sc.next();
         printMyName(name);
    }   
    }
}
