import java.util.*;

 class Parent {
 
    	String display(){
	
		System.out.println("parent method");

		return "trial";
	}
 
 }
 class Demo extends Parent{
 
 	String name = null;

		Demo(String name){
		
			this.name = name;
		}
		
		String display(){
		
			return name;
		}
 }
 class LinkedListDemo{
 
 	public static void main(String args[]){
	
		 LinkedList ll = new LinkedList();

			ll.add(new Demo("sagar"));
			ll.addFirst(new Demo("vaibhav"));
			ll.addLast(new Demo("pranav"));		

			for(Parent x:ll){
			
				System.out.println(x.display());
			}
	}
 }
