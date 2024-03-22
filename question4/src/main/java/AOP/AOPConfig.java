package AOP;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AOPConfig {

    @Bean
    public Triangle triangle() {
        return new Triangle(0, 0, 0); // Provide appropriate values for sides
    }

    @Bean
    public TriangleAop triangleAop() {
        return new TriangleAop();
    }
}
