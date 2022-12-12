package com.adt.attendance.service.interfaces;


import org.springframework.stereotype.Service;

import java.text.ParseException;


public interface EmployeeAttendanceService {

    String setStatus(int id, String status) throws ParseException;
}
