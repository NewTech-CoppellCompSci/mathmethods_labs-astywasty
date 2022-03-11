package labs;
import java.util.Scanner;


public class Lab02 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;	
		System.out.println("Enter a positive integer: ");
		Scanner inKey1 = new Scanner(System.in);
		int input1 = inKey1.nextInt();
		max = Math.max(max, input1);
		min = Math.min(min, input1);
		System.out.println("Enter another positive integer: ");
		Scanner inKey2 = new Scanner(System.in);
		int input2 = inKey2.nextInt();
		max = Math.max(max, input2);
		min = Math.min(min, input2);	
		int scope = max - min + 1;
		
		for (int i = 0; i < 10; i++) {
			int num = (int) (Math.random() * scope + min);
			System.out.print(num);

			
		}
		System.out.print("");
		
	}
	
	
	
	
	public static void problem02() {
		System.out.println("Enter the radius: ");
		Scanner inKey1 = new Scanner(System.in);
		double rad = inKey1.nextInt();
		System.out.println("Enter the height: ");
		Scanner inKey2 = new Scanner(System.in);
		int height = inKey1.nextInt();
		
		double pi = (Math.PI);
		rad = rad *= rad;
		rad = rad *= pi;
		
		double vol = rad *= height;
		System.out.println(vol);
		
	}

	
	

	public static void problem03() {
	System.out.println("Enter x1: ");
	Scanner inKey1 = new Scanner(System.in);
	double x1 = inKey1.nextInt();
	System.out.println("Enter x2z: ");
	Scanner inKey2 = new Scanner(System.in);
	double x2 = inKey2.nextInt();
	System.out.println("Enter y1: ");
	Scanner inKey3 = new Scanner(System.in);
	double y1 = inKey3.nextInt();
	System.out.println("Enter y2: ");
	Scanner inKey4 = new Scanner(System.in);
	double y2 = inKey4.nextInt();
	double x = x2 -= x1;
	x = x *= x;
	double y = y2 -= y1;
	y = y *= y;
	double xy = x += y;
	double d = Math.sqrt(xy);
	System.out.println("Distance between points = " + d);
	
		
		
	}


	
	
	public static void problem04() {
		
		
		
		
	}
	
	

	
}
