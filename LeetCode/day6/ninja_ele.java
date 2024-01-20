class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<3){
            return -1;        
        }else{
            int n = nums.length;
            int prod1 = nums[n-1]*nums[n-2]*nums[n-3];
            int prod2 = nums[0]*nums[1]*nums[n-1];
            if(prod1>prod2)
                return prod1;
            else
                return prod2;
        }
    }
}
