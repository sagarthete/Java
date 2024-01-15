class Solution {
    public int singleNumber(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            int count = 0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count==1)
                return nums[i];
        }
        return -1;
    }
}
class Client{
        public static void main(String args[]){
                int arr[] = new int[]{1,4,8,4,10,8,10};
                Solution s = new Solution();
                int ret = s.singleNumber(arr);
                System.out.println(ret);
        }
}
