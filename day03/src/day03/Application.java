package day03;
/*
 * A program to demonstrate an array of object
 * Array is reffernce data type
 */

public class Application {
	public static void main(String[] args) {
//		EmployeeObjectArray employ[] = new EmployeeObjectArray[2];
//		EmployeeObjectArray emp1 = new EmployeeObjectArray();
//		emp1.setEmpId(55);
//		emp1.setEmpName("Hanna");
//		emp1.setEmpSalary(100);
//		
//		EmployeeObjectArray emp2 = new EmployeeObjectArray();
//		emp2.setEmpId(505);
//		emp2.setEmpName("Hara");
//		emp2.setEmpSalary(1000);
//		
//		employ[0] = emp1;
//		employ[1] = emp2;
//		
//		for(EmployeeObjectArray emp: employ) {
//			System.out.println();
//		}
		Product pro[] = new Product[5];// creating the array of Product
		
		Product p1 = new Product();// creating employee1 object
		Product p2 = new Product();
		Product p3 = new Product();
		Product p4 = new Product();
		Product p5 = new Product();
		
		p1.setProductId(1);// setting the values
		p1.setProductName("Cloths");
		p1.setProductPrice(2.33);
		
		p2.setProductId(122);
		p2.setProductName("Dishes");
		p2.setProductPrice(22.33);
		
		
		p3.setProductId(188);
		p3.setProductName("fruits");
		p3.setProductPrice(2.33);
		
		p4.setProductId(111);
		p4.setProductName("Vegitables");
		p4.setProductPrice(1.33);
		
		p5.setProductId(199);
		p5.setProductName("Dairy");
		p5.setProductPrice(0.33);
		
		pro[0] = p1; // passing each employee into each index
		pro[1] = p2;
		pro[2] = p3;
		pro[3] = p4;
		pro[4] = p5;
		
		for(int i = 0; i<pro.length; i++) {// looping throw each employee
			System.out.println(pro[i].getProductId());// printing the information
			System.out.println(pro[i].getProductName());
			System.out.println(pro[i].getProductPrice());
			
		
			
		}
		System.out.println();
		
		
	}

}
