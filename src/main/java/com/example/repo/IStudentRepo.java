package com.example.repo;

import com.example.entity.Student;
import com.example.view.StudentView1;
import com.example.view.View;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IStudentRepo extends JpaRepository<Student,Integer> {

    List<StudentView1> findByFeesLessThan(double fees);
    <T extends View> List<T> findByAgeLessThan(Integer ageIsLessThan, Class<T> clazz);

}
