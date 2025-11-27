package com.example.DemoProject.Modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Employee {

    private Integer id;
    private String name;
    private String mobileNumber;
    private String dept;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }

    public Employee(Integer id, String name, String mobileNumber, String dept) {
        this.id = id;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.dept = dept;
    }
}
