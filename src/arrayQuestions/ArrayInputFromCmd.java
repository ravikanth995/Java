package arrayQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInputFromCmd {

	public static void main(String[] args) {
		
		int ar[] = new int [5];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<ar.length; i++)
		{
			System.out.print("Enter Number at :"+i+" :");
			ar[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(ar));

	}

}
