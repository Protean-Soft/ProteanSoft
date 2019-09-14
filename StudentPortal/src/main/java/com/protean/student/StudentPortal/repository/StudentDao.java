package com.protean.student.StudentPortal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.protean.student.StudentPortal.model.StudentUserDetails;

@Repository
public interface StudentDao extends JpaRepository<StudentUserDetails, Long> {
	
	public StudentUserDetails findByUsername(String username);

	
}
