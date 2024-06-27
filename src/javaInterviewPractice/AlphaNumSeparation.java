package javaInterviewPractice;

public class AlphaNumSeparation {

	public static void main(String[] args) {
		
		String str = "ravi123";
		StringBuffer alpha = new StringBuffer();
		StringBuffer num = new StringBuffer();
		
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			if(Character.isLetter(ch))
			{
				alpha.append(ch);
			}
			else
			{
				num.append(ch);
			}
		}
		
		System.out.println("Alpha Letters are :"+alpha);
        System.out.println("Numeric Values are :"+num);
	}

}
