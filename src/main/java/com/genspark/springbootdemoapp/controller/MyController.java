package com.genspark.springbootdemoapp.controller;

import com.genspark.springbootdemoapp.entity.Course;
import com.genspark.springbootdemoapp.service.CourseService;
import com.sun.jdi.IntegerValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private CourseService cs;

    @GetMapping("/home")
    public String home(@RequestParam(value= "name", defaultValue = "Hello world")
                           String name, @RequestParam(value= "msg",
                           defaultValue = "good morning") String msg){
            return "<html><body><h1>Welcome to course application " + name +
                    "</body></html";
    }

    @GetMapping("/courses")
    public List<Course> getCourses(){
        return cs.getAllCourses();
    }

    @GetMapping("/courses/{courseid}")
    public Course getCourse(@PathVariable String courseid){
        return cs.getCourse(Integer.parseInt(courseid));
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course c){
        return cs.addCourse(c);
    }

    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course c){
        return cs.updateCourse(c);
    }

    @DeleteMapping("/courses/{courseid}")
    public String deleteCourse(@PathVariable String courseid){
       return  cs.deleteCourse(Integer.parseInt(courseid));
    }
}
