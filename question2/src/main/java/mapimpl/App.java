package mapimpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        // Load the Spring configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        // Retrieve the myMap bean
        Map<Integer, String> myMap = (Map<Integer, String>) context.getBean("myMap1");

        System.out.print("hello");
        // Access and use the map
        System.out.println("myMap:");
        for (Map.Entry<Integer, String> entry : myMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}


