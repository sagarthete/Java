import java.util.*;
class Solution {
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr, int n) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        int minIndex = Integer.MAX_VALUE;
        int repeatingElement = -1;

        for (int i = 0; i < n; i++) {
            if (indexMap.containsKey(arr[i])) {

                if (indexMap.get(arr[i]) < minIndex) {
                    minIndex = indexMap.get(arr[i]);
                    repeatingElement = arr[i];
                }
            } else {
                indexMap.put(arr[i], i + 1);
            }
        }
        
        if (repeatingElement != -1) {
            return minIndex;
        } else {
            return -1;
            
        }
        }
}

class Client{
        public static void main(String args[]){
                int arr[] = new int[]{1,4,8,4,10,8,10};
            
                int ret = Solution.firstRepeated(arr, arr.length);
                System.out.println(ret);
        }
}
