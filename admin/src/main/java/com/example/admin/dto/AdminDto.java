package com.example.admin.dto;

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

public class AdminDto {

	private Long adminId;
	private String adminName;
	private Long adminMobileNumber;
	private String adminMail;
	private String adminLocation;
}
