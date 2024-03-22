package AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        // Create the Spring application context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AOPConfig.class);

        // Retrieve the Triangle bean from the context
        Triangle triangle = context.getBean(Triangle.class);

        // Call the method to trigger AOP
        triangle.calculatePerimeter();

        // Close the context
        context.close();
    }
}
