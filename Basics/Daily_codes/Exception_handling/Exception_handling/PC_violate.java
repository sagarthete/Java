//catch block for the child exception must be written before catch block for parent exception

 class Demo{
 
 	public static void main(String args[]){
	
		System.out.println("start main");

		try{
		
			int result = 1000/0;

		}
		catch(ArithmeticException obj){
		
			System.out.println("devide by zero");
		}
		catch(RuntimeException obj){
		
			System.out.println("asach");
		}

		System.out.println("end main");
	}
 }
