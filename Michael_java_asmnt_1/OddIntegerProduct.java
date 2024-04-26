// ex 512 {
    
    public class OddIntegerProduct {
        public static void main(String[] args) {
            int product = 1;
    
            // Calculate the product of odd integers from 1 to 15
            for (int i = 1; i <= 15; i += 2) {
                product *= i;
            }
    
            // Display the result
            System.out.println("The product of odd integers from 1 to 15 is: " + product);
        }
    }
