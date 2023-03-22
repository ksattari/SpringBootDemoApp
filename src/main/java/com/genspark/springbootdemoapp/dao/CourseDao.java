package com.genspark.springbootdemoapp.dao;

import com.genspark.springbootdemoapp.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseDao extends JpaRepository<Course,Integer> {

    @Query(value = "SELECT COUNT(id) FROM courses WHERE id =:id",
    nativeQuery = true)
    int findByCourseId(@Param("id") int id);
}
