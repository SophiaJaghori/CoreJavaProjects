package day03;

public class Manager10_StaticContext {
	int i = 100;
	static int j = 200;
	void test1() {
		System.out.println("I am from test1");
	}
	static void test2() {
		System.out.println("I am from test2");
	}
	public static void main(String[] args) {
		//System.out.println(j);
		Manager10_StaticContext m1= new Manager10_StaticContext();
		System.out.println(m1.i);
		System.out.println(j);
		m1.test1();
		test2();
		
	}

}
