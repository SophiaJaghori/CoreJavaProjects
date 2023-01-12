package Day4Class;


class Animal18{
	void drink() {
		System.out.println("water");
	}
}
class Lion18 extends Animal18{// avoid code redundancy and provide code reuseability 
	
}
public class Manager18_Inheritence {
	public static void main(String[] args) {
		Animal18 animal = new Animal18();
		animal.drink();// for every calling statement there should be a perfect definition 
		Lion18 lion = new Lion18();
		lion.drink();
	}

}
