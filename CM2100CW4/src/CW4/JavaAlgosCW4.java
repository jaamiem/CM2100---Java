package CW4;

import java.util.Arrays;

public class JavaAlgosCW4 {	
	public static final int partition1(int[] a, int left, int right)
	{
		int pivot = a[left];
		int i = left+1, j = right;
		
		while( i <= j ){
			while ( a[i] <= pivot ){
				i++;
				System.out.println("Stage 1 // I: " + i);
			}
			while (a[j] >= pivot ){
				j--;
				System.out.println("Stage 2 // J: " + j);
			}
			if ( i < j ) {
				swapIndex(a,i,j);
				System.out.println("Stage 3 // Swap: " + Arrays.toString(a));
			}
		}
		if(a[j] != left){ 
			a[left] = a[j];
			a[j] = pivot;
			System.out.println("Exit loop: " + Arrays.toString(a));
		}
		
		return j; 	
	}
	
	private static final void swapIndex(int[] a, int index1, int index2)
	{
		int temp = a[index1];
		a[index1] = a[index2];
		a[index2] = temp;
	}
	
	
	public static void main(String[] args){
		//int[] numbers = {9,8,7,6,5,4,3,2,1};
		int[] numbers = {24,2,45,20,56,75,2,56,99,53,12};
		
		System.out.println(Arrays.toString(numbers));
		System.out.println(JavaAlgosCW4.partition1(numbers, 0, numbers.length - 1)); 
		System.out.println(Arrays.toString(numbers));
	}
}

//			while( a[i] <= pivot ){ 
//				i++;
//				System.out.println("I: " + i);
//			};
//			
//			while( a[j] >= pivot ){
//				j--;
//				System.out.println("J: " + j);
//			}
//			
//			if(i <= j){
//				int t = a[i];
//				a[i] = a[j];
//				a[j] = t; 
//				System.out.println("Swap IF statement" + Arrays.toString(a));
//			}