package stringMethods;

public class StringCharOccurance {

	public static void main(String[] args) {
		
	String s = "abcabcabcabc";
	String target = "abc";
	int count=0;
	
	for(int i=0; i<s.length()-target.length()+1; i++)
	{
		
	if(s.substring(i, i+target.length()).equals(target))
	{
	count++;
	}

}System.out.println(count);
}}