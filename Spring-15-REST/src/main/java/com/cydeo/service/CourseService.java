package com.cydeo.service;

import com.cydeo.model.Course;

import java.util.List;
import java.util.Optional;

public interface CourseService {

    Course createCourse(Course course);

    Optional<Course> getCourseById(long courseId);

    List<Course> getCoursesByCategory(String category);

    List<Course> getCourses();

    void updateCourse(Long courseId, Course course);

    void deleteCourseById(long courseId);

    void deleteCourses();
}
