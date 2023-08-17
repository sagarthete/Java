
import java.util.*;

	class IdHashMap{
	
		public static void main(String args[]){
		
			IdentityHashMap im = new IdentityHashMap();

			im.put(135,"sagar");
			im.put(135,"vaibhav");
			im.put(135,"pranav");

			System.out.println(im);
			
			im.put(10,"sagar");
			im.put(10,"vaibhav");
			im.put(10,"pranav");
			
			System.out.println(im);
		}
	}
