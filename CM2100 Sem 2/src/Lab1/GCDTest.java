package Lab1;

/** GREATEST COMMON DIVISOR (GCD)
 * functions to discover the GCD of two specified integers
 *
 * @author Jamie Muir
 */
public class GCDTest {
	public static void main(String args[]) {
		System.out.println(gcd(77,22));
		System.out.println(gcdVerbose(140,24));
	}

	public static int gcd(int m, int n) {
		int x = m, y = n;
		while( x % y != 0) { // While X/Y has a remainder
			int r = x % y; // r = remainder
			x = y; y = r;
		}
		return y;
	}
	
	public static int gcdVerbose(int m, int n){
		int x = m, y = n;
		while( x % y != 0 ) {
			int r = x % y;
			System.out.println("x = "+x+"\ty = "+y+"\tr = x % y = "+r);
			x = y; y = r;
		}
		return y;
	}
	
	public static long gcd(long m, long n){
		long x = m, y = n;
		while( x % y != 0) {
			long r = x % y;
			x = y; y = r;
		}
		return y;
	}
}



















