/*   1
 *   8     9
 *   27    16   125
 *   64    25   216  49
 */

	class Test{
		public static void main(String[] args){
			int n=4;
			for(int i=1;i<=n;i++){
				int x=i;
				for(int j=1;j<=i;j++){
					if(j%2==1)
						System.out.print(x*x*x +" ");
					else
						System.out.print(x*x +" ");
					x++;
				}
				System.out.println();
			}
		}
	}
