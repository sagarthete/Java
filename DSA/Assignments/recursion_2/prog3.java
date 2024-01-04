import java.util.*;
class SumOdd{

    static int sum(int num,int range){
		
	    if(num==range){
	    	if(num%2!=0)
			return num;
		else
			return 0;
	    }
	    return num + sum(num=num+2,range);
	
    }

    public static void main(String args[]){
    
    	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number");
	int range = sc.nextInt();

	int sum = sum(1,range);

	System.out.println("sum is: "+sum);
    }

}
