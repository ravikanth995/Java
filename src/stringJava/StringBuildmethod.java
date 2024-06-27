package stringJava;

public class StringBuildmethod {

	public static void main(String[] args) {
		
//		StringBuilder sb = new StringBuilder("Welcome");
//		StringBuilder sb1 = new StringBuilder(" To Java");
//		System.out.println(sb.append(sb1));
//		
//		System.out.println(sb);
		
		String s1 = "Hello";
		String s2= new String("Hello");
		
		String s3 = s2;
		
		System.out.println("Is S1 Object equal to S2? :"+(s1==s3));
		System.out.println("Is S1 content equal to S2? :"+s1.equals(s3));
		
		
		

	}

}
