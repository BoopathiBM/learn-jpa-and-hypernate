package com.boopathi.springboot.learn_jpa_and_hypernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.boopathi.springboot.learn_jpa_and_hypernate.course.springdatajpa.CourseSpringDataJpaRapository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    // @Autowired
    // private CourseJdbcRepository repository;

    // @Autowired
    // private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRapository repository;

    @Override
    public void run(String... args) throws Exception {
        
        repository.save(new Course(1,"Learn AWS","Boopathi"));
        repository.save(new Course(2,"Learn Java","Boo"));
        repository.save(new Course(3,"Learn Sql","pathi"));
        
        repository.deleteById(1l);

        System.out.println(repository.findById(2l));
        System.out.println(repository.findById(3l));

        System.out.println(repository.findByAuthor("pathi"));
        System.out.println(repository.findByName("Sql"));
        
        
    }
    

}
