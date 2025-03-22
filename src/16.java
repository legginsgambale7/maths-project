public class MathOperation {
    public static void main(String[] args) {
        // Example 1: Addition
        System.out.println("Adding two numbers: " + (a + b));

        // Example 2: Subtraction
        System.out.println("Subtracting two numbers: " + (result - a));

        // Example 3: Multiplication
        System.out.println("Multiplying two numbers: " + (a * b));

        // Example 4: Division
        if (b != 0) {
            System.out.println("Dividing two numbers: " + (a / b));
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }

    private int a;
    private int b;

    public MathOperation() {
        this.a = 10; // Example value for 'a'
        this.b = 2;
    }
}
