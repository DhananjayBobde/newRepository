package com.adt.attendance.service.implementation;

import com.adt.attendance.employeeRepository.EmployeeRepository;
import com.adt.attendance.models.Employee;
import com.adt.attendance.service.interfaces.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;


    @Override
    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getEmployee() {
        List<Employee> list2 = new ArrayList<>();

        list2.addAll(this.employeeRepository.findAll());
        return list2;

    }

    @Override
    public String deleteEmployee(int empId) {
        Employee e = employeeRepository.findByEmpId(empId);

        if (e != null) {
            employeeRepository.deleteByEmpId(empId);
        } else {
            return "data not found";
        }

        return "delete employeee";
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        Employee emp =employeeRepository.findByEmpId(employee.getEmpId());

        employeeRepository.save(employee);
        return employee;

    }

    @Override
    public Employee getEmployeeById(int empId) {


        Employee emp = employeeRepository.findByEmpId(empId);

        return emp;

    }




}
