import java.util.*;

public class a3 {
    public static void main(String args[]) {
        System.out.print("enter size:");
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            int numbers[] = new int[size];
            System.out.println("enter input:");

            // input
            for (int i = 0; i < size; i++) {
                numbers[i] = sc.nextInt();
            }

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] < min) {
                    min = numbers[i];
                }
                if (numbers[i] > max) {
                    max = numbers[i];
                }
            }

            System.out.println("Largest number is : " + max);
            System.out.println("Smallest number is : " + min);
        }

    }
}