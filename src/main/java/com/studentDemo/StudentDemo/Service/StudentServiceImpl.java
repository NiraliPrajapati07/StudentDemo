package com.studentDemo.StudentDemo.Service;

import com.studentDemo.StudentDemo.Model.Student;
import com.studentDemo.StudentDemo.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class StudentServiceImpl implements com.studentDemo.StudentDemo.Service.StudentService {

    @Autowired
    StudentRepository studentRepository;

    private String studentID;

    @Override
    public Student getStudent(String studentID) {
        this.studentID = studentID;
        Student student= studentRepository.findByStudentID(studentID);
        return student;
    }


    @Override
    public Object addStudent(Student student) {
        Student  existingStudent = studentRepository.findByRollNo(student.getRollNo());
        if(Objects.nonNull(existingStudent))
        {
            return  "Student already exists.";
        }
        else {
            studentRepository.save(student);
            return student;
        }

    }

    @Override
    public Object updateStudent(String studentID, Student student) {

        Student  existingStudent = studentRepository.findByStudentID(studentID);
        if(Objects.nonNull(existingStudent))
        {
            existingStudent.setStudentName(student.getStudentName());
            existingStudent.setRollNo(student.getRollNo());
            existingStudent.setStandard(student.getStandard());
            existingStudent.setAddress(student.getAddress());
            existingStudent.setDivision(student.getDivision());
            studentRepository.save(existingStudent);
            return existingStudent;

        }
        else {
            return "Student does not exist.";
        }

    }

    @Override
    public void deleteStudent(String studentID) {
        studentRepository.deleteById(studentID);
    }

    @Override
    public List<Student> getListofStudents(int page, int size) {
        List<Student> students= new ArrayList<Student>();
        Pageable pageable= PageRequest.of(page, size);
        Page<Student> studentPage =  studentRepository.findAll(pageable);
        students =studentPage.getContent();
        return  students;

    }


}
