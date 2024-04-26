// ex 511 
    
import java.util.Scanner;

public class FindSmallestValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        int count = 5;
        int[] values = {7, 2, 10, 5, 3};

     
        int smallest = values[0];
        for (int i = 1; i < count; i++) {
            if (values[i] < smallest) {
                smallest = values[i];
            }
        }

       
        System.out.println("The smallest value is: " + smallest);

        scanner.close();
    }
}
