package com.springDemo;

public class Circle implements Shape {

	private Point center;
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	@Override
	public void draw() {
		System.out.println("Circle point is {" + center.getX() + "," + center.getY() + "}");
		System.out.println("GIT");
		
	}

	
}
