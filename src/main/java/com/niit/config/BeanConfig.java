package com.niit.config;

import com.niit.domain.Department;
import com.niit.domain.Employee;
import org.springframework.context.annotation.Bean;

public class BeanConfig {

    @Bean
    public Employee getEmployee(){
        return new Employee(179, "Initial Employee", "House- 47, Mg-Road", getDepartment());
    }

    @Bean
     public Department getDepartment(){
         return new Department("IOC Department","6.0.5");
     }
}
