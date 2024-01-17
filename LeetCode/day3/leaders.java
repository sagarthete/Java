class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> al = new ArrayList<Integer>();
        int ind = 0;
        
        al.add(Integer.MIN_VALUE);
        
        for(int i=0;i<arr.length;i++){
            
            if(al.get(ind)<arr[i]){
                int flag = 1;
                while(ind>=0 && flag==1){
                    flag=0;
                    if(al.get(ind)<=arr[i]){
                            al.set(ind,arr[i]);
                        if(ind!=0 && (al.get(ind-1)<al.get(ind))){
                            ind--;
                            flag=1;
                            al.remove(ind);
                        }
                    }else{
                        break;
                    }
                }
            }else{
                al.add(arr[i]);
                ind++;
            }
        }
        return al;
    }
}

