package com.revature.math;


import static org.mockito.Mockito.when;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTestSuite {
	@Mock
	private Calculator calc;
	private static Logger log = LogManager.getRootLogger();

	@InjectMocks
	private final MathApplication ma = new MathApplication();

	@BeforeClass
	public static void beforeAll() {
		log.debug("before any test has run");
	}

	@Before
	public void beforeEach() {
		log.debug("runs once before each and every test");
	}
	
	@Test
	public void complexComputationTest() {
		when(calc.add(0, 1)).thenReturn(1d);
		when(calc.add(1, 2)).thenReturn(3d);
		when(calc.add(3, 3)).thenReturn(6d);
		when(calc.add(6, 4)).thenReturn(10d);
		
		when(calc.divide(10, 4)).thenReturn(10/4d);
		
		double result = ma.complexComputation(1,2,3,4);
		Assert.assertEquals("Result given does not match the exptected value", 2.5, result, 0.0001);
		
	}

	@After
	public void afterEach() {
		log.debug("After each and every test");
	}

	@AfterClass
	public static void afterAll() {
		log.debug("After all tests have been run");
	}
}
