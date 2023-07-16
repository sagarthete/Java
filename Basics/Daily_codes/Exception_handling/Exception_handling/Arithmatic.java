
 //using try catch block we can handle the exception

  import java.util.Scanner;
  class Demo{
  
    	public static void main(String args[]){
	
		
		Scanner sc = new Scanner(System.in);
		int flag = 0;
	        do {
		System.out.println("enter number to devide salary");	
		int num = sc.nextInt();
		
		
		int result = 0;
	 	
		try{
		 result =  100000/num;
		 System.out.println(result);
		 flag = 1;
		}catch(ArithmeticException obj){
		
			System.out.println("please enter the number other than zero");
			flag = 0;
		}
	    }while(flag==0);
	}
  
  }
