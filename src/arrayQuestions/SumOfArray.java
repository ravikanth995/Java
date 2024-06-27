package arrayQuestions;

import java.util.Arrays;

public class SumOfArray {

	public static void main(String[] args) {
		
		int ar[] = {1,2,4,5,7};
		int sum=0;
		System.out.println("Array Number :"+Arrays.toString(ar));
		for(int i=0; i<ar.length; i++)
		{
			sum += ar[i];
		}
		System.out.println(sum);
	}

}
