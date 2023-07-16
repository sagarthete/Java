// we cannot write extra compile time exception wgich will never occure
// because compiler check that exception

 import java.io.*;
 class Demo{
 
 	public static void main(String args[]){
	
		int num = 1000;
		
		try{
		
		 	int result = num/0;

		}
		catch(IOException obj1){
		
			System.out.println("IOexception caughted");
		}
		catch(ArithmeticException obj2){
		
			System.out.println("Arithmetic exception caughted");
		}
		System.out.println("end main");
	}
 }
 
