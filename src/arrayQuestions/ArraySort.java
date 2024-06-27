package arrayQuestions;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		int ar[] = {6, 3, 2, 8, 1, 7};
		System.out.println(Arrays.toString(ar));
		
		System.out.println("Before Array Sorting...");
		System.out.println("-".repeat(40));
		
		Arrays.sort(ar);
		System.out.println("-".repeat(40));
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(ar));
		

	}

}
