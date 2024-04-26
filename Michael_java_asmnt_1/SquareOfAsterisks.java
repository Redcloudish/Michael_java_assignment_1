// ex 4.30 
    
import java.util.Scanner;

public class SquareOfAsterisks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the square
        System.out.print("Enter the size of the side of the square (1-20): ");
        int size = scanner.nextInt();

        // Validate the input size
        if (size < 1 || size > 20) {
            System.out.println("Invalid size. Please enter a size between 1 and 20.");
            return;
        }

        // Display the hollow square of asterisks
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size || j == 1 || j == size) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}