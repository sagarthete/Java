class Solution {
    public long zeroFilledSubarray(int[] arr) {
        long count = 0;
        long temp = 1;
        for(int i=0;i<arr.length;i++){
                        if(arr[i]==0){
                                count=count+temp;
                                temp++;
                        }
                        else{
                                temp=1;
                        }
                }
                return count;
    }
}
