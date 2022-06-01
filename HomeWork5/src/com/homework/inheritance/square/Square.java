package com.homework.inheritance.square;

import com.homework.inheritance.Rectangle;

final public class Square extends Rectangle {
	private double side;
	
	public Square() {
		
	}

	public Square(double side) {
		this.side = side;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return super.getPerimeter(side, side);
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return super.getArea(side, side);
	}
	
}
