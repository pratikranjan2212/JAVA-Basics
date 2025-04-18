package a2;

public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car("Rolls Royce",1998,3467,700000);
		c.Display();
	}

}

class Vehicle{
	String model;
	int year;
	
	Vehicle(){
		model = "BMW";
		year = 2013;
	}
	
	Vehicle(String model, int year){
		this.model=model; this.year=year;
	}
}

class Car extends Vehicle{
	int carId;
	double price;
	
	Car(String model, int year, int carId, double price){
		this.model=model; this.year=year; this.carId=carId; this.price=price;
	}
	
	void Display() {
		System.out.println("Model: "+model);
		System.out.println("Year: "+year);
		System.out.println("Car ID: "+carId);
		System.out.println("Price: "+price);
	}
}