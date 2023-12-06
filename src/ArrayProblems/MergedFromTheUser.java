package ArrayProblems;

import java.util.Arrays;
import java.util.Scanner;

public class MergedFromTheUser 
{

	public static void main(String[] args) 
	{
		   {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the first array: ");
		        String[] input1 = scanner.nextLine().split("\\s+");
		        int[] arr1 = new int[input1.length];
		        
		        //To enter the array1 from the user
		        for (int i = 0; i < input1.length; i++) 
		        {
		            arr1[i] = Integer.parseInt(input1[i]);
		        }

		        System.out.print("Enter the second array: ");
		        String[] input2 = scanner.nextLine().split("\\s+");
		        int[] arr2 = new int[input2.length];
		        
		       //To enter the array2 from the user
		        for (int i = 0; i < input2.length; i++)
		        {
		            arr2[i] = Integer.parseInt(input2[i]);
		        }

		        int[] merged = new int[arr1.length + arr2.length];
		        
		        //Actual Merge code
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


	}

