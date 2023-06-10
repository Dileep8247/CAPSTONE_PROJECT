package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Student;
import com.demo.repository.Studentrepository;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class Studentcontroller
{

	@Autowired
	private Studentrepository srepo;
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/insertstudent")
	public Student insertstudent(@RequestBody Student s1)
	{
		return srepo.save(s1);
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/updatestudent")
	public Student updatestudent(@RequestBody Student s2)
	{
		return srepo.save(s2);
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/deletestudent")
	public void deletestudent(@RequestBody Student s3)
	{
		srepo.delete(s3);
	}

	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/viewstudent")
	public List<Student> viewstudent()
	{
		return srepo.findAll();
	}
	
	
	
	
	
}
