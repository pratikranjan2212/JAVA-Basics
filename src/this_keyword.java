class B{
	int X;
	B(int X){
//		X=X;
//		X=X1;
		this.X=X;
	}
	void show() {
		System.out.println(X);
	}
}

public class this_keyword {

	public static void main(String[] args) {
		B obj = new B(49);
		obj.show();
		
	}

}
