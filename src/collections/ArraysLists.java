package collections;

import java.util.ArrayList;
import java.util.List;

public class ArraysLists {

	public static void main(String[] args) {
		
		List myList = new ArrayList<>();
		
		myList.add(100);
		myList.add("String");
		myList.add('c');
		myList.add(true);
		myList.add(null);
		myList.add(null);
		myList.add(100);
		
		System.out.println(myList);
		System.out.println(myList.size());
		for(int i=0; i<myList.size(); i++)
		{
			System.out.print(myList.get(i)+" ");
		}System.out.println();
	    
		myList.remove(6);
		System.out.println(myList);
		
		myList.add(6, 100);
		System.out.println(myList);
		
		
	
	}
	
	

}
