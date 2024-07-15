import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        // Create an instance of the Random class
        Random random = new Random();

        // Generate a random integer
        int randomInt = random.nextInt();
        System.out.println("Random Integer: " + randomInt);

        // Generate a random integer between 0 (inclusive) and 100 (exclusive)
        int randomIntInRange = random.nextInt(100);
        System.out.println("Random Integer (0-99): " + randomIntInRange);

        // Generate a random double between 0.0 and 1.0
        double randomDouble = random.nextDouble();
        System.out.println("Random Double: " + randomDouble);

        // Generate a random boolean
        boolean randomBoolean = random.nextBoolean();
        System.out.println("Random Boolean: " + randomBoolean);

        // Generate a random float between 0.0 and 1.0
        float randomFloat = random.nextFloat();
        System.out.println("Random Float: " + randomFloat);

        // Generate a random long
        long randomLong = random.nextLong();
        System.out.println("Random Long: " + randomLong);
    }
}
