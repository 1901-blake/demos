package com.revature.aspects;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

	// inside of @Around is the pointcut
	@Around("execution(* com.revature.*..*(..)) && !execution(* com.revature.BearsApiApplication.*(..))")
	public Object logger(ProceedingJoinPoint pjp) throws Throwable {
		Object obj = null;
		System.out.println("Method called with signature: " + pjp.getSignature());
		System.out.println("\tWith arguments: " + Arrays.toString(pjp.getArgs()));

		try {
			// everything prior to pjp.proceed happens before the joinpoint method is called
			obj = pjp.proceed();
			// everything prior to pjp.proceed happens after the jointpoint method is called
			if (obj != null) {
				System.out.println("Method with signature: " + pjp.getSignature() + " returned: " + obj.toString());
				return obj;
			} else {
				System.out.println("Method with signature: " + pjp.getSignature() + " returned nothing");
				return obj;
			}
		} catch (Throwable e) {
			System.out.println(pjp.getSignature() + " threw exception with message: " + e.getMessage());
			throw e;
		}
	}
}