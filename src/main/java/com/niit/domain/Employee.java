package com.niit.domain;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;

public class Employee {

    private int empId;
    private String empName;
    private String empAddress;
    @Autowired
    private Department department;

    public Employee() {
    }

    public Employee(int empId, String empName, String empAddress, Department department) {
        this.empId = empId;
        this.empName = empName;
        this.empAddress = empAddress;
        this.department = department;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getEmpId() == employee.getEmpId() && Objects.equals(getEmpName(), employee.getEmpName()) && Objects.equals(getEmpAddress(), employee.getEmpAddress()) && Objects.equals(getDepartment(), employee.getDepartment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmpId(), getEmpName(), getEmpAddress(), getDepartment());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empAddress='" + empAddress + '\'' +
                ", department=" + department +
                '}';
    }
}
