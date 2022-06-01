package com.homework.inheritance;

public class Rectangle extends Figure {
	private double width;
	private double height;
	
	public Rectangle() {
		this(3, 4);
	}
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	@Override
	protected double getPerimeter() {
		// TODO Auto-generated method stub
		return 2 * (width * height);
	}
	protected double getPerimeter(double width, double height) {
		// TODO Auto-generated method stub
		return 2 * (width * height);
	}
	protected double getPerimeter(int width, int height) {
		// TODO Auto-generated method stub
		return 2 * (width * height);
	}
	protected double getPerimeter(int width, double height) {
		// TODO Auto-generated method stub
		return 2 * (width * height);
	}
	protected double getPerimeter(double width, int height) {
		// TODO Auto-generated method stub
		return 2 * (width * height);
	}
	@Override
	protected double getArea() {
		// TODO Auto-generated method stub
		return width * height;
	}
	protected double getArea(double width, double height) {
		// TODO Auto-generated method stub
		return width * height;
	}
	protected double getArear(int width, int height) {
		// TODO Auto-generated method stub
		return width * height;
	}
	protected double getArear(double width, int height) {
		// TODO Auto-generated method stub
		return width * height;
	}
	protected double getArear(int width, double height) {
		// TODO Auto-generated method stub
		return width * height;
	}
	
	
}
