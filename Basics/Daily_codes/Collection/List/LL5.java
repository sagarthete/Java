 import java.util.*;

 class Demo{
 
 	String name = null;
	int num = 0;

	Demo(String name,int num){
	
		this.name = name;
		this.num = num;
	}

	public String toString(){
	
		return name;
	}
 }

 class LinkedListDemo{
 
 
 	public static void main(String args[]){
	
		LinkedList ll = new LinkedList();

		ll.add(new Demo("sagar",3));
		ll.addFirst(new Demo("vaibhav",3));
		ll.addLast(new Demo("abhi",3));
		ll.add(2,new Demo("shubham",3));

		System.out.println(ll);
	}
 }
