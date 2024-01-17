class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count1 = 0;
        int count2 = 0;
        int num1 = nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==num1){
                count1++;
                if(count1>nums.length/2){
                    return nums[i];
                }
            }else{
                count2 = count1;
                count1 = 1;
                num1 = nums[i];
            }
        }
        return -1;
    }
}
