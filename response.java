import java.util.Scanner;

public class response {
    public static void main(String[] args) {
         System.out.println("enter 1 or 0");
         System.out.println("(click 1 for getting compliment on your marks)");
                try (Scanner sc = new Scanner(System.in)) {
                    int button = sc.nextInt();
        
                    switch(button) {
                        case 1 : System.out.print("enter your score out of 100: "); {
int marks = sc.nextInt();
if(marks>=90) { 
    System.out.println("this is good");
} else if(marks>=60) {
    System.out.println("this is also good");
} else if(marks>=0) {
    System.out.println("this is bad");
} else {
    System.out.println("invalid marks");
}
                        }
                        break;
                        case 0 : System.out.println("exit");
                        break;
                        default : System.out.println("invalid button");
          
    }
}
}
}