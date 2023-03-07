package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
@Bean
CommandLineRunner commandLineRunner(StudentRepository studentRepository){
    return args -> {

              Student moheb=  new Student(
                        12L,
                        "moheb@gmail.com",
                        LocalDate.of(1999, Month.SEPTEMBER,21),
                        "Kirollous"



                );
              Student alex= new Student(
                      12L,
                      "alex@gmail.com",
                      LocalDate.of(1999, Month.SEPTEMBER,21),
                      "alex"



              );
              studentRepository.saveAll(List.of(alex,moheb));
    };
}

}
