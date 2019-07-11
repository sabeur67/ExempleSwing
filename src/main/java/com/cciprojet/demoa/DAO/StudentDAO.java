package com.cciprojet.demoa.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cciprojet.demoa.model.Student;

@Repository
public interface StudentDAO extends JpaRepository<Student, Integer> {

	void deleteByStudentId(int id);

	// Integer type Id student
}
