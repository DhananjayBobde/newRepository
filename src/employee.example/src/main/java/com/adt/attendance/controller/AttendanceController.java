package com.adt.attendance.controller;



import com.adt.attendance.service.interfaces.EmployeeAttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;

@RestController
@RequestMapping("/attendance")
public class AttendanceController {
@Autowired
private EmployeeAttendanceService employeeAttendanceService;

    @PostMapping("/punching/{id}/{status}")
    public ResponseEntity<String> status(@PathVariable int id, @PathVariable String status) throws ParseException {

        return ResponseEntity.ok(employeeAttendanceService.setStatus(id, status));
    }


}
