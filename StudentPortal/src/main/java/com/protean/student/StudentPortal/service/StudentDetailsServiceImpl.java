package com.protean.student.StudentPortal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.protean.student.StudentPortal.repository.StudentDao;

@Service
public class StudentDetailsServiceImpl implements StudentDetailsService {

	/*@Autowired
	StudentDao studentDao;*/
	
	@Override
	public String fetchStudentDetails() {

		return "";
		//return studentDao.getStudentDetails();
	}

}
