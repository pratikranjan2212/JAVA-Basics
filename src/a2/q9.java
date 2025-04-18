package a2;
import java.util.Scanner;

public class q9 {

	public static void main(String[] args) {
		Manager m = new Manager();
		m.displayManagerDetails();
	}

}

class Employee{
	String name;
	double salary;
	Scanner sc = new Scanner(System.in);
	
	Employee(){
		System.out.print("Enter employee name & salary: ");
		name=sc.next();salary=sc.nextDouble();
	}
	
	void displayEmployeeInfo(){
		System.out.println("Name: "+name+"\nSalary: "+salary);
	}
}

class Manager extends Employee{
	String department;
	
	Manager(){
		super();
		System.out.print("Enter department: ");
		department=sc.next();
	}
	
	void displayManagerDetails(){
		super.displayEmployeeInfo();
		System.out.println("Department: "+department);
	}
}
