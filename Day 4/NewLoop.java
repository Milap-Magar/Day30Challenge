import java.util.Arrays;
import java.util.List;

public class NewLoop {
    public static void main(String[] args) {
        // Array
        String[] fruits = {"Apple", "Banana", "Cherry"};
        System.out.println("Array elements:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // List
        List<String> colors = Arrays.asList("Red", "Green", "Blue");
        System.out.println("\nList elements:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
