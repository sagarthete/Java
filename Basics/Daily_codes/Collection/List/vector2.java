import java.util.*;

	class VectorDemo{
	
		public static void main(String args[]){
		
			Vector v = new Vector();

			 v.add(10);
			 v.addElement("sagar");
			 v.add("vaibhav");
			 v.addElement("pranav");

			System.out.println(v.capacity());
			System.out.println(v.size());
			
			for(int i = 1;i<=7;i++){
			
				v.add(i);
			}
			System.out.println(v.capacity());
			System.out.println(v.size());
			
			for(int i = 1;i<=10;i++){
			
				v.add(i);
			}
			System.out.println(v.capacity());
			System.out.println(v.size());
		}
	}
