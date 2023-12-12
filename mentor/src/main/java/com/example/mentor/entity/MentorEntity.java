package com.example.mentor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class MentorEntity {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long mentorId;
	private String mentorName;
	private Long mentorMobileNumber;
	private String mentorMail;
	private String mentorLocation;
	private String mentorCourses;
	private Long maxStudentsPerMentor;
}
