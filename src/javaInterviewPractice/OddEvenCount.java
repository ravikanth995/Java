package javaInterviewPractice;

public class OddEvenCount {

	public static void main(String[] args) {
		
		int num = 12345;
		int oddCount = 0;
		int evenCount=0;
		
		while(num!=0)
		{
			if(num%2==0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
			num /= 10;
		}

		System.out.println(evenCount);
		System.out.println(oddCount);
	}

}
