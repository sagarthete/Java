class Solve {
    int[] printUnsorted(int[] arr, int n){
        
      int arr2[]=new int[arr.length];

                for(int i=0;i<arr2.length;i++){
                        arr2[i]=arr[i];
                }
                Arrays.sort(arr2);

                int arr3[]=new int[2];

                int flag=0;
                for(int i=0;i<arr.length;i++){
                        if(arr2[i]!=arr[i] && flag==0){
                                arr3[0]=i;
                                flag=1;
                        }
                        if(arr2[i]!=arr[i] && flag==1){
                                arr3[1]=i;
                        }
                }


                return arr3;
    }
}
