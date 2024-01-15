import java.util.*;
class Solution {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        Arrays.sort(arr);
        
        int max = n-1;
        int min = 0;
        while(min<max){
            int sum = arr[min]+arr[max];
            if(sum==x){
                return true;
            }else{
                if(sum>x)
                    max--;
                else
                    min++;
            }
        }
        return false;
    }
}
class Client{
	public static void main(String args[]){
		int arr[] = new int[]{1,4,45,6,10,8};
		Solution s = new Solution();
		boolean	ret = s.hasArrayTwoCandidates(arr,arr.length,16);
		System.out.println(ret);
	}
}
