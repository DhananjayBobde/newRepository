package com.adt.attendance.service.interfaces;

import com.adt.attendance.models.Employee;

import java.util.List;

public interface EmployeeService {
    public void addEmployee(Employee employee);

    public List<Employee> getEmployee();

    public String deleteEmployee(int empId);

    public Employee updateEmployee(Employee employee);

    public Employee getEmployeeById(int empId);

}
