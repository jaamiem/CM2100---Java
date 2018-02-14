package Lab1;

/**
 *
 * @author 1607046
 */
public class SquareRootTest {
	public static void main(String args[]){
		System.out.println(sqrt(2322132312337.22));
	}
	
	public static double sqrt(double x){
		double r = ( 1.0 + x ) /2;
		while(Math.abs( r * r/x - 1.0 ) >= 0.00005 ){
			System.out.println(r);
			r = ( r + x/r )/2;
		}
		return r;
	}
}
