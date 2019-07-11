package com.cciprojet.demoa.viewHTMLcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cciprojet.demoa.DAO.StudentDAO;
import com.cciprojet.demoa.model.Student;

@Controller
public class ViewStudentHTMLcontroller {
	
	@Autowired
	StudentDAO studentDAO;
	
	@GetMapping(value ="/Etudiant")
	public String pageEtudiant (Model model) {
		List<Student> etudiants = studentDAO.findAll();
		model.addAttribute("etu", etudiants);
		return "AfficheStudent";
	}

}
