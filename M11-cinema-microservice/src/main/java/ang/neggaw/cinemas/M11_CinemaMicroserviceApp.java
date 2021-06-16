package ang.neggaw.cinemas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class M11_CinemaMicroserviceApp {
    public static void main(String[] args) {
        SpringApplication.run(M11_CinemaMicroserviceApp.class, args);
    }
}
