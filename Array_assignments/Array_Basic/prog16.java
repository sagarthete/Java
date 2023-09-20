//last index of one

 import java.io.*;

 class ArrayDemo{
 
 	public static void main(String args[])throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter string");
		String str = br.readLine();
		
		char arr[] = str.toCharArray();


		int flag = 0;
		int last = 0;
		for(int i = 0;i<arr.length;i++){
		
			if(arr[i]=='1'){
				flag = 1;
				last = i;
			}
		}
		System.out.println("last index of one is : "+last);
		if(flag == 0)
			System.out.println("-1");
	}
 
 }
 
