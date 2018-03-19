package CW4;

import java.util.*;

public class JavaAlgosCW4 {	
	
	/**
     * To partition the passed array into ascending order going a[left...right]

     *
     * @param a the array.
     * @param left the left side of the (sub)array.
     * @param right the right side of the (sub)array.
     * @return i to pass values into recursion.
     */
	private static final int partitionOne(int[] a, int left, int right)
	{
		//1:
		int pivot = right;
		//2:
		int i = left, j = right;
		//3:
		while( i < j )
		{
			if ( a[i] <= a[pivot] )
			{
				i++;
				System.out.println("Stage 1 // I: " + i);
			}
			if( a[i] > a[pivot])
			{
				if(( a[i] > a[pivot] ) && ( a[j] <= a[pivot] ))
				{
					ArrayUtil.swapIndex(a,i,j);
					i++;
				}
				if( a[j] > a[pivot])
				{
					j--;
					System.out.println("Stage 2 // J: " + j);
				}	
			}
			
			if ( i < j ) 
			{
				ArrayUtil.swapIndex(a,i,j);
				System.out.println("Stage 3 // Swap: "
						+ " a[i="+i+"] = " + a[i]
						+ " a[j="+j+"] = " + a[j]
						+ Arrays.toString(a));
			}
		}
		ArrayUtil.swapIndex(a,i,pivot);
		return i;
	}
	
	/**
     * To partition the passed array into ascending order going a[left...right]

     *
     * @param a the array.
     * @param left the left side of the (sub)array.
     * @param right the right side of the (sub)array.
     * @return j to pass values into recursion.
     */
	private static final int partitionTwo(Comparable[] a, int left, int right)
	{
		//1:
		int mid = ( right - left ) / 2;
		int median = ArrayUtil.medianOfThree(a, left, mid, right);
		
		//2:
		if (median != left){
			ArrayUtil.swapIndex(a, median, left);
		}
		
		//3:
		Comparable pivot = a[left];
		
		//4:
		int i = left, j = right;
		
		//5:
		while( i <= j )
		{
			//5.1:
			while(( i <= j ) && (a[i].compareTo(pivot) <= 0 )){
				i++;
				System.out.println("Stage 1 // I: " + i);
			}
			//5.2:
			while(( j >= i ) && (a[j].compareTo(pivot) >= 0 )){
				j--;
				System.out.println("Stage 2 // J: " + j);
			}
			//5.3:
			if ( i < j ) {
				ArrayUtil.swapIndex(a,i,j);
				System.out.println("Stage 3 // Swap: "
						+ " a[i="+i+"] = " + a[i]
						+ " a[j="+j+"] = " + a[j]
						+ Arrays.toString(a));
			}
		}
		//6:
		if( j != left ){
			a[left] = a[j];
			a[j] = pivot;
			System.out.println("End Loop // Swap: "
						+ " a[left="+left+"] = " + a[left]
						+ " a[j="+j+"] = " + a[j]
						+ " pivot = " + pivot
						+ Arrays.toString(a));
		}
		//7:
		return j;
	}

	public static void quickSort(int[] a, int i, int j)
	{
		if ( i >= j ) return;
		int p = partitionOne( a, i, j );
		quickSort( a, i, p-1 );
		quickSort( a, p+1, j );
	}
	public static void quickSort2(Comparable[] a, int i, int j) 
	{
		if ( i < j ) 
		{
			int p = partitionTwo( a, i, j );
			quickSort2( a, i, p - 1 );
			quickSort2( a, p + 1, j );
		}
	}

}