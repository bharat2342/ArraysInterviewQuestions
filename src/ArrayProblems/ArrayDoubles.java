package ArrayProblems;

import java.util.Arrays;

public class ArrayDoubles 

//This Array doubles with certain conditions

{

	public static void main(String[] args) 
	{
		int[] vector = {5, 17, -3, 8, 0, -7, 12, 15, 20, -6, 6, 4, -2, 16};
        processVector(vector);
        System.out.println("Modified vector: " + Arrays.toString(vector));
    }

    public static void processVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > 0 && (vector[i] % 3 == 0 || vector[i] % 5 == 0)) {
                vector[i] *= 2; // Double positive elements divisible by 3 or 5
            } else if (vector[i] < 0 && vector[i] > -5) {
                vector[i] = (int) Math.pow(vector[i], 3); // Raise negative elements > -5 to the power of 3
            }
        }
    }


	}


