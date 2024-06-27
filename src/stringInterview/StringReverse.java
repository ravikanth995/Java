package stringInterview;

public class StringReverse {

	public static void main(String[] args) {
		
		String r =  "madam";
		String rev="";
		String temp=r;
		
		for(int i=r.length()-1; i>=0; i--)
		{
			rev = rev+r.charAt(i);
		}
		System.out.println(rev);
		if(temp.equals(rev))
		{
			System.out.println(temp+" String is Palindrome");
		}
		else
		{
			System.out.println(temp+" is not Palindrome");
		}

	}

}
