 // ArrayList or any collection stores all the objects 
 import java.util.*;
	
 	class Demo{
	
		String str = null;
		int num = 0;

		Demo(String str,int num){
			this.str = str;
			this.num = num;
		}
		public String toString(){
		
			return str;
		}
	}
 	class ArrayListDemo{
	
		public static void main(String args[]){
		
			ArrayList al = new ArrayList();

			al.add(10);
			al.add(20.5);
			al.add(30.5f);
			
			System.out.println(al);
			
			al.add(new Demo("Abhi",3));
			al.add(new Demo("Vaibhav",4));
			al.add(new Demo("sagar",5));

			System.out.println(al);
		}
	}
