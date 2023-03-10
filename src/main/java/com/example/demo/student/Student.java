package com.example.demo.student;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(
            name="student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long id;
    private String email;
    private LocalDate birthDate;
    private String name;
    @Transient
    private int age;

    public Student(String email, LocalDate birthDate, String name) {
        this.email = email;
        this.birthDate = birthDate;
        this.name = name;
    }

    public Student(Long id, String email, LocalDate birthDate, String name) {
        this.id = id;
        this.email = email;
        this.birthDate = birthDate;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Period.between(birthDate,LocalDate.now()).getYears();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student() {
    }
}
