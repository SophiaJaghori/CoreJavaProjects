package Day4Class;


class A21{
	A21(){
		System.out.println("Default Constructor _ A21");
	}
}
class A22{
	A22(){
		
	}
	A22(int i){
		System.out.println("DC-A22" + i);
	}
}
class B22 extends A22{
	B22(){
		super(10);//firs solution 
		System.out.println("DC_ B22");
	}
}

public class Manager21 {
	public static void main(String[] args) {
		//A21 a1 = new A21();// this is a calling statment of the constructor 
		B22 b1 = new B22();
		A22 a22 = new A22();
		A22 a23 = new A22(2);
	}

}
