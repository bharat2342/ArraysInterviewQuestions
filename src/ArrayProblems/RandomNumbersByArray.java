package ArrayProblems;

import java.util.Arrays;
import java.util.Scanner;

public class RandomNumbersByArray {

	public static void main(String[] args) 
	{
		 Scanner scan = new Scanner(System.in);
	        int arrLength;
			System.out.println("Enter your array's length");
			arrLength = scan.nextInt();
			Integer [] arr = new Integer [arrLength]; // between [] array's length
			for(int i = 0 ; i<arrLength ; i++)
			{
	        	arr[i] = (int) (Math.random()*10 + 1);
	        	
	        }
			 //System.out.println( "before sorting" +Arrays.toString(arr));
	         //Arrays.sort(arr);
	         System.out.println(Arrays.toString(arr));

	}

}
