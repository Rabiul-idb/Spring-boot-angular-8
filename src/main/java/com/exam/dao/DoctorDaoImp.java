package com.exam.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exam.model.Doctor;
@Repository
public class DoctorDaoImp implements DoctorDao {
	@Autowired
    SessionFactory sessionFactory;
	@Override
	public Doctor saveDoctor(Doctor doctor) {
		try {
			sessionFactory.getCurrentSession().save(doctor);
			return (doctor) ;
		} catch (HibernateException e) {
			return null;
		}
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
		try {
			List<Doctor> doctorList = (List<Doctor>) sessionFactory.getCurrentSession().createQuery("FROM Doctor").setFetchSize(50).list();
			return doctorList;
		} catch (HibernateException e) {
			return null;
		}
	}

	@Override
	public Doctor getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
