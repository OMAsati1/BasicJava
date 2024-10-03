public class hw3 {

    public static void main(String[] args) {
        
        
        for( int i =1; i<=5; i++) {
            for(int j = 1; j<=5-i; j++) {
                System.out.print(" ");
            } int number = 1;
            for(int k = 1; k<=i; k++) {
          System.out.print(number+" "); 
          number = number*(i-k)/(k);
            } System.out.println();
        }
    }
}