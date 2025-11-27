package com.example.DemoProject.Controller;

import com.example.DemoProject.Modal.Employee;
import com.example.DemoProject.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/emp")
    public List<Employee> getEmployee() {
       return this.employeeService.getEmployees();
    }

    @GetMapping("/emp/{empId}")
    public Employee getEmployee(@PathVariable("empId") int empId){
        return this.employeeService.getEmployee(empId);
    }

    @PostMapping("/emp")
    public Employee saveEmp(@RequestBody Employee employee){
        this.employeeService.saveEmployee(employee);
        return employee;
    }




}