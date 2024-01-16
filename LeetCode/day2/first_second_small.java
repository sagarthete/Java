// only functions is written as per leetcode requirement

class Compute 
{
    public long[] minAnd2ndMin(long a[], long n)  
    {
        
        Arrays.sort(a);
        long sec = Long.MAX_VALUE;
        long first = Long.MAX_VALUE;
        
        for(int i=0; i<a.length; i++){
            
            if(first > a[i]){
                first = a[i];
                sec = first;
            }
        }
        for(int i=0; i<a.length; i++){
            
            if(sec < a[i]){
                sec = a[i];
                break;
            }
        }
        if(a[0] == sec){
            return new long[]{-1};
        }
        return new long[]{a[0],sec};
    }
}
