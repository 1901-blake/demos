package com.revature.launcher;

import com.revature.daos.BearDao;
import com.revature.daos.BearDaoHibernate;

public class HibernateLauncher {
	public static void main(String[] args) {
		BearDao bearDao = new BearDaoHibernate();
		
		bearDao.findById(1);
	}
}
