package com.te.crud.daolayer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.crud.model.Employee;

public class DaoLayerImpl implements Daolayer{

	@Override
	public boolean save(Employee emp) {
//		case2:Executes successfully without any exception
//		case3:Executes successfully with an exception
		
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("crud");
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(emp);
			transaction.commit();
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

}
