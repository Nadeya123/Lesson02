package It.Ihu.unit02.main;

public class Task07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x;
		double y;
		double z;
		double fx;
		
		x = 6.43;
		y = -45.93;
		z = 2.11;
		
		if (x  >= 0) {
		fx = Math.pow(x, 2.0);
		} else {
		fx = Math.pow(x, 4.0);
		}
		System.out.println("F(x)=" + fx);
		
		if (y  >= 0) {
		fx = Math.pow(x, 2.0);
		} else {
		fx = Math.pow(x, 4.0);
		}
		System.out.println("F(y)=" + fx);
		
		if (z  >= 0) {
		fx = Math.pow(x, 2.0);
		} else {
		fx = Math.pow(x, 4.0);
		}
		System.out.println("F(z)=" + fx);

	}

}
