package ArrayProblems;

public class Array1stMax2ndMax
{

	public static void main(String[] args) 
	{
		
		int[] a = {2, 3, 44, 55, 6, 7, 99, 8};
        int max1 = Integer.MIN_VALUE; // Initialize max1 to the smallest possible integer
        int max2 = Integer.MIN_VALUE; // Initialize max2 to the smallest possible integer

        for (int i = 0; i < a.length; i++) 
        {
            int num = a[i];
            max1 = num > max1 ? num : max1;              // Update max1 if num is greater
        }

        for (int i = 0; i < a.length; i++) 
        {
            int num = a[i];
            max2 = (num != max1 && num > max2) ? num : max2; // Update max2 only if num is not equal to max1 and greater than max2
        }

        System.out.println("First Max: " + max1);
        System.out.println("Second Max: " + max2);
		
		

	}

}





//This is using the if-else statements
/*

 int[] a = {2, 3, 44, 55, 6, 7, 99, 8};
        int max1 = Integer.MIN_VALUE; // Initialize max1 to the smallest possible integer
        int max2 = Integer.MIN_VALUE; // Initialize max2 to the smallest possible integer

        for (int num : a) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num != max1) {
                max2 = num;
            }
        }

        System.out.println("First Max: " + max1);
        System.out.println("Second Max: " + max2);
*/