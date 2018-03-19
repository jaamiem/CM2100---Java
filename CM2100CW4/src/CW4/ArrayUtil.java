package CW4;

import java.util.Random;

/**
 * This class contains utility methods for array manipulation.
 */
public class ArrayUtil {

    private static Random generator = new Random();

    /**
     * Creates an array filled with objects storing random values.
     *
     * @param length the length of the array
     * @param n the number of possible random values
     * @return an array filled with length numbers between 0 and n - 1
     */
    public static Comparable[] randomIntArray(int length, int n) {
        Comparable[] a = new Integer[length];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Integer(generator.nextInt(n));
        }
        return a;
    }

    /**
     * Swaps two entries of an array.
     *
     * @param a the array/comparable
     * @param index1 the first position to swap
     * @param index2 the second position to swap
     */
	public static final void swapIndex(int[] a, int index1, int index2)
	{
		int temp = a[index1];
		a[index1] = a[index2];
		a[index2] = temp;
		Main.cCounter++;
	}
	public static final void swapIndex(Comparable[] a, int index1, int index2)
	{
		Comparable temp = a[index1];
		a[index1] = a[index2];
		a[index2] = temp;
	}
	
	/**
     * Finds the median value of an array
     *
     * @param a the array/comparable
     * @param left the left side of the (sub)array
     * @param right the right side of the (sub)array
     */
	public static int medianOfThree (Comparable[] a, int left, int mid, int right) {
	 /* Return median position in array of elements
	 * a[left], a[mid], and a[right] */
	 if (a[left].compareTo(a[mid]) < 0) {
		if (a[mid].compareTo(a[right]) < 0) 
			return mid;
		else if(a[left].compareTo(a[right]) < 0) 
			return right;
		else 
			return left;
	 } else {
		if (a[mid].compareTo(a[right]) > 0) 
			return mid;
		else if (a[left].compareTo(a[right]) > 0) 
			return right;
		else 
			return left;
	 }
	} 
}
