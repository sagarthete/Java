class GfG
{
           public static int findEquilibrium(int arr[], int n)
              {
                    int sum = 0;
                    for(int i = 0;i<arr.length;i++){
                            sum = sum + arr[i];
                            arr[i] = sum;
                    }
                    int total = arr[n-1];
                    
                    if(n!=1){
                        for(int i = 1;i<n;i++){
                            if((total-arr[i]==arr[i-1])){
                                return i;
                            }
                        }
                        return -1;
                    }
                    else{
                        return 1;
                    }
    }
}
