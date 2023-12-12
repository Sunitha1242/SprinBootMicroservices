package com.example.student.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {

	private Long studentId;
	private String studentName;
	private Long studentMobileNumber;
	private String studentMail;
	private String studentLocation;
}
