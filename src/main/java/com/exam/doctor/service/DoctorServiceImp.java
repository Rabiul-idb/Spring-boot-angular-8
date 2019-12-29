package com.exam.doctor.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.dao.DoctorDaoImp;
import com.exam.model.Doctor;

@Service
@Transactional
public class DoctorServiceImp implements DoctorService{
      
 @Autowired
 com.exam.dao.DoctorDao doctorDao;
	
	@Override
	public Doctor saveDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		return doctorDao.saveDoctor(doctor);
	}

	@Override
	public Doctor update(Doctor doctor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Doctor> getAll() {
		return doctorDao.getAll();
	}

	@Override
	public Doctor getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
