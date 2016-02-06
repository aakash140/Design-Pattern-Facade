package com.java.facade;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
	static Map<String, Shape> circleMap=new HashMap<>();
	Circle circle;
	public static Circle getCircle(int radius,String color){
		Circle circle;
		/*for(int i=0;i<10;i++){
			circle=new Circle(getRandomRadius(),getRandomColor());
		}*/
		circle=(Circle)circleMap.get(color);
		if(circle==null){
			circle=new Circle(radius,color);
			circleMap.put(color,circle);
		}
		return circle;
	}
	
}