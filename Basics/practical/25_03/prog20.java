/*   1
 *   8     9
 *   9     64   25
 *   64    25   216  49
 */

	class Test{
		public static void main(String[] args){
			int n=4;
			for(int i=1;i<=n;i++){
				int x=i;
				for(int j=1;j<=i;j++){
					if(x%2==0)
						System.out.print(x*x*x +" ");
					else
						System.out.print(x*x +" ");
					x++;
				}
				System.out.println();
			}
		}
	}
