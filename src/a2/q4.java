package a2;
import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deposit money = new Deposit(45000, 5);
		money.display();
		money.calc_amt();
	}

}

class Deposit{
	long Principal;
	int Time;
	double Rate, Total_amt;
	Scanner sc = new Scanner(System.in);
	
	Deposit(){
		System.out.print("Enter Principal, Time & Rate: ");
		Principal = sc.nextInt(); Time = sc.nextInt(); Rate = sc.nextDouble();
	}
	Deposit(long Principal,int Time,double Rate){
		this.Principal=Principal; this.Time=Time; this.Rate=Rate;
	}
	Deposit(long Principal,int Time){
		this.Principal=Principal; this.Time=Time;
	}
	Deposit(long Principal,double Rate){
		this.Principal=Principal; this.Rate=Rate;
	}
	
	void display() {
		System.out.println("Principal: "+Principal+"\nRate of Interest: "+Rate+"\nTime: "+Time);
	}
	
	void calc_amt() {
		Total_amt = Principal+(Principal*Rate*Time)/100;
		System.out.println("Total Amount: "+Total_amt);
	}
}