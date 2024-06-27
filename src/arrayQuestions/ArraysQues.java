package arrayQuestions;

import java.util.Arrays;

public class ArraysQues {

	public static void main(String[] args) {
		
		int ar [][] = {{1,2,3,4,5}, {6,7,8,9,10}};
		System.out.println("Total Length :"+ar.length);
		
		for(int i=0 ; i<ar.length; i++)
		{
			for(int j=0; j<ar[i].length; j++)
			{
				System.out.print(ar[i][j]+" ");
			}
		}System.out.println();
		
		System.out.println("-".repeat(70));
		
		for(int x[]: ar)
		{
			for(int y : x)
			{
				System.out.print(y+" ");
			}
		}System.out.println();
		
				
	}

}
