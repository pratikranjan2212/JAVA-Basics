import java.util.Scanner;

abstract class X{
	int a,b;
	Scanner sc = new Scanner(System.in);
	
	void input() {
		System.out.print("Enter two numbers: ");
		a=sc.nextInt();b=sc.nextInt();
	}
	
	abstract void calculate();
}

class Sum extends X{
	void calculate() {
		System.out.println("Sum: "+(a+b));
	}
}

class Diff extends X{
	void calculate(){
		System.out.println("Difference: "+(a-b)); 

}	
}
class Product extends X{
	void calculate(){
		System.out.println("Product: "+(a*b));
	}
}
	
class Quotient extends X{
	void calculate(){
		System.out.println("Quotient: "+(a/b));
	}
}

class Remainder extends X{
	void calculate(){
		System.out.println("Remainder: "+(a%b));
	}
}


public class abstraction {

	public static void main(String[] args) {
		
		Sum ob1 = new Sum();
		Diff ob2 = new Diff();
		Product ob3 = new Product();
		Quotient ob4 = new Quotient();
		Remainder ob5 = new Remainder();
		
		ob1.input();
		ob1.calculate();
		ob2.calculate();
		ob3.calculate();
		ob4.calculate();
		ob5.calculate();
	}

}
