package com.example.DemoProject.Service;

import com.example.DemoProject.Modal.Employee;
import com.example.DemoProject.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    public List<Employee> getEmployees(){
        return this.employeeRepository.getEmployees();
    }

    public void saveEmployee(Employee employee) {
         this.employeeRepository.saveEmployee(employee);
    }

    public Employee getEmployee(int empId) {
        return this.employeeRepository.getEmployee(empId);
    }
}
