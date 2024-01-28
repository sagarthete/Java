class Solution {

    public static int smallestSubWithSum(int a[], int n, int x) {
        int start =0,end=1;
        int sum = a[start];
        int result = Integer.MAX_VALUE;
        if(sum>x) return 1;
        
        if(end<n) sum +=a[end];
        
        while(start<n && end <n){
            
            if(sum>x){
                result = Math.min(result,end-start+1);
                sum = sum-a[start];
                start++;
            }else{
                end++;
                if(end<n){
                    sum = sum + a[end];
                }
            }
        }
        
        if(result == Integer.MAX_VALUE){
            return 0;
        }
        return result;
        }
    }

