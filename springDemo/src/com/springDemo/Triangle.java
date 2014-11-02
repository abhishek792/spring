package com.springDemo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean, DisposableBean {

	private String type;
	public Triangle(String type){
		this.type = type;
	}
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	private Point pointA;
	private Point pointB;
	private Point pointC;

	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	public void draw(){
		//System.out.println(getType() + "Triangle drawn");
		System.out.println("Points are = " + getPointA().getX() + getPointA().getY() + getPointB().getX() + getPointB().getY() + getPointC().getX() + getPointC().getY());
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("InitializingBean init method called for triangle");
		
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Disposable beans destroy method called for triangle");
		
	}
}
