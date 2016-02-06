package com.java.facade;

public class Circle implements Shape {
	int radius;
	String color;
	
	Circle(int radius,String color){
		this.radius=radius;
		this.color=color;
	}
	@Override
	public void draw() {
		System.out.println("Circle: "+radius+" "+color);
	}
}