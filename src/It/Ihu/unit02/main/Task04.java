package It.Ihu.unit02.main;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;
		double a;
		double b;
		double iskomoe1;
		
		sc = new Scanner(System.in);
		
		System.out.print("> ");
		a = sc.nextDouble();
		
		System.out.print("> ");
		b = sc.nextDouble();
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		iskomoe1 = a + b;
		
		System.out.println("iskomoe =" + iskomoe1);
	}

}
