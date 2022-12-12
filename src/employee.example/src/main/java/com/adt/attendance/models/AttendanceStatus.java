package com.adt.attendance.models;

import jdk.jfr.DataAmount;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;


@Document(collection = "attendance")
@Data
@Getter
@Setter
public class AttendanceStatus {


    private int attendanceId;
    private String checkOut;
    private String checkIn;
    private String workingHour;
    private String date;


}
