package com.example.demo.bootstrap;

import com.example.demo.domain.Employee;
import com.example.demo.repositories.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final EmployeeRepository employeeRepository;

    public BootStrapData(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Employee jake = new Employee(1L, "jake", "AUS");

        employeeRepository.save(jake);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Employee: " + employeeRepository.count());
    }
}
