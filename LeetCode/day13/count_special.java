class Solution {
    public int countQuadruplets(int[] nums) {
        
        int count = 0 ;

        HashMap<Integer,Integer> map  = new HashMap<>();

        for(int i=nums.length-2 ; i>=1 ; i--){
            for(int j=i+1 ; j<nums.length ; j++){
                int num = nums[j] -nums[i];
                map.put(num,map.getOrDefault(num,0) + 1) ;
            }
            for(int j=0 ; j<i-1 ; j++){
                int num = nums[j] + nums[i-1];
                count = count + map.getOrDefault(num,0);
            }
        }
        return count;
    }
}
