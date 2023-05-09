/*	10
 *	I   H
 *	7   6  5
 *	D   C  B  A
 */
	class Test{
	public static void main(String[] args){
		int n=4;
		char ch='J';
		int x=10;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				if(i%2==1)
					System.out.print(x +" ");
				else
					System.out.print(ch +" ");
				ch--;
				x--;

			}
			System.out.println();
		}
	
	}
	}
