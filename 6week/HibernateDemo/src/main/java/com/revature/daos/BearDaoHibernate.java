package com.revature.daos;

import java.util.HashSet;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.revature.model.Bear;
import com.revature.util.SessionFactoryUtil;

public class BearDaoHibernate implements BearDao {
	
	private SessionFactory sf = SessionFactoryUtil.getSessionFactory();
	private Logger log = LogManager.getRootLogger();

	@Override
	public Bear save(Bear b) {
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		
		session.save(b);
		t.commit();
		session.close();
		return b;
	}

	@Override
	public Bear update(Bear b) {
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		
		// this was just to show NonUniqueObjectException for update
		// merge has no problem with it
//		Bear persistentBear = (Bear) session.get(Bear.class, b.getId());
		
		session.merge(b);
		t.commit();
		session.close();
		return b;
	}

	@Override
	public Bear delete(Bear b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Bear> findAll() {
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		
		Criteria c = session.createCriteria(Bear.class);
		Set<Bear> bears = new HashSet<>(c.list()); // c.list will execute criteria
		
		t.commit();
		session.close();
		return bears;
	}

	@Override
	public Bear findById(int id) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Bear b = (Bear) s.get(Bear.class, id);
		
		// automatic dirty checking
//		b.setColor("Blue"); // at this point the object would be persistent and changes will be reflected
			
		log.info(b);
		t.commit();
		s.close(); // return the connection to the pool
		return b;
	}

	@Override
	public Set<Bear> findByCaveId(int caveId) {
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		
		Query q = session.createQuery("FROM Bear WHERE cave.id = :caveId");
		q.setInteger("caveId", caveId);
		Set<Bear> bears = new HashSet<>(q.list());
		
		t.commit();
		session.close();
		return bears;
	}

	@Override
	public Set<Bear> findByLegs(int legs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Bear> findByColor(String color) {
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		
		Query q = session.createQuery("FROM Bear WHERE color = :col");
		q.setString("col", color);
		Set<Bear> bears = new HashSet<>(q.list());
		
		t.commit();
		session.close();
		return bears;
	}

	@Override
	public Set<Bear> findByBreed(String breed) {
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		
		Criteria c = session.createCriteria(Bear.class);
		c.add(Restrictions.ilike("breed", breed));
		
		Set<Bear> bears = new HashSet<>(c.list()); // c.list will execute criteria
		
		t.commit();
		session.close();
		return bears;
	}

}
