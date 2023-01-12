package Day4Class;



class A{
	A(){
		this(10);
		System.out.println("DC-A");
	}
	A(int i){
		System.out.println("pc-A");
	}
}
class B extends A{
	B(){
		this(10);
		System.out.println("DC-B");
	}
	B(int i){
		System.out.println("PC-B");
	}
}
class C extends B{
	C(){
		this(10,20);
		System.out.println("DC-C");
	}
	C(int i){
		super(10);
		System.out.println("PC-C");
	}
	C(int i, int j){
		this(10);
		System.out.println("PC1-C");
	}
}

public class PracticeInheritence {
	public static void main(String[] args) {
		C c1 = new C(10,20);
		System.out.println("first one Done! ");
		C c2 = new C(10);
		System.out.println("Second one Done! ");
		C c3 = new C();
		System.out.println("Third one Done! ");
	}

}
