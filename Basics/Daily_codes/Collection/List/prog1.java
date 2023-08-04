
import Array.ADDITION;

 class Demo{
 
 	public static void main(String args[]){
	
		ADDITION obj = new ADDITION();

		obj.addList(10);
		obj.addList(20.5f);
		obj.addList("sagar");
		obj.addList(2,"vaibhav");

		System.out.println(obj.print());

		System.out.println(obj.Size());
		
		obj.Get(3);

		obj.Set(3,"pranav");

		System.out.println(obj.print());

		obj.addList(4,"sagar");
		
		System.out.println(obj.print());
		
		obj.Remove("sagar");
		
		System.out.println(obj.print());

	}
 }
