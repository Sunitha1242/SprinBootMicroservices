package com.example.mentor.dto;

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

public class MentorDto {

	private Long mentorId;
	private String mentorName;
	private Long mentorMobileNumber;
	private String mentorMail;
	private String mentorLocation;
	private String mentorCourses;
	private Long maxStudentsPerMentor;
}
