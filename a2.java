import java.util.Scanner;

public class a2 {
    public static void main(String[] args) {
        System.out.print("Enter size:");
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            String name[] = new String[size];
            for (int i = 0; i < size; i++) {
                name[i] = sc.next();
            }
            for (int i = 0; i < name.length; i++) {
                System.out.println("name " + (i + 1) + " is " + name[i]);
            }
        }

    }
}
