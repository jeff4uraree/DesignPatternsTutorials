package com.tutorialspoint;

public class ColorFactory extends AbstractFactory{

	@Override
	Color getColor(String color) {
		
		if(color == null) {
			return null;
		}
		
		if(color.equalsIgnoreCase("RED")) {
			return new Red();
		}
		else if(color.equalsIgnoreCase("GREEN")) {
			return new Red();
		}	
		else if(color.equalsIgnoreCase("BLUE")) {
			return new Red();
		}
		
		return null;
	}

	@Override
	Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		return null;
	}

}
