package arrayQuestions;

import java.util.Arrays;

public class ArraySum {

	public static void main(String[] args) {
		
		int ar [] = {2,3,4,6};
		int sum=0;
		System.out.println(Arrays.toString(ar));
		
		for(int i=0; i<ar.length; i++)
		{
			sum += ar[i];
			System.out.println(sum);
		}
            System.out.println(sum);
	}

}
