package com.genspark.springbootdemoapp.entity;

import jakarta.persistence.*;

@Entity
@Table(name="courses")      // custom table name else class name is default
public class Course {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int courseid;
    private String title;
    private String instructor;

    public Course() {
    }

    public Course( String title, String instructor) {
        this.courseid = courseid;
        this.title = title;
        this.instructor = instructor;
    }

    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setIntstuctor(String instructor) {
        this.instructor = instructor;
    }
}
