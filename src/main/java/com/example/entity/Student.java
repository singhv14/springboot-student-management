package com.example.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(nullable = false)
    String studentName;

    @Column(nullable = false)
    private String course;

    @Column(nullable = false)
    private String grade;

    @Column(nullable = false)
    private Double fees;

    @Column(nullable = false)
    private Integer age;

}
