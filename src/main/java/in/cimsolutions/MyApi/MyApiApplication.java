package in.cimsolutions.MyApi;

import in.cimsolution.MyApi.controllers.Hello;
import in.cimsolutions.MyApi.config.SecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = {SecurityConfig.class, Hello.class})
public class MyApiApplication {

    public static void main(String[] args) {
//        System.out.println("Main");
        SpringApplication.run(MyApiApplication.class, args);
    }

}
