
 import java.util.*;
 class ArrayListDemo{
 
 	public static void main(String args[]){
	
		ArrayList al = new ArrayList();	
		
			al.add(10);
			al.add(20.5f);
			al.add("sagar");
			al.add(20.5);

			System.out.println(al);

			for(Object x:al){
			
				System.out.println(x);
			}
	}
 }
