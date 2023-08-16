 import java.util.*;
 class Demo{
 
 	public static void main(String args[]){
	
		ArrayList al = new ArrayList();

			al.add("abhi");
			al.add("sagar");
			al.add("raj");
			al.add("vaibhav");

			Iterator obj = al.iterator();
		while(obj.hasNext()){
		
			System.out.println(obj.next());
		}
	}
 }
