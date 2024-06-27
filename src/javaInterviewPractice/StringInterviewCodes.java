package javaInterviewPractice;

public class StringInterviewCodes {

	public static void main(String[] args) {
		
		String str = "Alpha1234";
	    StringBuffer sb = new StringBuffer();
	    StringBuffer num = new StringBuffer();

	    for(int i=0; i<str.length(); i++)
	    {
	    	char ch = str.charAt(i);
	    	if(Character.isLetter(ch))
	    	{
	    		sb.append(ch);
	    	}
	    	else
	    	{
	    		num.append(ch);
	    	}
	    }
	    
	    System.out.println(sb);
	    System.out.println(num);
	    	    
		
		
	
	}

}
