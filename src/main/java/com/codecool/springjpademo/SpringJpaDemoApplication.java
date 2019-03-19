package com.codecool.springjpademo;

import com.codecool.springjpademo.entity.Address;
import com.codecool.springjpademo.entity.Student;
import com.codecool.springjpademo.repository.AddressRepository;
import com.codecool.springjpademo.repository.SchoolRepository;
import com.codecool.springjpademo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import java.time.LocalDate;

@SpringBootApplication
public class SpringJpaDemoApplication {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private SchoolRepository schoolRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaDemoApplication.class, args);
    }

    @Bean
    @Profile("production")
    public CommandLineRunner init() {
        return args -> {
            Student john = Student.builder()
                    .email("john@codecool.com")
                    .name("John")
                    .birthDate(LocalDate.of(1980, 3, 5))
                    .address(Address.builder()
                                .country("Hungary")
                                .city("Miskolc")
                                .build())
                    .phoneNumber("555-6666")
                    .phoneNumber("555-7777")
                    .phoneNumber("555-8888")
                    .build();

            john.calculateAge();

            studentRepository.save(john);
        };
    }

}
