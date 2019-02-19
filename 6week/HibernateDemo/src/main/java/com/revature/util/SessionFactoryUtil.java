package com.revature.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class SessionFactoryUtil {
	private static SessionFactory sf;
	
	static {
		Configuration configuration = new Configuration().configure();
		configuration.setProperty("hibernate.connection.url",
				"jdbc:postgresql://" + System.getenv("BEARS_URL") + ":5432/postgres");
		configuration.setProperty("hibernate.connection.username", System.getenv("BEARS_USERNAME"));
		configuration.setProperty("hibernate.connection.password", System.getenv("BEARS_PASSWORD"));
		configuration.setProperty("hibernate.default_schema", System.getenv("BEARS_SCHEMA"));

		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();
		sf = configuration.buildSessionFactory(serviceRegistry);
	}
	
	public static SessionFactory getSessionFactory() {
		return sf;
	}

}
