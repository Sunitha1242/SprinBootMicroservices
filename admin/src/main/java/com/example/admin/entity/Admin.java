package com.example.admin.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="admin")
public class Admin {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long adminId;
	private String adminName;
	private Long adminMobileNumber;
	private String adminMail;
	private String adminLocation;
}
