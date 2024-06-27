package javaInterviewPractice;

public class DigitCountForLoop {

	public static void main(String[] args) {
		int num = 123845;
		int count=0;
		for(; num!=0; num /= 10)
		{
			count++;
		}
		System.out.println("Number of Digits :"+count);

	}

}
