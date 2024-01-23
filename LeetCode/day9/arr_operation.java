class Solution {
    public int[] applyOperations(int[] nums) {
        ArrayList<Integer> al = new ArrayList<Integer>();

        for(int i = 0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i] = nums[i]*2;
                nums[i+1] = 0;
              
            }
            if(nums[i]!=0)
                al.add(nums[i]);
        }
        if(nums[nums.length-1]!=0)
            al.add(nums[nums.length-1]);


        for(int i=0;i<nums.length;i++){
            if(i<al.size())
                nums[i] = al.get(i);
            else
                nums[i] = 0;
        }
        return nums;
    }
}
