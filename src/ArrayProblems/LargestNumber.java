package ArrayProblems;

public class LargestNumber 
{

	public static void main(String[] args)
	{
		int [] arr = new int [] {1, 2, 3,23, 4, 5};
		int max= arr[0];
		
        System.out.println("Elements of given array: ");  
        //Loop through the array by incrementing value of i  
        for (int i = 0; i < arr.length; i++) 
        {  
            System.out.print(arr[i] + " ");
            if(arr[i]>max)
            	max=arr[i];

	    }
        System.out.println();
        System.out.println("Largest element present in given array: " + max); 
	}

	}