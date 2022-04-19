package com.example.demo.Controllers;

import com.example.demo.repositories.EmployeeRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

    private final EmployeeRepository employeeRepository;
    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @RequestMapping("/employees")
    public String getRecords(Model model) {
        model.addAttribute("employees", employeeRepository.findAll());

        return "employees/list";
    }

    @RequestMapping("/employees/clean")
    public void cleanEmployees() {
        employeeRepository.deleteAll();
    }

}
