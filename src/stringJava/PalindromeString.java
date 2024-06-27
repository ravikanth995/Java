package stringJava;

public class PalindromeString {

	public static void main(String[] args) {
		String name = "madam";
		String rev = "";
		String temp = name;
		
		for(int i=name.length()-1; i>=0; i--)
		{
			rev = rev+name.charAt(i);
		}
		System.out.println("Reversed String is :"+rev);
		if(temp.equals(rev))
		{
			System.out.println(temp+" is Palindrome");
		}
		else
		{
			System.out.println(temp+" is not Palindrome");
		}

	}

}
