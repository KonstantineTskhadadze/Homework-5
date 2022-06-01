package com.homework.inheritance;

public class Figure {
	
	public Figure() {}
	
	public Figure(String txt) {
		System.out.println(txt);
	}
	double getPerimeter() {
		return -1;
	}
	double getArea() {
		return -1;
	}
	public static final void sayHello() {
		System.out.println("Hello from Figure class");
	}
}
