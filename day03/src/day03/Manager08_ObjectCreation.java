package day03;

public class Manager08_ObjectCreation {
	public static void main(String[] args) {
		Employee08 em1 = new Employee08();
		Employee08 em2 = new Employee08();
		Employee08 em3 = new Employee08();
		
		em1.emp_id = 988;
		em1.emp_name = "Nocole";
		em1.emp_salary = 100;
		em1.isMarried = true;
		System.out.println("employee 1's information is: " + em1.emp_id + " "
				+ em1.emp_name + " "+ em1.emp_salary + " "+ em1.isMarried);
		
		em2.emp_id = 9884;
		em2.emp_name = "laila";
		em2.emp_salary = 1000;
		em2.isMarried = false;
		
		System.out.println("employee 2's information is: " + em2.emp_id + " "
				+ em2.emp_name + " "+ em2.emp_salary + " "+ em2.isMarried);
		
		em3.emp_id = 88;
		em3.emp_name = "Nile";
		em3.emp_salary = 10000;
		em3.isMarried = true;
		System.out.println("employee 3's information is: " + em3.emp_id + " "
				+ em3.emp_name + " "+ em3.emp_salary + " "+ em3.isMarried);
	}

}
class Employee08{
	int emp_id;
	String emp_name;
	double emp_salary;
	boolean isMarried;
	
}
