package com.boopathi.springboot.learn_jpa_and_hypernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.boopathi.springboot.learn_jpa_and_hypernate.course.jpa.CourseJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    // @Autowired
    // private CourseJdbcRepository repository;

    @Autowired
    private CourseJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        
        repository.insert(new Course(1,"Learn AWS","Boopathi"));
        repository.insert(new Course(2,"Learn Java","Boo"));
        repository.insert(new Course(3,"Learn Sql","pathi"));
        repository.deleteById(1);

        System.out.println(repository.findById(2));
        System.out.println(repository.findById(3));
    }
    

}
