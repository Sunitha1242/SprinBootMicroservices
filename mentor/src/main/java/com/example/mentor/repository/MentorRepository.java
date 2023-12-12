package com.example.mentor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mentor.entity.MentorEntity;

public interface MentorRepository extends JpaRepository<MentorEntity, Long> {

}
