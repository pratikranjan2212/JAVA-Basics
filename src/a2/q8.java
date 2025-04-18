package a2;

public class q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck d1 = new Duck();
		d1.displayDetails();
		d1.fly();
		d1.swim();
	}

}

interface Flyable {
	void fly();
}

interface Swimmable{
	void swim();
}

class Duck implements Flyable,Swimmable{
	String name;
	
	Duck(){
		name = "Howard";
	}
	public void fly() {
		System.out.println(name+" can't fly");
	}
	
	public void swim() {
		System.out.println(name+" can swim");
	}
	
	void displayDetails() {
		System.out.println("Name of duck: "+name);
	}
}