/** Draws ths Sierpinski Triangle fractal. */
public class Sierpinski {
	
	public static void main(String[] args) {
		sierpinski(Integer.parseInt(args[0]));
	}



	// Draws a Sierpinski triangle of depth n on the standard canvass.
	public static void sierpinski (int n) {
		StdDraw.setScale(0,1);

		double x1 = 0.1;
		double y1 = 0.1;
		double x2 = 0.9;
		double y2 = 0.1;
		double x3 = 0.5;
		double y3 = 0.1 + Math.sqrt(3) / 2 * 0.8;

		sierpinski(n, x1, x2, x3, y1, y2, y3);
	}
	
	// Does the actual drawing, recursively.
	private static void sierpinski(int n, double x1, double x2, double x3,
		                                 double y1, double y2, double y3) {
		if (n == 0){

		StdDraw.line(x1, y1, x2, y2);
		StdDraw.line(x2, y2, x3, y3);
		StdDraw.line(x3, y3, x1, y1);
		return;
		}


		double mid12x = (x1 + x2) / 2.0;
        double mid12y = (y1 + y2) / 2.0;
        double mid23x = (x2 + x3) / 2.0;
        double mid23y = (y2 + y3) / 2.0;
        double mid31x = (x3 + x1) / 2.0;
        double mid31y = (y3 + y1) / 2.0;
	
       
		sierpinski(n - 1, x1, mid12x, mid31x, y1, mid12y, mid31y);
        sierpinski(n - 1, mid12x, x2, mid23x, mid12y, y2, mid23y);
        sierpinski(n - 1, mid31x, mid23x, x3, mid31y, mid23y, y3);
	}
}
