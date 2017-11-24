package squares;

public class Squares_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x[] = { 0.0, 0.2, 0.4, 0.6, 0.8, 1.0, 1.2 };
		double y[] = { 1.0, 2.2, 3.5, 5.3, 5.8, 7.1, 7.8 };
		double theta[] = new double[2];

		Squares_lib slib = new Squares_lib(x, y);
		
		for(int i = 0; i < 100; i++){
          theta = slib.getDx();
          System.out.println(i+" : theta[0] = "+theta[0]);
		  System.out.println(i+" : theta[1] = "+theta[1]);
		  System.out.println(i+" : Objective function = "+slib.getObject());
		 }

	
	}

}
