class Solution
{
    public void transpose(int n,int a[][])
    {
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a[0].length;j++){
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
    }
}
