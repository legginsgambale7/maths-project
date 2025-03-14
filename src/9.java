import java.util.Random;

public class MathProject {
    public static void main(String[] args) {
        Random rand = new Random();
        int num1 = rand.nextInt(20);
        int num2 = rand.nextInt(20);
        System.out.println("The sum of " + num1 + " and " + num2 + " is:");
    }
}
