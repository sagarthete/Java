import java.util.*;

	class SortedMapDemo{
	
	
	public static void main(String args[]){
	
		SortedMap sm = new TreeMap();

			sm.put("Ind","India");
			sm.put("Pak","Pakistan");
			sm.put("Aus","Australia");
			sm.put("SL","Srilanka");
			sm.put("Ban","Bangladesh");

			System.out.println(sm);

			System.out.println(sm.subMap("Aus","Pak"));

			System.out.println(sm.headMap("Pak"));
			System.out.println(sm.tailMap("Pak"));
			System.out.println(sm.firstKey());
			System.out.println(sm.lastKey());
			System.out.println(sm.keySet());
			System.out.println(sm.values());
			System.out.println(sm.entrySet());
		}	
	}
