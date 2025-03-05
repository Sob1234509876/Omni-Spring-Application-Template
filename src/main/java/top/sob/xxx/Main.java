package top.sob.xxx;

import org.springframework.boot.SpringApplication;
import top.sob.xxx.spring.configuration.XXXConfiguration;

public final class Main {
    public static void main(String[] args) {
        SpringApplication.run(XXXConfiguration.class, args);
    }
}
