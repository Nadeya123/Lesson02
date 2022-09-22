package It.Ihu.unit02.main;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;
		double a;
		double b;
		double c;
		double d;
		double iskomoe2;

		sc = new Scanner(System.in);
		
		System.out.print("> ");
		a = sc.nextDouble();
		
		System.out.print("> ");
		b = sc.nextDouble();
		
		System.out.print("> ");
		c = sc.nextDouble();
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);

		iskomoe2 = (((b + Math.sqrt((Math.pow(b, 2.0)) + (4 * a * c))) / (2.0 * a)) - (((Math.pow(a, 3.0)) * c) + b));
		
		System.out.println("iskomoe =" + iskomoe2);
	}	

}
