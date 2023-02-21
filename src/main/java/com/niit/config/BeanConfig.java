package com.niit.config;

import com.niit.domain.Department;
import com.niit.domain.Employee;
import org.springframework.context.annotation.Bean;

public class BeanConfig {

    @Bean
    public Employee getEmployee(){
        return new Employee();
    }

    @Bean
     public Department getDepartment(){
         return new Department("IOC Department","6.0.5");
     }
}
