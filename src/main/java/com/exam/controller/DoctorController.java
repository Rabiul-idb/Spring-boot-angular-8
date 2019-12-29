package com.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exam.doctor.service.DoctorService;

import com.exam.model.Doctor;

@RestController
@CrossOrigin(origins = "*")
public class DoctorController {
   @Autowired
   DoctorService doctorservice;
	
	@PostMapping("/save-doctor")
	public Doctor saveDoctor(@RequestBody Doctor doctor) {
       System.out.println( doctor.getName());
		return doctorservice.saveDoctor(doctor);

	}
	 @GetMapping("/show-doctor")
	    public List<Doctor> showDoctor(){
	        List <Doctor> DoctorList  =  doctorservice.getAll();
	    	return DoctorList;
	    }
	
}
