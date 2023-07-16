
 import java.io.*;
 class Demo{
 
       public static void main(String args[])throws IOException{
       
       		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter any number");
		
		int num = 0;
		int flag = 0;
		do{
		try{
		   	 num = Integer.parseInt(br.readLine());
			 flag = 1;
		}
		catch(NumberFormatException obj){
		
			System.out.println("please enter Integer data");
			flag = 0;	
		}
		}while(flag==0);
                
		System.out.println("number is = "+num);
       }
 }
