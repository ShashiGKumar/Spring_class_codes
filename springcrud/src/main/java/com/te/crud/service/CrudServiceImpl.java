package com.te.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.crud.daolayer.Daolayer;
import com.te.crud.model.Employee;
@Service
public class CrudServiceImpl implements CrudService{

	@Autowired
	public Daolayer dao;

	@Override
	public boolean add(Employee emp) {
//        emp object is null
		if(emp==null) {
			return false;
		}
        return dao.save(emp);			
	}

	@Override
	public boolean delete() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getDetails() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}
