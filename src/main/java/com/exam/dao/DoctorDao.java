package com.exam.dao;

import java.util.List;

import com.exam.model.Doctor;

public interface DoctorDao {
	public Doctor saveDoctor(Doctor doctor);
    public Doctor update(Doctor doctor);
    public boolean delete(int id);
    public List<Doctor> getAll();
    public Doctor getById(int id);
	
	
}
