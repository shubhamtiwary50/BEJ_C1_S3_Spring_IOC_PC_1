package com.niit;

import com.niit.config.BeanConfig;
import com.niit.domain.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        System.out.println( "Hello World!" );
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
        Employee employee = applicationContext.getBean(Employee.class);
        System.out.println(employee);
    }
}
