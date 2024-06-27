package arrayQuestions;

public class SearchEle {

	public static void main(String[] args) {
		
		int ar[] = {1,2,3,4,5,6};
		int searchEle = 5;
		boolean flag = false;
		for(int i=0; i<ar.length; i++)
		{
			if(ar[i]==searchEle)
			{
				System.out.println("Element Found");
				flag = true;
				break;
			}
		}
		
		if(flag==false)
		{
			System.out.println("Element Not Found.");
		}
		

	}

}
