package com.boopathi.springboot.learn_jpa_and_hypernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        
        repository.insert(new Course(1,"Learn AWS","Boopathi"));
        repository.insert(new Course(2,"Learn JAVA","Boo"));
        repository.insert(new Course(3,"Learn SQL","pathi"));
        repository.deleteById(1);

        System.out.println(repository.findById(2));
        System.out.println(repository.findById(3));
    }
    

}
