package com.genspark.springbootdemoapp.service;

import com.genspark.springbootdemoapp.entity.Course;
import java.util.List;

public interface CourseService {
    List<Course> getAllCourses();
    Course getCourse(int id);
    Course addCourse(Course c);
    Course updateCourse(Course c);
    String deleteCourse(int id);

}
