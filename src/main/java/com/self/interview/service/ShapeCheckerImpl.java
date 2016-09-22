package com.self.interview.service;

import com.self.interview.exception.InvalidInputException;
import com.self.interview.exception.NegativeInputException;

public class ShapeCheckerImpl implements ShapeChecker {

	public TriangleTypeEnum detectTriangleType(float sideOne, float sideTwo, float sideThree)
			throws InvalidInputException, NegativeInputException {
		if(sideOne <=0 || sideTwo <= 0 || sideThree <= 0)
			throw new NegativeInputException("Sides of a triangle cannot be negative or zero");
		
		if(sideOne + sideTwo <= sideThree || sideOne + sideThree <= sideTwo || sideTwo + sideThree <= sideOne)
			throw new InvalidInputException("The 3 sides violate the triangle inequality theorem");
		
		if(sideOne == sideTwo && sideTwo == sideThree)
			return TriangleTypeEnum.EQUILATERAL;
		if(sideOne == sideTwo || sideTwo == sideThree || sideOne == sideThree)
			return TriangleTypeEnum.ISOSCELES;
		
		//at this point we know that all 3 sides are valid and no sides are equal
		return TriangleTypeEnum.SCALENE;
	}

}
