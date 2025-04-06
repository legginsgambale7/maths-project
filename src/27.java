public class MathOperations {
    public static void main(String[] args) {
        // Example: Add two numbers
        int num1 = 5;
        int num2 = 3;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + (num1 + num2));

        // Example: Calculate the area of a rectangle
        double width = 4.0;
        double height = 6.0;
        double area = width * height;
        System.out.println("The area of the rectangle with dimensions " + width + " x " + height + " is: " + area);

        // Example: Compare two numbers and print "greater" if first number is greater
        int num3 = 10;
        int num4 = 5;
        if (num3 > num4) {
            System.out.println("The first number is greater than the second number.");
        } else {
            System.out.println("The second number is greater than the first number.");
        }
    }
}
