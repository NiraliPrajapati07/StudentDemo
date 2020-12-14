package com.studentDemo.StudentDemo.Repository;

import com.studentDemo.StudentDemo.Model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends PagingAndSortingRepository<Student,String> {
    Page<Student> findAll(Pageable pageable);
    Student findByStudentID(String studentID);
    Student findByRollNo(int rollNo);
}
