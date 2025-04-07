package Assignment2;

import java.util.Scanner;

public class Circle {
	private double radius;
	private String color;
	
	public Circle() {
		super();
	}
	
	public Circle(double radius, String color) {
		super();
		this.radius = radius;
		this.color = color;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}
	
	void getInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of the circle : ");
		radius = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter the color of the circle : ");
		color = sc.nextLine();
	}
	
	void calcArea() {
		double area = Math.PI*radius*radius;
		System.out.println("The Area of Circle is : "+area);
	}
}
