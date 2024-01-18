class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        ArrayList<Integer> al  = new ArrayList<Integer>();
    
        for(int i=0;i<nums2.length;i++){
            al.add(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            int flag = 0;
            for(int j = al.indexOf(nums1[i])+1;j<nums2.length;j++){
                if(nums1[i]<nums2[j]){
                    nums1[i] = nums2[j];
                    flag = 1;
                    break;
                }
            }
            if(flag==0){
                nums1[i] = -1;
            }
        }
        return nums1;
    }
}
