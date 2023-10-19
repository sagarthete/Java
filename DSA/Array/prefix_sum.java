import java.util.*;

class PrefixSum{

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[]{-3,6,2,4,5,2,8,-9,3,1};
		int ps[] = new int[arr.length];
		
		ps[0] = arr[0];

		for(int i=1;i<arr.length;i++){
			ps[i] = ps[i-1] + arr[i];
		}

		int Q = sc.nextInt();
		int sum = 0;
		
		System.out.println("enter no of queries");
		for(int i=0;i<Q;i++){
			int s = sc.nextInt();
			int e = sc.nextInt();

			sum = ps[e] - ps[s-1];

			System.out.println(sum);
		}
	}
}
