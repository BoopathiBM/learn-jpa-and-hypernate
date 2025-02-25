package com.boopathi.springboot.learn_jpa_and_hypernate.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boopathi.springboot.learn_jpa_and_hypernate.course.Course;

public interface  CourseSpringDataJpaRapository extends JpaRepository<Course, Long> {

    List<Course> findByAuthor(String author);

    List<Course> findByName(String name);


}
