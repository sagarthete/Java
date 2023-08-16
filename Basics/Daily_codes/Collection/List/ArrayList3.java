
 import java.util.*;

  class Demo{
  
  	int n1 = 0;
	String str = null;
       		Demo(int n1,String str){
			this.n1 = n1;
			this.str = str;
		}	
  }
  class ArrayListDemo{
  
  	public static void main(String args[]){
	
		ArrayList al = new ArrayList();

			al.add(10);
			al.add("sagar");
			al.add(40.6);

		System.out.println(al);

			al.add(new Demo(7,"MSD"));

		System.out.println(al);
	}
  
  }
