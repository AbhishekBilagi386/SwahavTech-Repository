package com.monocept.model;

public class Rectangle {
	private int width;
	private final int height;
	private String color;
	
	public Rectangle(int width, int height,String color) {
		this.width=width;
		this.height=height;
		this.color=validate(color);
	}
	private String validate(String color1) {
		if(color1.equalsIgnoreCase("red") || color1.equalsIgnoreCase("green") || color1.equalsIgnoreCase("blue"))
		{
			return color1;
		}
		return "red";
	}
	public void setwidth(int width) {
		this.width=check(width);
	}
	private int check(int width) {
		if(width<=0)
			return 1;
		if(width>100)
			return 100;
					
		return width;
	}
	public int getwidth() {
		return width;
	}
	public int getheight() {
		return height;
	}
	public double calculateArea() {
		return width*height;
	}
	public String getColor() {
		return this.color;
		
	}
	public void setColor(String color) {
		this.color = validate(color);
	}

}
