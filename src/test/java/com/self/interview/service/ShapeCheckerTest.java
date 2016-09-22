package com.self.interview.service;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.self.interview.exception.InvalidInputException;
import com.self.interview.exception.NegativeInputException;

public class ShapeCheckerTest {

	@Test
	public void testAssertEquilateralTriangle() throws InvalidInputException, NegativeInputException {
		ShapeChecker sc = new ShapeCheckerImpl();
		assertEquals(TriangleTypeEnum.EQUILATERAL, sc.detectTriangleType(10, 10, 10));
	}

	@Test
	public void testAssertIsocelesTriangle() throws InvalidInputException, NegativeInputException {
		ShapeChecker sc = new ShapeCheckerImpl();
		assertEquals(TriangleTypeEnum.ISOSCELES, sc.detectTriangleType(10, 10, 12));
	}

	@Test
	public void testAssertScaleneTriangle() throws InvalidInputException, NegativeInputException {
		ShapeChecker sc = new ShapeCheckerImpl();
		assertEquals(TriangleTypeEnum.SCALENE, sc.detectTriangleType(10, 11, 12));
	}

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void testZeroInput() throws InvalidInputException, NegativeInputException {
		ShapeChecker sc = new ShapeCheckerImpl();
		thrown.expect(NegativeInputException.class);
		thrown.expectMessage("Sides of a triangle cannot be negative or zero");
		sc.detectTriangleType(0, 0, 0);
	}
	
	@Test
	public void testNegativeInput() throws InvalidInputException, NegativeInputException {
		ShapeChecker sc = new ShapeCheckerImpl();
		thrown.expect(NegativeInputException.class);
		thrown.expectMessage("Sides of a triangle cannot be negative or zero");
		sc.detectTriangleType(10, -1, 10);
	}

}
