package labs;
import java.util.Scanner;

import java.util.Scanner;
public class Lab01 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		System.out.println("Enter a positive integer: ");
		Scanner inKey1 = new Scanner(System.in);
		int input1 = inKey1.nextInt();
		System.out.println("Enter another positive integer: ");
		Scanner inKey2 = new Scanner(System.in);
		int input2 = inKey2.nextInt();
		int base = input1;
		for (int i = 1; i < input2; i++) {
			input1 = input1 * base;
		}
		int res = input1;
		System.out.println(base + "^" + input2 + " = " + res);
	}
	
	
	
	public static void problem02() {
		
		System.out.println("Enter a positive integer: ");
		Scanner inKey = new Scanner(System.in);
		int input = inKey.nextInt();
		
		double num2 = Math.sqrt(input);
		System.out.println(num2 + "\n");
		
		
	}

	
	

	public static void problem03() {
		System.out.println("Length of side A: ");
		Scanner inKey1 = new Scanner(System.in);
		int input1 = inKey1.nextInt();
		System.out.println("Length of side B: ");
		Scanner inKey2 = new Scanner(System.in);
		int input2 = inKey2.nextInt();
		
		int c2 = input1 * input1 + input2 * input2;
		double c = Math.sqrt(c2);
		System.out.println("Hypotenuse = " + c);
		

	}


	
	
	public static void problem04() {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
	
		int input = 1;
		
		while (input != 0) {
			
			System.out.println("Enter a integer: ");
			Scanner inKey1 = new Scanner(System.in);
			input = inKey1.nextInt();
			max = Math.max(max, input);
			min = Math.min(min, input);
		
		}
		System.out.println("Max = " + max);
		System.out.println("Min = " + min);
		
	}
	
	
	
	
	
	
}
