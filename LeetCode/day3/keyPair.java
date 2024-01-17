
//User function Template for Java

class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int key = k-arr[i];
            if(map.containsKey(key)){
                count = count+map.get(key);
            }
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        return count;
    }
}

