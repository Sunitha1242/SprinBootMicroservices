package com.example.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entity.CourseEntity;

public interface CourseRepository extends JpaRepository<CourseEntity, String> {

}
