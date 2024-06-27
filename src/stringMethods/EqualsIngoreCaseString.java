package stringMethods;

public class EqualsIngoreCaseString {

	public static void main(String[] args) {
		
		String a = new String("ravikanth");
		String b = new String("RAVIKANTH");
		
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a.equals(b));

	}

}
