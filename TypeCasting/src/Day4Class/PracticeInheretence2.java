package Day4Class;


class A026{
	A026(){
		System.out.println("DC-A026");
	}
	A026(int i){
		System.out.println("pc-A026");
	}
}
class B026 extends A026{
	B026(){
		System.out.println("DC-B026");
	}
	B026(int i){
		System.out.println("pc -B026");
	}
}
class C026 extends B026{
	C026(){
		
		this(10,20);
		//super(10);
		
		System.out.println("DC-c026");
	}
	C026(int i){
		super(10);
		System.out.println("pc-c026");
	}
	C026(int i, int j){
		this(10);
		System.out.println("pc-c026");
	}
	
}
public class PracticeInheretence2 {
	public static void main(String[] args) {
		C026 c3 = new C026();
	}

}
