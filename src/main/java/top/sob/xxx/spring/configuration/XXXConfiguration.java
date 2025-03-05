package top.sob.xxx.spring.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import top.sob.xxx.spring.controller.XXXController;
import top.sob.xxx.spring.service.XXXService;

@SpringBootApplication
@Configuration
@Import(XXXServiceConfiguration.class)
public class XXXConfiguration {

    @Autowired
    XXXService xxxService;

    @Bean("xxxController")
    public XXXController getXXXController() {
        return new XXXController(xxxService);
    }

}
