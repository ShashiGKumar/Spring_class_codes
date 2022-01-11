package com.te.crud.service;

import com.te.crud.model.Employee;

public interface CrudService {
	
	public boolean add(Employee emp);
	public boolean delete();
	public boolean update();
	public boolean getDetails();

}
