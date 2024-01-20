class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> s = new TreeSet<Integer>();
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
        int ind = 0;
        Iterator<Integer> itr =  s.iterator();
        while(itr.hasNext()){
            int ele = itr.next();
            nums[ind] = ele;
            ind++;
        }
        return s.size();
    }
}
