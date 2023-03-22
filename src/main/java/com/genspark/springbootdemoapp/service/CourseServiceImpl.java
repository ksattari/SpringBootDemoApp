package com.genspark.springbootdemoapp.service;

import com.genspark.springbootdemoapp.dao.CourseDao;
import com.genspark.springbootdemoapp.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseDao courseDao;

    @Override
    public List<Course> getAllCourses() {
        return courseDao.findAll();
    }

    @Override
    public Course getCourse(int id) {
        return courseDao.getReferenceById(id);
    }

    @Override
    public Course updateCourse(Course c) {

        if (courseDao.findByCourseId(c.getCourseid()) == 1) {
            return courseDao.save(c);
        }
        return null;
    }

    @Override
    public Course addCourse(Course c) {
        return courseDao.save(c);
    }

    @Override
    public String deleteCourse(int id) {
        String resp = "Course does not exist.";

        if(courseDao.findByCourseId(id) == 1) {
            courseDao.deleteById(id);
            resp = "Course id: " + id + " has been deleted.";
        }
        return resp;
    }
}
