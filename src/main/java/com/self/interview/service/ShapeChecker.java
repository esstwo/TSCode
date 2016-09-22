package com.self.interview.service;

import com.self.interview.exception.InvalidInputException;
import com.self.interview.exception.NegativeInputException;

public interface ShapeChecker {
	
	public TriangleTypeEnum detectTriangleType(float sideOne, float sideTwo, float sideThree) throws InvalidInputException, NegativeInputException;

}
