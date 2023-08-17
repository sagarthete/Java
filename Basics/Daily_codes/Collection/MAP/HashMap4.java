import java.util.*;

	class HashDemo{
	
		public static void main(String args[]){
		
			HashMap hm = new HashMap();

			hm.put(10,"sagar");
			hm.put(20,"vaibhav");
			hm.put(30,"pranav");
			hm.put(40,"sanket");

			System.out.println(hm);

			hm.put(10,"sagar");
			hm.put(10,"vaibhav");
			hm.put(10,"pranav");
			hm.put(10,"sanket");

			System.out.println(hm);
			
			hm.put(new Integer(10),"sagar");
			hm.put(new Integer(10),"vaibhav");
			hm.put(new Integer(10),"pranav");
			hm.put(new Integer(10),"sanket");

			System.out.println(hm);
			
		}
	}
