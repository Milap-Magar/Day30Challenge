package Basics.Spring;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Rest {
        @GetMapping("/hello")
        public String sayHello() {
            return "Hello, Spring Boot!";
        }
    }

