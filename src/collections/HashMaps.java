package collections;

import java.util.HashMap;

public class HashMaps {

	public static void main(String[] args) {
		HashMap<Integer, String> hp = new HashMap<>();
		
		hp.put(1, "Rav");
		hp.put(2, "Ravi");
		hp.put(3, "Shalini");
		
		System.out.println(hp);
		
		hp.remove(1);
		System.out.println(hp);
		
		System.out.println(hp.keySet());
		System.out.println(hp.values());
		
		System.out.println(hp.entrySet());
		
		for(int k: hp.keySet())
		{
			System.out.println(k+" "+hp.get(k));
		}

	}

}
