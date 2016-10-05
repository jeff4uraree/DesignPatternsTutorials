package com.tutorialspoint;

public class ShapeFactory extends AbstractFactory{

	@Override
	Color getColor(String color) {
		return null;
	}

	@Override
	Shape getShape(String shapeType) {
		if(shapeType == null) {
			return null;
		}
		
		if(shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}
		else if(shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Circle();
		}
		else if(shapeType.equalsIgnoreCase("SQUARE")) {
			return new Circle();
		}
		
		return null;
	}

}
