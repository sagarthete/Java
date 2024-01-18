class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                if(i==nums.length-1)
                    al.add(count);
            }else{
                al.add(count);
                count = 0;
            }
        }
        int max = Collections.max(al);
        return max;
    }
}
