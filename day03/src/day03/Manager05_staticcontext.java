package day03;

public class Manager05_staticcontext {
	static int i = 10;
	public static void main(String[] args) {
		System.out.println(i);
		
		//calling not-static method from static context
		// directly
		// we should create object of the class
		//to access the them
	}
	void test1() {
		test2();
	}
	void test2() {
		
	}

}
