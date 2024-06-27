package javaInterviewPractice;

public class ReverseNumber {

	public static void main(String[] args) {
		int nums = 1234;
		int rev=0;
		while(nums>0)
		{
			int rem = nums%10;
			rev = rev*10+rem;
			nums /= 10;
			
		}
		System.out.println(rev);
		

	}

}
