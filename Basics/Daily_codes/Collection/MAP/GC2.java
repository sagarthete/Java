
class Demo{

	String str;

	Demo(String str){
	
		this.str = str;
	}
	public String toString(){
	
		return str;
	}
	public void finalize(){
	
		System.out.println("vanishing......");
	}
}

class HashDemo{

	public static void main(String args[]){
	
		Demo obj1 = new Demo("sagar");
		Demo obj2 = new Demo("vaibhav");
		Demo obj3 = new Demo("pranav");

		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);

		obj1 = null;
		obj2 = null;

		System.gc();
		System.out.println("end main");
	}

}
