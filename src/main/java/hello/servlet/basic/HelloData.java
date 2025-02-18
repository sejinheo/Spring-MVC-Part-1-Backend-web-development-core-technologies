package hello.servlet.basic;

import jakarta.servlet.annotation.WebServlet;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class HelloData {
    private String username;
    private int age;

}
