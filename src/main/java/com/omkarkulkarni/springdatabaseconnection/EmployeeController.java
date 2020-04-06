package com.omkarkulkarni.springdatabaseconnection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping(path = "/addEmployee")
    public String addEmployee(@RequestBody Employee employee) {
        employeeRepository.save(employee);
        return "Saved";
    }

    @GetMapping(path = "/getAll")
    public @ResponseBody Iterable<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
