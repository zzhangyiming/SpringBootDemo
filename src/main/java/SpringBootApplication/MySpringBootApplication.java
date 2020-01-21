package SpringBootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com")
public class MySpringBootApplication {


    public static void main(String[] args) {
        SpringApplication.run(MySpringBootApplication.class);
    }

}
