package collections;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSets {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		hs.add("Sting");
		hs.add('a');
		hs.add(true);
		hs.add(null);
		hs.add(null);
		hs.add(100);
		hs.add(10.8);
		
		System.out.println(hs);
		System.out.println(hs.size());
		
		ArrayList al = new ArrayList(hs);
		
		System.out.println(hs.size());
		for(Object x: hs)
		{
			System.out.println(x);
		}

	}

}
