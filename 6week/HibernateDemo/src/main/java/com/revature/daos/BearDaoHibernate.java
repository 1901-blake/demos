package com.revature.daos;

import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.revature.model.Bear;
import com.revature.util.SessionFactoryUtil;

public class BearDaoHibernate implements BearDao {
	
	private SessionFactory sf = SessionFactoryUtil.getSessionFactory();
	private Logger log = LogManager.getRootLogger();

	@Override
	public Bear save(Bear b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bear update(Bear b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bear delete(Bear b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Bear> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bear findById(int id) {
		Session s = sf.openSession();
		Bear b = (Bear) s.get(Bear.class, id);
		log.info(b);
		s.close(); // return the connection to the pool
		return b;
	}

	@Override
	public Set<Bear> findByCaveId(int caveId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Bear> findByLegs(int legs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Bear> findByColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Bear> findByBreed(String breed) {
		// TODO Auto-generated method stub
		return null;
	}

}
