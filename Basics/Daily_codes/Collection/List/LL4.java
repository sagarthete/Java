
  import java.util.*;
  class LinkedListDemo{
  
  	public static void main(String args[]){
	
		LinkedList ll = new LinkedList();

			ll.add(20);
			ll.add(30);
			ll.addFirst(10);
			ll.addLast(40);

			System.out.println(ll);

			for(var x:ll){
			
				System.out.println(x);
			}

			LinkedList ll1 = new LinkedList(ll);

			System.out.println(ll1);

			ArrayList obj = new ArrayList();

				obj.add("sagar");
				obj.add("vaibhav");
				obj.add("abhi");

			ll1.addAll(obj);
			System.out.println(ll1);


			ll1.addAll(2,obj);
			System.out.println(ll1);
	}
  }
