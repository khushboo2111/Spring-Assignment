package sampleproject2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringJavaConfig {

	@Bean(name = "triangle1")
	public Triangle employee1() {
		return new Triangle(101, 102,103);
	}
}
