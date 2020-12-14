package com.studentDemo.StudentDemo.Controller;

import com.studentDemo.StudentDemo.Model.Student;
import com.studentDemo.StudentDemo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentservice;

    @GetMapping
    public List<Student> getAllStudents(@RequestParam (name = "page")int page, @RequestParam(name="size")int size) {  return studentservice.getListofStudents(page, size);  }

    @GetMapping("/{studentID}")
    public Student getStudent(@PathVariable String studentID ){
        return studentservice.getStudent(studentID);
    }

    @PostMapping
    public Object addStudent(@RequestBody Student student){
        return studentservice.addStudent(student);
    }

    @PutMapping("/{studentID}")
    public Object updateStudent(@PathVariable String studentID , @RequestBody Student student){
        return studentservice.updateStudent(studentID,student);
    }

    @DeleteMapping("/{studentID}")
    public void deleteStudent(@PathVariable String studentID, @RequestBody Student student){
        studentservice.deleteStudent(studentID);
    }
}