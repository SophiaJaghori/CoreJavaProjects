package day03;

import java.util.Scanner;

public class ApplicationEmployee {
	public static void main(String[] args) {
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		EmployeeObjectArray emp[] = null;
		do {
			System.out.println("1-Create a record");
			System.out.println("2-Read  all record");

			System.out.println("3-Update a record");

			System.out.println("4-Delete a record");

			System.out.println("5-Exit");
			System.out.println("please enter your choice ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("How many emplye you want create? ");
				int size = sc.nextInt();
				emp = new EmployeeObjectArray[size];
				EmployeeDAO.create(emp, size);
				break;
			case 2:
				EmployeeDAO.read(emp);
				break;
			case 3:
				EmployeeDAO.update(emp);
				break;
			case 4:
				EmployeeDAO.delete(emp);
				break;
			case 5:
				
				break;
			
			}


			
		}while(choice !=5);
	}

}