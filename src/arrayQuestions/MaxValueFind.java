package arrayQuestions;

public class MaxValueFind {

	public static void main(String[] args) {
		
		int ar[] = {8,3,1,5,6,3,6,7,9};
		int maxNumInArray = ar[0];
		
		for(int i=0; i<ar.length; i++)
		{
			if(ar[i]>maxNumInArray)
			{
				maxNumInArray = ar[i];
			}
		}System.out.println(maxNumInArray);

	}

}
