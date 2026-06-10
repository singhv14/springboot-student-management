package com.example.service;

import com.example.entity.Student;
import com.example.view.StudentView1;
import com.example.view.View;

import java.util.List;

public interface IStudentService {

    void saveStudent();

    List<StudentView1> searchByFeesLessThan(double fees);

    <T extends View> List<T> searchByAgeLessThan(Integer ageIsLessThan, Class<T> clazz);

}
