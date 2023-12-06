package ArrayProblems;

public class Array1stMax2ndMax2Method2
{

	public static void main(String[] args) 
	{
		
		 int[] a = {2, 3, 54, 55, 6, 7, 99, 8};

	        int max1 = a[0];                       // Initialize max1 with the first element
	        int max2 = a.length > 1 ? a[1] : a[0]; // Initialize max2 with the second element, or the first element if there's only one element

	        for (int i = 2; i < a.length; i++)
	        {
	            int num = a[i];
	            if (num > max1) 
	            {
	                max2 = max1;
	                max1 = num;
	            } 
	            else if (num > max2 && num != max1) 
	            {
	                max2 = num;
	            }
	        }

	        System.out.println("First Max: " + max1);
	        System.out.println("Second Max: " + max2);
		

	}

}




