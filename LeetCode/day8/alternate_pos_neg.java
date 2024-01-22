class Solution {
    void rearrange(int arr[], int n) {
    ArrayList<Integer> al1 = new ArrayList<Integer>();
        ArrayList<Integer> al2 = new ArrayList<Integer>();
        
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] >= 0){
                al1.add(arr[i]);
            }
            else{
                al2.add(arr[i]);
            }
        }
        int i=0;
        int j=0;
        int k=0;
        
        while(i<al1.size() && j<al2.size()){
            arr[k++] = al1.get(i++);
            arr[k++] = al2.get(j++);
        }
        while(i < al1.size()){
            arr[k++] = al1.get(i++);
        }
        while(j < al2.size()){
            arr[k++] = al2.get(j++);
        }
    }
}
