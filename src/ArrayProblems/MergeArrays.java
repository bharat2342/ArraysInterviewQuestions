package ArrayProblems;

import java.util.Arrays;

public class MergeArrays
{

	public static void main(String[] args) 
	{
		int[] arr1 = {1, 2, 3, 4,10};
		int[] arr2 = {5, 6, 7, 8,11};
		int[] merged = new int[arr1.length + arr2.length];

		for (int i = 0, j = 0; i < arr1.length || j < arr2.length; ) 
		{
		    if (i < arr1.length)
		    {
		        merged[i + j] = arr1[i];
		        i++;
		    }
		    if (j < arr2.length) 
		    {
		        merged[i + j] = arr2[j];
		        j++;
		    }
		}

		System.out.println(Arrays.toString(merged));

		
		
		

	}

}
