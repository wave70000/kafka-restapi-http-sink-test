package com.example.demo.Controllers;

import com.example.demo.domain.Employee;
import com.example.demo.pojo.EmployeePOJO;
import com.example.demo.repositories.EmployeeRepository;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class RestApiController {

    private final EmployeeRepository employeeRepository;
    public RestApiController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    Gson gson = new Gson();

    @PostMapping("/api")
    public String api(@RequestBody String message) {
        try {
            EmployeePOJO employeeParser = gson.fromJson(message.replaceAll("\\s",""), EmployeePOJO.class);
            Employee employee = new com.example.demo.domain.Employee(
                    employeeParser.EmployeesId,
                    employeeParser.Name,
                    employeeParser.Location,
                    employeeParser.__deleted
            );
            employeeRepository.save(employee);
            System.out.println(employeeRepository.findById(employeeParser.EmployeesId));
        } catch (Exception e) {
            System.out.println(e);
        }

        return message;
    }
}
