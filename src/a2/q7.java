package a2;

public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle1 c1 = new Circle1("Red",21);
		Rectangle r1 = new Rectangle("Blue",34,45);
		c1.display();
		c1.area();
		r1.display();
		r1.area();
	}

}

class Shape1{
	String color;
	
	Shape1(){
//		System.out.println("Welcome to the shape class.");
	}
	
	Shape1(String color){
		this.color=color;
	}
	
}

class Circle1 extends Shape1{
	double radius;
	
	Circle1(String color, double radius){
		this.radius=radius; this.color=color;
	}
	
	void area() {
		System.out.println("The area of the circle is "+Math.PI*radius*radius);
	}
	
	void display() {
		System.out.println("Circle is of "+color+" color");
	}
}

class Rectangle extends Shape1{
	double length, width;
	
	Rectangle(String color, double length, double width){
		this.color=color; this.length=length; this.width=width; 
	}
	
	void area() {
		System.out.println("The area of the rectangle is "+length*width);
	}
	
	void display() {
		System.out.println("Rectangle is of "+color+" color");
	}
}