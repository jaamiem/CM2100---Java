package CW4;

import java.util.Arrays;

public class Main {
	
	static int cCounter = 0;
	
	public static void main(String[] args)
	{
		//int[] numbers = {9,8,7,6,5,4,3,2,1};
		int[] numbers = {24,2,45,20,56,53,2,56,99,100,12};
		Comparable[] nums = {24,2,45,20,56,53,2,56,99,100,12};

		System.out.println(Arrays.toString(nums));
		//JavaAlgosCW4.quickSort1(numbers, 0, numbers.length - 1); 
		JavaAlgosCW4.quickSort2(nums, 0, nums.length - 1); 
		System.out.println(Arrays.toString(nums));
	}
}