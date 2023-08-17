import java.util.*;

	class LinkedHashMapDemo{
	
		public static void main(String args[]){
		
			LinkedHashMap lm = new LinkedHashMap();

			lm.put("sagar","nimgaon");
			lm.put("vaibhav","shedgaon");
			lm.put("pranav","ghargaon");
			lm.put("sanket","harrgaon");

			System.out.println(lm);
			System.out.println(lm.get("sagar"));
			System.out.println(lm.keySet());
			System.out.println(lm.values());
			System.out.println(lm.entrySet());
		}
	}
