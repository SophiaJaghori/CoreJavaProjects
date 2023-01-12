package day03;

public class Manager12 {
	int x = 200;
	void test1() {
		int i = 100;// local variable
		System.out.println(x);
		System.out.println(i);
	}
	void test2() {
		System.out.println(x);// x is global variable
	}
	public static void main(String[] args) {
		Manager12 m1 = new Manager12();
		m1.test1();
		m1.test2();
	}

}
