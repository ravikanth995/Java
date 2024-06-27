package stringMethods;

import java.util.Arrays;

public class SplitString {

	public static void main(String[] args) {


		String a = "Hello , !@1233";
		
		System.out.println(a);
		
		//Before Spliting, convert it into Array
		
		String ar[] = a.split(",");
		System.out.println(Arrays.toString(ar));
		System.out.println("Index 0 == "+ar[0]+"\nIndex 1 ="+ar[1]);
		
		String arr[] = ar[1].split("!");
		System.out.println(Arrays.toString(arr));
		
		System.out.println(arr[1]);
		
		

	}

}
