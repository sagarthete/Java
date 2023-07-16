// parent child relation can be used in exception handling

class Demo{

 	public static void main(String args[]){
	
		try{
		
			System.out.println(10/0);
		}
		catch(RuntimeException obj){
		
			System.out.println("exception caugted by parent exception class");
		}
 		System.out.println("end main");
	}
}
