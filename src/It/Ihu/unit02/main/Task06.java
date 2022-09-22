package It.Ihu.unit02.main;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;
		double a;
		double b;
		double c;
		double d;
		double iskomoe6;
		
		sc = new Scanner(System.in);
		
		System.out.print("> ");
		a = sc.nextDouble();
		
		System.out.print("> ");
		b = sc.nextDouble();
		
		System.out.print("> ");
		c = sc.nextDouble();
		
		System.out.println("> ");
		d = sc.nextDouble();
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);

		iskomoe6 = ((a / c) * (b / d)) - (((a * b) - c) / (c * d));
		
		System.out.println("iskomoe =" + iskomoe6);
	}

}
