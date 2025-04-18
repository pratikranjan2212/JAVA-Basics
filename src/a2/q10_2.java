package a2;
import a2.*;

public class q10_2 {

	public static void main(String[] args) {
		Test t2 = new Test();
		t2.inputDetails();
		t2.showDetails();
		int total_mark=(t2.mark1+t2.mark2)/2;
		System.out.println("Total marks: "+total_mark);
		System.out.println("Total score: "+Result.total_score);
	}

}

interface Sports{
	int score1=20,score2=90;
}

class Result implements Sports{
	static int total_score=(score1+score2)/2;
}