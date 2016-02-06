package com.java.facade;

public class CircleApp {

	
	
	public static void main(String[] args) {
		Circle circle;
		for(int i=0;i<10;i++){
			circle=ShapeFactory.getCircle(getRandomRadius(), getRandomColor());
			circle.draw();
		}	
	}

	public static int getRandomRadius(){
		return (int)(Math.random()*10.0);
	}
	
	public static String getRandomColor(){
		String colors[]={"Blue","Yellow","Red","Black","Green"};
		return colors[(int)(Math.random()*colors.length)];
	}
}
