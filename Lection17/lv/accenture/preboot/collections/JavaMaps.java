package lv.accenture.preboot.collections;

import java.util.HashMap;

public class JavaMaps {

	public static void main(String[] args) {
		
		HashMap<String, String> catDictionary = new HashMap<>();
		catDictionary.put("lv", "Kakis");
		catDictionary.put("en", "Cat");
		catDictionary.put("ru", "Kot");
		catDictionary.put("de", "Die Katze");
		catDictionary.put("es", "Gato");
		catDictionary.put("jp", "Neko");
		
		System.out.println(catDictionary);
		
		String jpCat = catDictionary.get("jp");
		System.out.println("Cat in japaneese : " + jpCat);
		
		String noCat = catDictionary.get("no");
		System.out.println("Cat in no language : " + noCat);
		
		System.out.println("Have no cat : " + (noCat == null));
		
		if(noCat == null) {
			catDictionary.put("no", "katt");
		}
		
		String norwegianCat = catDictionary.get("no");
		System.out.println("Cat in no language : " + norwegianCat);
		
		boolean haveLtTranslation = catDictionary.containsKey("lt");
		System.out.println("Have translation in LT : " + haveLtTranslation);
		
		System.out.println(catDictionary.keySet());
		
		for(String key : catDictionary.keySet()) {
			String value = catDictionary.get(key);
			System.out.println(key + " -> " + value);
		}
	}

}
