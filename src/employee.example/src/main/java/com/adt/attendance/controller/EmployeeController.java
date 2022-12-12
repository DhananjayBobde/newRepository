package com.adt.attendance.controller;

import com.adt.attendance.models.Employee;
import com.adt.attendance.service.interfaces.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {



    @Autowired
    private EmployeeService employeeService;



    @PostMapping("/addEmp")
    public ResponseEntity<String> addEmployee(@RequestBody Employee employee) {
         this.employeeService.addEmployee(employee);
       return ResponseEntity.ok("employee added");
    }


    @GetMapping("/getAllEmp")
    public ResponseEntity<List<Employee>> getEmployee() {

         return ResponseEntity.ok(this.employeeService.getEmployee());
    }



    @PutMapping("/updateEmp")
    public ResponseEntity <Employee> updateEmployee(@RequestBody Employee employee){

        return ResponseEntity.ok(this.employeeService.updateEmployee(employee));
    }

    @GetMapping("/getEmployeeById/{empId}")
    public ResponseEntity <Employee> getEmployeeById(@PathVariable("empId") int empId){


        return new ResponseEntity<>(this.employeeService.getEmployeeById(empId), HttpStatus.OK);
    }


    @DeleteMapping("/deleteEmp/{empId}")
    public ResponseEntity<String> deleteEmployee(@PathVariable int empId) {


        return ResponseEntity.ok(this.employeeService.deleteEmployee(empId));
    }




}
