package com.example;

import com.example.entity.Student;
import com.example.service.IStudentService;
import com.example.view.StudentView3;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StudentappApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(StudentappApplication.class, args);
		IStudentService studentService = context.getBean(IStudentService.class);

		studentService.saveStudent();

		studentService.searchByFeesLessThan(2352.5).forEach(s -> System.out.println(s.getStudentName()));

		studentService.searchByAgeLessThan(20, StudentView3.class)
				.forEach(s -> System.out.println(s.getStudentName()+" : "+s.getGrade()+" : "+s.getFees()));

	}

}
