package day03;

import java.util.Scanner;

public class CompareNumbers {
	public static void main(String[] args) {
		int []arr1 = new int[5];
		arr1[0]= 3;
		arr1[1]= 33;
		arr1[2]= 23;
		arr1[3]= 4;
		arr1[4]= 12;
		arrayItemsCheck(arr1);
		
	}
	public static void arrayItemsCheck(int[]arr) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 2 numbers range 1 to 40 ");
		int num1 = sc.nextInt();
		if(num1 <1 || num1>40) {
			System.out.println("you enterd the out range numbers. Please try again");
		}
		int num2 = sc.nextInt();
		if(num2 <1 || num1>40) {
			System.out.println("you enterd the out range numbers. Please try again");
		}
		System.out.println("your first number was "+ num1);
		System.out.println("your second number was "+ num2);
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]== num1 && arr[i]== num2) {// checks to see if num1 or num2
				// is found in the array.
				System.out.println("It s a Bingo!");
			}
			else {
				break;
			}
			
		}
	}

}
