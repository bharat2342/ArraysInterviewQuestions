package ArrayProblems;

import java.util.Arrays;
import java.util.Scanner;

public class RandomNumberInArrayAndSorting 
{
	public static void main(String[] args)
	{
		 Scanner scan = new Scanner(System.in);
	        int arrLength;
			System.out.println("Enter your array's length");
			arrLength = scan.nextInt();
			int [] arr = new int [arrLength]; // between [] array's length
			for(int i = 0 ; i<arrLength ; i++)
			{
				arr[i] = (int) (Math.random()*100 + 1);
				
				for(int j=i+1;j<arr.length;j++)
				{
					int tmp = 0;  
					if (arr[i] > arr[j])   
					{  
					tmp = arr[i];  
					arr[i] = arr[j];  
					arr[j] = tmp;  
					}  
				}
				System.out.println(Arrays.toString(arr));
	        	System.out.println(arr[i]);
	        }
			
	         

}
}
