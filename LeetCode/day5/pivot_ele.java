class Solution
{
    static int majorityElement(int a[], int size)
    {
        Arrays.sort(a);
        int count1 = 0;
        int count2 = 0;
        int num1 = a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]==num1){
                count1++;
                if(count1>a.length/2){
                    return a[i];
                }
            }else{
                //count2 = count1;
                count1 = 1;
                num1 = a[i];
            }
        }
        return -1;
    }
}
