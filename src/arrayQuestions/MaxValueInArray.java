package arrayQuestions;

public class MaxValueInArray {

	public static void main(String[] args) {
		
		int ar[] = {1,5,2,6,3,8,4,9};
		int max = ar[0];
		
		//Reading the data by Using Loop
		for(int i=0; i<ar.length; i++)
		{
			//Logic
			if(ar[i]>max)
			{
				max= ar[i];
			}
		}System.out.println(max);
		
		

	}

}
