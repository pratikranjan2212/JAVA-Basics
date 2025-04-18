class X1{
	int a;
	X1(){
		a=29;
	}
	X1(int a1){
		a=a1;
	}
	void show1() {
		System.out.println(a);
	}
	void show() {
		System.out.println(a);
	}
}

class Y extends X1{
	int b;
	Y(){
		super(280);
		b=49;
	}
	void show2() {
		System.out.println(a+b);
	}
	void show() {
		super.show();
		System.out.println(a+b);
	}
}

public class super_keyword {

	public static void main(String[] args) {
		Y ob = new Y();
//		ob.show2();
		ob.show();
		
	}

}
