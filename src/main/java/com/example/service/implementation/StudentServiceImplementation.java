package com.example.service.implementation;

import com.example.entity.Student;
import com.example.repo.IStudentRepo;
import com.example.service.IStudentService;
import com.example.view.StudentView1;
import com.example.view.View;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImplementation implements IStudentService {


    private final IStudentRepo repo;

    @Autowired
    public StudentServiceImplementation(IStudentRepo repo) {
        this.repo = repo;
    }

    @Override
    public void saveStudent() {

        if (repo.count() == 0) {
            repo.save(new Student(null, "Vikram", "Java", "A", 1500.0, 19));
            repo.save(new Student(null, "Priya", "Python", "B", 3000.0, 22));
            repo.save(new Student(null, "Rahul", "Spring", "A", 1200.0, 18));
        }

    }

    @Override
    public List<StudentView1> searchByFeesLessThan(double fees) {
        return repo.findByFeesLessThan(fees);
    }

    @Override
    public <T extends View> List<T> searchByAgeLessThan(Integer ageIsLessThan, Class<T> clazz) {
        return repo.findByAgeLessThan(ageIsLessThan, clazz);
    }
}
