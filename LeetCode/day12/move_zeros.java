class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                al.add(nums[i]);
                count++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i<count){
                nums[i] = al.get(i);
            }else{
                nums[i] = 0;
            }
        }
    }
}
