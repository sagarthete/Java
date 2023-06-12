
  import java.io.*;

   class Switch{
   
         public static void main(String args[])throws IOException{
	 
	       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	       System.out.println("enter marks for five subjects");
	       int i=5;
	       int sum = 0;
	       while(i!=0){
	          int marks = Integer.parseInt(br.readLine());
		  if(marks>=35){
		     sum = sum+marks;
		  }
		  else{
		     System.out.println("you are fail");
		  }
		  i--;
	       }
	         System.out.println("get marks for gread");
	         System.out.println("entee grade");

		 char ch = (char)(br.read());
	          switch(ch){
	       
			case 'A':
				System.out.println("80 to 90");
			        break;
			case 'B':
				System.out.println("65 to 80");
				break;
			case 'C':
				System.out.println("50 to 65");
				break;
			case 'D':
				System.out.println("35 to 50");
				break;
			default:
				System.out.println("fail");
				break;		
	       }
	 }
   }
