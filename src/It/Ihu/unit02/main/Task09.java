package It.Ihu.unit02.main;

public class Task09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x;
		double fx;
		
		x = 5.84;
		
		if (x <= 3) {
		fx = 9.0;
		} else {
		fx = 1 / (Math.pow(x, 2.0) + 1.0);
		}
		System.out.println("F(x)=" + fx);
	}

}
