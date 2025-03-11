import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        Random rand = new Random();
        int num = rand.nextInt(100) + 1;
        
        System.out.println("Generated number: " + num);
    }
}