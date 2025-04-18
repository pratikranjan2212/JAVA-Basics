package a1;
import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you height in m: ");
		double h=sc.nextDouble();
		System.out.println("Enter your weight in kg: ");
		int w = sc.nextInt();
		double BMI = w/(h*h);
		
		if(BMI<18.5)
			System.out.println("The person is Underweight");
		else if(BMI>=18.5 && BMI<24.9)
			System.out.println("The person is Normal weight");
		else if(BMI>=25.0 && BMI<29.9)
			System.out.println("The person is Overweight");
		else 
			System.out.println("The person is Obese");
		
		sc.close();
	}

}