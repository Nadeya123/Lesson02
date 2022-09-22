package It.Ihu.unit02.main;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc;
		double a;
		double b;
		double c;
		double iskomoe;
		
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

		iskomoe = Math.pow(a, 2.0) - Math.pow((a - b), 2.0) + Math.log((Math.pow(b, 2.0)) + 1.0);
		
		System.out.println("iskomoe =" + iskomoe);
	}

}
