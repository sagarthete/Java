class Solution {
    
    public pair indexes(long v[], long x)
    {
        int start = Integer.MAX_VALUE;
        int end = Integer.MAX_VALUE;
        int flag = 0;
        
        for(int i=0;i<v.length;i++){
         if(v[i]==x){
             if(flag==0){
                 start=i;
                 flag = 1;
             }
             end = i;
         }
        }
        if(start!=Integer.MAX_VALUE)
            return new pair(start,end);
        else
            return new pair(-1,-1);
        
    }
}
