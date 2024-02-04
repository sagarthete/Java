class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {

        int count = 0;
        int ind = 0;

        for(int i=0;i<mat.length;i++){
            int count1 = 0;
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1){
                    count1++;
                }
            }
            if(count1>count){
                count = count1;
                ind = i;
            }
        }
        return new int[]{ind,count};
    }
}
