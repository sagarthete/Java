class Solution {
    public String longestCommonPrefix(String[] strs) {
        ArrayList<String> al = new ArrayList<String>();
        for(int i=0;i<strs[0].length();i++){
            al.add(strs[0].substring(0,i+1));
        }
        int ind1 = Integer.MAX_VALUE; 
        int ind2 = 0;
        int count = 0;
        for(int i=0;i<strs.length;i++){
            int flag = 0;
            for(int j=0;j<strs[i].length();j++){
                String s = strs[i].substring(0,j+1);
                if(al.contains(s)){
                    ind2 = al.indexOf(s);
                    flag = 1;
                }
            }
            if(ind2<=ind1)
                ind1 = ind2;
            if(flag==1)
                count++;
        }
        if(count==strs.length)
            return al.get(ind1);
        else
            return "";
    }
}
