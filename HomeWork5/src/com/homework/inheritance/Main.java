package com.homework.inheritance;

import com.homework.inheritance.square.Square;

public class Main {
	public static void main(String[] args) {
		Figure figure = new Figure();
		Rectangle rectangle = new Rectangle(100, 100);
		System.out.println(figure.getPerimeter());
		System.out.println(figure.getArea());
		System.out.println(rectangle.getPerimeter());
		System.out.println(rectangle.getArea());
		System.out.println(figure instanceof Figure);
		System.out.println(figure instanceof Rectangle);
		System.out.println(rectangle instanceof Figure);
		System.out.println(rectangle instanceof Rectangle);
		System.out.println(rectangle.getArea(50, 50));
		Square square = new Square(100);
		System.out.println(square.getPerimeter());
		System.out.println(square.getArea());
	}
}
