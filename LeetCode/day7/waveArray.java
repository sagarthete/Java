class Demo{
	void solution(){
		int j=1;
        	for(int i=0;i<n-1;i++){
                	int temp=a[i];
                	a[i]=a[j];
                	a[j]=temp;
                	j=j+2;
                	i++;
        	}
	}
}
