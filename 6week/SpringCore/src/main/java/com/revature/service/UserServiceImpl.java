package com.revature.service;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import com.revature.daos.UserDao;
import com.revature.model.AppUser;

@Service("User Service")
public class UserServiceImpl implements UserService, BeanNameAware, BeanFactoryAware, ApplicationContextAware,
		InitializingBean, DisposableBean {

	// @Autowired // will inject by type by default
	// we can add @Qualifier here and specify a name to inject by name instead
	private UserDao ud;

	public UserServiceImpl() {
		super();
		System.out.println("Instantiation");
	}

	public UserDao getUd() {
		return ud;
	}

	@Autowired
	public void setUd(UserDao ud) {
		System.out.println("Populating properties");
		this.ud = ud;
	}

	@Override
	public AppUser findById(int id) {
		return ud.findById(id);
	}

	@Override
	public List<AppUser> findAll() {
		return ud.findAll();
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("after properties set");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("app context aware");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("bean factory aware");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("bean name aware");
	}

	@PostConstruct
	public void customInit() {
		System.out.println("custom init");
	}

	@PreDestroy
	public void customDestroy() {
		System.out.println("custom destroy");
	}

}
