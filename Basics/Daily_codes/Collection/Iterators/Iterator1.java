 
 import java.util.*;
 class IteratorDemo{
 
 	public static void main(String args[]){
	
		ArrayList al = new ArrayList();

		al.add(10);
		al.add(20);
		al.add(30);

		Iterator itr = al.iterator();

		while(itr.hasNext()){
		
			if(itr.next()==20);
			al.remove();
			System.out.println(itr.next());
		}
		
	}
 }
