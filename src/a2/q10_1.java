package a2;
import java.util.Scanner;

class Student{
	String name; int roll;
	Scanner sc = new Scanner(System.in);
	
	public void inputDetails(){
		System.out.print("Enter name & roll no: ");
		name=sc.next(); roll=sc.nextInt();
	}
	
	public void showDetails() {
		System.out.println("Name: "+name+"\nRoll No: "+roll);
	}
}

class Test extends Student{
	int mark1, mark2;
	
	public void inputDetails(){
		super.inputDetails();
		System.out.print("Enter marks of two tests: ");
		mark1=sc.nextInt(); mark2=sc.nextInt();
	}
	
	public void showDetails() {
		super.showDetails();
		System.out.println("Marks in Test 1 & 2: "+mark1+" "+mark2);
	}
}
