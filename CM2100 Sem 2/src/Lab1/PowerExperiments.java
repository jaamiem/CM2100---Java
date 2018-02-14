package Lab1;

public class PowerExperiments {

    // class level data (that can be accessed from inside all methods of the class)
    static int count;       // for counting characteristic ops
    
    static int reps = 10000; /* number of times to repeat the power calcuation
                              * doing it multiple times and averaging 
                              * gives a more accurate time */

    public static void main(String[] args) {

        double x = 2.0; // number to raised to powers in testing
        
        int step = 1, upper = 150; // for controlling loop that determines which powers to calculate
        
        System.out.println("*** Test simple power algorithm for powers of " + x + " ***");
        System.out.println("*** Calculating each power " + reps + " times ***");
        System.out.println("N \t ops \t time(ns) \t value");
        for (int N = 2; N <= upper; N += step) {
            powerExperimentSimple(x, N);
        }
    }

    // Java implementation of Simple Power algorithm
    public static double power(double x, int n) {
        // returns x^n (where n is non-negative)	
        double p = 1;
        for (int i = 1; i <= n; i++) {
            p *= x;
            count++; // increments the characteristic operation count
        }
        return p;
    }
	
	// Java implementation of Smart Power algorithm
	public static double smartPower(double b, int n){
		// Returns x^n (where n is non-negative)
		double p = 1, q = b;
		int m = n;
		while ( m > 0 ) {
			if ( m % 2 != 0 ) p *= q;
			m /= 2;
			q *= q;
		}
		return q;
	}
	

    /* method that repeats power calculation reps times and averages
       the time and operations counts, and displays results */
    public static void powerExperimentSimple(double x, int N) {
        count = 0;
        long start = System.nanoTime();
        for (int i = 0; i < reps; i++) {
            power(x, N);
        }
        long end = System.nanoTime();
        System.out.println(N
                + "\t " + 1.0 * count / reps
                + "\t " + 1.0 * (end - start) / reps
                + "\t " + power(2, N)
        );
    }
}
