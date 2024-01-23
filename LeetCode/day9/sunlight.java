class Solution {

    public static int longest(int arr[],int n)
    {   
        int max = arr[0];
        int count=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]<max)
                count++;
            else
                max = arr[i];
        }
        return arr.length-count;
    }
}

