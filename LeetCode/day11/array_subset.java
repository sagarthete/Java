
class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        
        Arrays.sort(a1);
		Arrays.sort(a2);
		for(int i=0;i<m;i++){
			 int flag=0;
			for(int j=i;j<n;j++){
				if(a2[i]==a1[j]){
					flag=1;;
				}
			
			}
			if(flag==0){
				return "No";
		}
		}
	
		return "Yes";
		

    }
}
