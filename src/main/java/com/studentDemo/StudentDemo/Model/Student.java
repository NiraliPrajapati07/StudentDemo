package com.studentDemo.StudentDemo.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "student")
public class Student {

    @Id
    private String studentID;

    @Field("roll_no")
    private int rollNo;

    @Field("student_name")
    private String studentName;

    @Field("standard")
    private String standard;

    @Field("division")
    private String division;

    @Field("address")
    private String address;


    public Student() {
    }

    public Student(String studentID, int rollNo, String studentName, String standard, String division, String address) {
        this.studentID = studentID;
        this.rollNo = rollNo;
        this.studentName = studentName;
        this.standard = standard;
        this.division = division;
        this.address = address;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", rollNo=" + rollNo +
                ", studentName='" + studentName + '\'' +
                ", standard='" + standard + '\'' +
                ", division='" + division + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

