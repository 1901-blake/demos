package com.revature.launcher;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.fasterxml.jackson.datatype.hibernate4.Hibernate4Module;
import com.revature.daos.BearDao;
import com.revature.daos.BearDaoHibernate;
import com.revature.model.Bear;
import com.revature.util.DeepFieldFilter;

public class HibernateLauncher {

	public static void main(String[] args) {
		BearDao bearDao = new BearDaoHibernate();

		Bear b = bearDao.findById(1);
		// convert to json
		ObjectMapper om = new ObjectMapper().registerModule(new Hibernate4Module());
		SimpleFilterProvider depthFilters = new SimpleFilterProvider().addFilter("depth_1", new DeepFieldFilter(1))
                .addFilter("depth_2", new DeepFieldFilter(2))
                .addFilter("depth_3", new DeepFieldFilter(3))
                .addFilter("depth_4", new DeepFieldFilter(4))
                .addFilter("depth_5", new DeepFieldFilter(5));
		om.setFilterProvider(depthFilters);
		
		try {
			String json = om.writerWithDefaultPrettyPrinter().writeValueAsString(b);
			System.out.println(json);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Set<Bear> bears = bearDao.findByCaveId(2);
		// bears.forEach(bear ->
		// System.out.println(bear.getId() + " color: " + bear.getColor() + " breed: " +
		// bear.getBreed() + " cave: " + bear.getCave())
		// );

		// create bear
		// Bear b = bearDao.save(new Bear(0, "Whatever", "didn't matter", 4, null, new
		// HashSet<>()));

		// update bear cubs
		// Bear b = bearDao.findById(5);
		// Bear unloved = bearDao.findById(8);
		// b.getCubs().add(unloved);
		// bearDao.update(b);

		// update bear and verify
		// Bear b = bearDao.findById(5);
		// b.setColor("red");
		// bearDao.update(b);
		// bearDao.findById(1);
	}
}
