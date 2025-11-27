package com.example.DemoProject.Repository;

import com.example.DemoProject.Modal.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class EmployeeRepository {

    private List<Employee> employees = new ArrayList<>(Arrays.asList(
            new Employee(1, "John Doe", "778787878", "IT"),
            new Employee(2, "Jane Smith", "778787878", "HR"),
            new Employee(3, "Mike Johnson", "778787878", "Finance")
    ));

    public List<Employee> getEmployees() {
        return employees;
    }

    public void saveEmployee(Employee employee) {
          employees.add(employee);

    }

    public Employee getEmployee(int empId) {

        return employees.stream()
                .filter(employee -> employee.getId() == empId)
                .findFirst()
                .orElse(null);
    }
}
