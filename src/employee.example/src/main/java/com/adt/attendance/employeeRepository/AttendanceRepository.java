package com.adt.attendance.employeeRepository;


import com.adt.attendance.models.AttendanceStatus;

import com.adt.attendance.models.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface AttendanceRepository extends MongoRepository<AttendanceStatus,Integer> {



    AttendanceStatus findByAttendanceIdAndDate(int id, String localDates);



    AttendanceStatus findByAttendanceId(int id);



    void deleteByAttendanceIdAndDate(int id,String localDates);



}
