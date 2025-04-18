package a2;
import java.util.Scanner;

public class q2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Complex c1 = new Complex();
        System.out.print("Enter the first complex number: ");
        double real1 = sc.nextDouble(); double imag1 = sc.nextDouble();
        c1.setData(real1, imag1);

        Complex c2 = new Complex();
        System.out.print("Enter the second complex number: ");
        double real2 = sc.nextDouble(); double imag2 = sc.nextDouble();
        c2.setData(real2, imag2);

        System.out.println("C1: "+c1.display()+"\nC2: "+c2.display());
        Complex result = Complex.add(c1, c2);
        System.out.println("Sum: "+result.display());
        
        sc.close();
    }
}

class Complex {
	double real;
	double imag;

	public void setData(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}

	public String display() {
		return (real + " + " + imag + "i");
	}

	public static Complex add(Complex c1, Complex c2) {
		Complex result = new Complex();
		result.real = c1.real + c2.real;
		result.imag = c1.imag + c2.imag;
		return result;
	}
}
