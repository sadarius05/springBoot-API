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
    CommandLineRunner commandeLineRunner(StudentRepository repository) {

        return args -> {

            Student Souleymane = new Student(
                    "Souleymane",
                    "souleymane.sada@gmail.com",
                    LocalDate.of(1991, Month.SEPTEMBER, 5));

            Student Astou = new Student(
                    "Astou",
                    "astou.sidy@gmail.com",
                    LocalDate.of(1998, Month.DECEMBER, 26));

            Student Bilal = new Student(

                    "bilal",
                    "bilal.ahmed@gmail.com",
                    LocalDate.of(1995, Month.DECEMBER, 17)

            );

            repository.saveAll(
                    List.of(Souleymane, Astou, Bilal));

        };

    }

}
