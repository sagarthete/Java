class Solution{
    
    // Function for finding maximum and value pair
    public static long find_multiplication (int arr[], int brr[], int n, int m) {
        Arrays.sort(arr);
        Arrays.sort(brr);
        
        long prod1 = arr[n-1]*brr[0];
        
        return prod1;
        
    }
    
    
}
