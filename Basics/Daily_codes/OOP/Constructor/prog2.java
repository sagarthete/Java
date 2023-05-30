 
  import java.io.*;
  class Demo{
  
         Demo()throws IOException{
	 
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("enter any number");
	    int num = Integer.parseInt(br.readLine());
	    this.fun(num);
	 }

	 void fun(int num){
	 
	    System.out.println("in fun method num = "+num);
	 }

	 public static void main(String args[])throws IOException{
	 
		  
	    System.out.println("in main method");
	       Demo obj = new Demo(); 	 
	 }
   
  }
