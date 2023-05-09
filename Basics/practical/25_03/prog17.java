 /* F
  * E 1
  * D 2 E 
  * C 3 D 4
  * B 5 C 6 D
  * A 7 B 8 C 9
  */
      class Test{
      	public static void main(String[]args){
		int n=6;
		char ch='F';
		char ch1;
		int x=1;
		for(int i=1;i<=n;i++){
			ch1=ch;
			for(int j=1;j<=i;j++){
				if(j%2==1){
					System.out.print(ch1 +" ");
				}
				else{
					System.out.print(x++ +" ");
				}
				ch1++;
			}
			System.out.println();
			ch--;
		}
	}
      }
