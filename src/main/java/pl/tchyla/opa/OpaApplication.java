package pl.tchyla.opa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class OpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpaApplication.class, args);
    }


}
