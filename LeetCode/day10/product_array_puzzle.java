
class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        long prod = 1;
        ArrayList<Integer> al = new ArrayList<Integer>();
        
        long arr[] = new long[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)
                prod = prod * nums[i];
            else
                al.add(i);
                
        }
        for(int i = 0;i<nums.length;i++){
            if(al.contains(i) && al.size()==1)
                arr[i] = prod;
            if(al.contains(i) && al.size()>1)
                arr[i] = 0;
            if(!al.contains(i) && al.isEmpty())
                arr[i] = prod/nums[i];
            if(!al.contains(i) && !al.isEmpty())
                arr[i] = 0;
        }
        return arr;
	} 
} 

