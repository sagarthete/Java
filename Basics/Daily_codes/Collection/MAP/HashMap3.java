// HashMap does not support duplicate keys,it replace the value for this key.

import java.util.*;

	class HashMapDemo{
	
		public static void main(String args[]){
		
			HashMap hs = new HashMap();

			hs.put("Kanha","BMC");
			hs.put("Ashish","Barklays");
			hs.put("Kanha","Carpro");
			hs.put("Rahul","Infosys");

			System.out.println(hs);
		}
	}
