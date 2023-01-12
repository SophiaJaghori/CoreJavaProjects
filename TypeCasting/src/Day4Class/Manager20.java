package Day4Class;

class Father20{
	void drive() {
		System.out.println("I love drinving ");
	}
}
class Son extends Father20{
	void drive() {
		System.out.println("I love driving bike ");//the method overriding annotaion-meta data
		// which means it is not new we can use it from the parent
	}
}
public class Manager20 {
	public static void main(String[] args) {
		Father20 f = new Father20();
		Father20 s = new Son();
		s.drive();
		f.drive();
	}

}
