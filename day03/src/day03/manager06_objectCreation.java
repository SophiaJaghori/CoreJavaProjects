package day03;


class Student07{
	int sid;
	String sname;
}
class Employee07{
	int eid;
	String ename;
}
public class manager06_objectCreation {
	
	public static void main(String[] args) {
		Student07 st = new Student07();//new is to create object
		// of the class 
		Employee07 em = new Employee07();
		st.sid = 33300;
		st.sname = "Neman";
		System.out.println(st.sid);
		System.out.println(st.sname);
		
		
	}

}
