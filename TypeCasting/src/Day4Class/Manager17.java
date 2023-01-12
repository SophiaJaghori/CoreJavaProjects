package Day4Class;

public class Manager17 {
	int i;
	boolean b;
	public static void main(String[] args) {
		new Manager17().test();// showing the difference between local and global variable 
		
	}
	void test() {
		int j=0;
		System.out.println(i);
		System.out.println(b);
		System.out.println(j);
	}

}
