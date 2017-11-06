
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		A a = new A();
//		B b = new B();
//		Object oa = new A();
//		A ab = new B();
//		
//		a.doSmthAgain();
//		b.doSmthAgain();
//		((A)oa).doSmthAgain();
//		ab.doSmthAgain();
		
		A.doSmth();
		B.doSmth();
		
		A a = new A();
		a.doSmth();
		
		A ar = new B();
		ar.doSmth();
				
	}

}
