// HashSet and HashMap stores value in sme manner

import java.util.*;

	class HashDemo{
	
		public static void main(String args[]){
		
			HashSet hs = new HashSet();

			hs.add("sagar");
			hs.add("pranav");
			hs.add("abhi");
			hs.add("shubham");

			System.out.println(hs);

			HashMap hm = new HashMap();

			hm.put("sagar",10);
			hm.put("pranav",20);
			hm.put("abhi",30);
			hm.put("shubham",40);

			System.out.println(hm);
		}
	}
