package com.revature.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Component
//@Aspect
public class BasicAspect {

	@Before("allMethods()")
	public void beforeMethod(JoinPoint jp) {
		System.out.println("before method called");
	}

	@After("allMethods()")
	public void afterMethod(JoinPoint jp) {
		System.out.println("after method called");
	}

	@AfterReturning(pointcut = "allMethods()", returning = "obj")
	public void returnedObject(Object obj) {
		System.out.println("after returning");
	}

	@AfterThrowing(pointcut = "allMethods()", throwing = "err")
	public void afterThrowing(Throwable err) {
		System.out.println("method threw an exception");
	}

	// Target all methods in any class in any package in com.revature
	@Pointcut("execution(* com.revature.*..*(..))")
	public void allMethods() {
	}
}
