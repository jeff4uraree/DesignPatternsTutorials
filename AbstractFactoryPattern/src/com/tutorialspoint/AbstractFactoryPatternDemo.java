package com.tutorialspoint;

public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {
		
		// get shape factory
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		
		//get an object of Shape Circle
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		
		// call draw method of Shape circle
		shape1.draw();
		
		// get an object of shape Rectangle
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		
		//call draw method of Shape Rectangle
		shape2.draw();
		
		// get an object of shape square
		Shape shape3 = shapeFactory.getShape("SQUARE");
		
		//call draw method of Shape square
		shape3.draw();
		
		// get color factory
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		
		// get an object of Color Red
		Color color1 = colorFactory.getColor("RED");
		
		// call fill method of Red
		color1.fill();
		
		// get an object Color Green
		Color color2 = colorFactory.getColor("Green");
		
		// call fill method of Green
		color2.fill();
		
		// get an object of Color Blue
		Color color3 = colorFactory.getColor("BLUE");
		
		// call fill method of COlor Blue
		color3.fill();
	}
}
