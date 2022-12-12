package com.adt.attendance.models;

import lombok.Data;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "employee")
@Data
@Getter
@Setter
public class Employee {

    @Id

    private int empId;
    private String empName;
    private String mobileNumber;
    private String empEmail;
    private String designation;
    private String empJoiningDate;
    private String address;


    }

