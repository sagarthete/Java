class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map map = new HashMap();
        int ret[] = new int[2];
        for(int i=0;i<nums.length;i++){
            int key1 = target - nums[i];
            if(map.containsKey(key1)){
                 int ind1 = (int)map.get(key1);
                 if(ind1>i){
                     ret[0] = i;
                     ret[1] = ind1;
                 }else{
                     ret[0] = ind1;
                     ret[1] = i;
                 }
                 return ret;
            }
           map.put(nums[i],i); 
        }
        return ret;
    }
}
