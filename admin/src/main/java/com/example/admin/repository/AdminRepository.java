package com.example.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.admin.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {

}
