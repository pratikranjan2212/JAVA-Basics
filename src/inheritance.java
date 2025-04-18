import java.util.Scanner;

class Info{
	int roll;
	String name,sec;
	Scanner sc = new Scanner(System.in);
	
	Info(){
		System.out.print("Enter name, roll no & section: ");
		name = sc.next(); roll = sc.nextInt();	sec = sc.next();
	}
	
	void show() {
		System.out.println("Name: "+name+"\nRoll: "+roll+"\nSec: "+sec);
	}
}

class TheoryMarks extends Info{
	int M,P,J;
	void input1() {
		System.out.println("Enter Marks for Maths, Python & Java: ");
		M = sc.nextInt(); P = sc.nextInt(); J = sc.nextInt();
	}
}

class Practicals extends TheoryMarks{
	int pm;
	void input2() {
		System.out.print("Enter Practical Marks: ");
		pm = sc.nextInt();
	}
}

public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practicals obj = new Practicals();
		obj.input1();
		obj.input2();
		int avg = (obj.M+obj.P+obj.J+obj.pm)*100/400;
		obj.show();
		if (avg>=90)
			System.out.println("Grade: O");
		else if(avg>=80 && avg<90)
			System.out.println("Grade: A");
		else if(avg>=70 && avg<80)
			System.out.println("Grade: B");
		else if(avg>=60 && avg<70)
			System.out.println("Grade: C");
		else if(avg>=50 && avg<60)
			System.out.println("Grade: D");
		else if(avg>=40 && avg<50)
			System.out.println("Grade: E");
		else
			System.out.println("Grade: F");
	}

}
