
  import java.io.*;
  class Switch{
  
        public static void main(String args[])throws IOException{
	
	      	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the number");
		int num = Integer.parseInt(br.readLine());

		switch(num){
		
		 	case 0:
				System.out.println("zero");
				break;
			case 1:
				System.out.println("one");
				break;
			case 2:
				System.out.println("two");
				break;
			case 3:
				System.out.println("three");
				break;
			case 4:
				System.out.println("four");
				break;
			case 5:
				System.out.println("five");
				break;
			default:
				System.out.println("number is grater than 5");

		}
	}
  }
