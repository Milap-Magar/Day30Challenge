import java.util.Arrays;
import java.util.List;

public class LambdaExample {
    
    // 1.
    // (parameters) -> expression

    // 2.
    // (parameters) -> {
    //     // multiple statements
    // }

    public static void main(String[] args) {
        // List of names
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Using lambda expression to print each name
        names.forEach(name -> System.out.println(name));
        
        // Using lambda expression with a functional interface
        GreetingService greetingService = message -> System.out.println("Hello " + message);
        greetingService.sayMessage("World");
    }

    // Functional interface
    @FunctionalInterface
    interface GreetingService {
        void sayMessage(String message);
    }
}
