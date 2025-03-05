package top.sob.xxx.spring;

import org.springframework.context.annotation.Import;
import top.sob.xxx.spring.configuration.XXXConfiguration;

import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(XXXConfiguration.class)
public @interface EnableXXX {
}
