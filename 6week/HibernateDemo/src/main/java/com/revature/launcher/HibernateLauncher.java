package com.revature.launcher;

import java.util.Set;

import com.revature.daos.BearDao;
import com.revature.daos.BearDaoHibernate;
import com.revature.model.Bear;

public class HibernateLauncher {
	
	public static void main(String[] args) {
		BearDao bearDao = new BearDaoHibernate();
		
		Set<Bear> bears = bearDao.findByCaveId(2);
		bears.forEach(bear -> 
			System.out.println(bear.getId() + " color: " + bear.getColor()  + " breed: " + bear.getBreed() + " cave: " + bear.getCave())
		);
		
		// create bear
//		Bear b = bearDao.save(new Bear(0, "Whatever", "didn't matter", 4, null, new HashSet<>()));
		
		// update bear cubs
//		Bear b = bearDao.findById(5);
//		Bear unloved = bearDao.findById(8);
//		b.getCubs().add(unloved);
//		bearDao.update(b);
		
		
		// update bear and verify
//		Bear b = bearDao.findById(5);
//		b.setColor("red");
//		bearDao.update(b);
//		bearDao.findById(1);
	}
}
