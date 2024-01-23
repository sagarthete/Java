class Solution {
    int missingNumber(int array[], int n) {
     Arrays.sort(array);
     int data = 1;
     for(int i = 0;i<array.length;i++){
         if(array[i]!=data){
             return data;
         }
         data++;
     }
     return n;
}
}
