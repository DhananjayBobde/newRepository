package com.adt.attendance.employeeRepository;

import com.adt.attendance.models.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee,Integer> {

    void deleteByEmpId(int empId);


    Employee findByEmpId(int empId);



}
