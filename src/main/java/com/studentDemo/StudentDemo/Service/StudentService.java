package com.studentDemo.StudentDemo.Service;

import com.studentDemo.StudentDemo.Model.Student;

import java.util.List;

public interface StudentService {
    public Student getStudent(String studentID);

    public Object addStudent(Student student);

    public Object updateStudent(String studentID, Student student);

    public void deleteStudent(String studentID);

    public List<Student> getListofStudents(int page, int size);
}
