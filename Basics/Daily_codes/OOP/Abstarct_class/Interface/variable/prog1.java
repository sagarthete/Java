// variables in Interface are always "public static final int x" proverbed like this
//public ==> to kee the public scope of variable
//static ==> to access the variable by interface name, only interface owns it;
//final  ==> to keep it final so no one can change it

 interface Demo{
 
   	int x = 10;

	void fun();

 }

 class DemoChild implements Demo{

	 
    	static int y = 20;

	public void fun(){
		System.out.println("in fun x = "+x);
		System.out.println("in fun x = "+y);
	}
 }
  
 class Client {
 
  	public static void main(String args[]){
	
		DemoChild obj = new DemoChild();
		obj.fun();
		System.out.println(obj.x);
		System.out.println(obj.y);
	}
 }
