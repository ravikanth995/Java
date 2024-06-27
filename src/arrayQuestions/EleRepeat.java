package arrayQuestions;

public class EleRepeat {

	public static void main(String[] args) {
		
		int ar[] = {1,1,1,1,2,3,4};
		int Ele = 1;
		int count=0;
				for(int i=0; i<ar.length; i++)
		{
			if(ar[i]==Ele)
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
