package It.Ihu.unit02.main;

public class Task08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		double b;
		double h;
		double y;
		
		a = 1;
		b = 15;
		h = 0.5;	
		
		System.out.println("---------------------------------");
		System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
		System.out.println("---------------------------------");
		for(double x = a; x <=b; x = x + h) {
		y = (2 * Math.tan(x / 2.0)) + 1;
		System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
		}
		System.out.println("---------------------------------");
	}

}
