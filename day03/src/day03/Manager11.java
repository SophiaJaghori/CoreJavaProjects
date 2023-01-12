package day03;


class Test11{
	int i = 10;
	
	static int j = 20;
	void test1() {
		System.out.println("I am from test1");
		
	}
	static void test2() {
		System.out.println("I am from test2");
		
	}
	
}


public class Manager11 {
	public static void main(String[] args) {
		Test11 t11 = new Test11();
		System.out.println(t11.i);
		t11.test1();
		Test11.test2();// to access the member of 
		System.out.println(Test11.j);
			
		
	}
	void main2() {
		Test11 t1 = new Test11();
		System.out.println(t1.i);
		System.out.println(Test11.j);
		t1.test1();
		Test11.test2();
		
	}

}
