package com.self.interview.service;

import com.self.interview.exception.InvalidInputException;
import com.self.interview.exception.NegativeInputException;

public interface ShapeChecker {
	
	public TriangleTypeEnum detectTriangleType(double sideOne, double sideTwo, double sideThree) throws InvalidInputException, NegativeInputException;

}
