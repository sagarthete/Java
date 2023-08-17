import java.util.*;

	class HashGCDemo{
	
		String str;

		HashGCDemo(String str){
		
			this.str = str;
		}
		public String toString(){
		
			return str;
		}
		public void finalize(){
		
			System.out.println(".....vanishing......");
		}
	}
	
	class HashDemo{
	
		public static void main(String args[]){
		
			HashGCDemo obj1 = new HashGCDemo("tall");
			HashGCDemo obj2 = new HashGCDemo("small");
			HashGCDemo obj3 = new HashGCDemo("fare");

			HashMap hm = new HashMap();

			hm.put(obj1,"sagar");
			hm.put(obj2,"vaibhav");
			hm.put(obj3,"pranav");

			System.out.println(hm);

			obj2 = null;
			obj3 = null;
			
			System.gc();
			System.out.println(hm);

			System.out.println("end main");
		}
	}
