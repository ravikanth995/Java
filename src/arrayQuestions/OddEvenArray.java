package arrayQuestions;

public class OddEvenArray {

	public static void main(String[] args) {
		
		int ar[] = {1,2,3,4,5,6};
		int oddNum = 0;
		int evenNum = 0;
		
		for(int i=0; i<ar.length; i++)
		{
			if(ar[i]%2==0)
			{
				evenNum++;
			}
			else
			{
				oddNum++;
			}
		}
		System.out.println("Even Number :"+evenNum);
		System.out.println("Odd Num :"+oddNum);
	}

}
