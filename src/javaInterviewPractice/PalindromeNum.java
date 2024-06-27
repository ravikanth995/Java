package javaInterviewPractice;

public class PalindromeNum {

	public static void main(String[] args) {
		
		int num= 123;
		int rev=0;
		int temp= num;
		
		while(num>0)
		{
			int rem = num%10;
			rev = rev*10+rem;
			num /= 10;
		}
		
		if(temp==rev) {
			System.out.println(temp+"==> Number is Palindrome");
		}
		else
		{
			System.out.println(temp+"==> Number is not Palindrome.");
		}

	}

}
