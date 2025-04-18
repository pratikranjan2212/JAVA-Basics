class S{
	static int B;
	
	static void input() { //If method static then IV must be static(vice-versa False)
		B=28;
	}
	
	void show() {
		input();
		System.out.println(B);
	}
}
public class static_members {

	public static void main(String[] args) {
		S ob = new S();
		ob.show();
		S.B=34;
//		ob.B = 56;
		System.out.println(S.B); 
//		System.out.println(ob.B);
	}

}
