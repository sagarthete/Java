class Solution
{
    int findMaxDiff(int a[], int n)
    {
    	int ls[]=new int[n],ans=0;
    	Stack<Integer> st=new Stack<>();
    	for(int i=0;i<n;i++){
    	    while(!st.isEmpty() && st.peek()>=a[i]) st.pop();
    	    if(st.isEmpty()) ls[i]=0;
    	    else ls[i]=st.peek();
    	    st.push(a[i]);
    	}
    	st.clear();
    	for(int i=n-1;i>=0;i--){
    	    while(!st.isEmpty() && st.peek()>=a[i]) st.pop();
    	    int x=0;
    	    if(!st.isEmpty()) x=st.peek();
    	    ans=Math.max(ans,Math.abs(ls[i]-x));
    	    st.push(a[i]);
    	}
    	return ans;
    }
}
