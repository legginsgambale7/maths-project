public class MathOperations {
    public static void main(String[] args) {
        int sum = 0;
        int product = 1;
        
        for (int i = 1; i <= 5; i++) {
            sum += i;
            product *= i;
        }
        
        System.out.println("The sum of the first 5 natural numbers is: " + sum);
        System.out.println("The product of the first 5 natural numbers is: " + product);
    }
}
