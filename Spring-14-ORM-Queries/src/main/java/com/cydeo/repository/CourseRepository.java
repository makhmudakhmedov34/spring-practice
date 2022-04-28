package com.cydeo.repository;

import com.cydeo.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course,Long> {

    //find all courses by category
    List<Course> findByCategory(String category);

    //find all courses by category and order the entities by name


}
