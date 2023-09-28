import java.util.Scanner;

class Array_Demo{

		static void sortArray(int arr[],int size,int cnt1,int cnt2,int cnt3){
	
			for(int i=0;i<size;i++){
				if(i<cnt1)
					arr[i] = 0;
				else if(i<(cnt1+cnt2) && i>=cnt1)
					arr[i] = 1;
				else if(i<(cnt1+cnt2+cnt3) && i>=(cnt1+cnt2))
					arr[i] = 2;
			}
			System.out.println("sorted......");
			for(int i=0;i<size;i++){
				System.out.println(arr[i]);
			}
		
		}
	public static void main(String args[]){
	
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the size of an array");
		int size = sc.nextInt();

		System.out.println("enter the elements in array upto N range");
		int arr[] = new int[size];
		int cnt1 = 0;
		int cnt2 = 0;
		int cnt3 = 0;
		for(int i = 0;i<size;i++){
		
			arr[i] = sc.nextInt();
			if(arr[i]==0)
				cnt1++;
			if(arr[i]==1)
				cnt2++;
			if(arr[i]==2)
				cnt3++;
		}

		sortArray(arr,size,cnt1,cnt2,cnt3);
	}
}
