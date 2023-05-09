//indexOf(char ch , int start);

    import java.util.Scanner;
     class StringDemo{
     
           public static void main(String args[]){
	   
	          Scanner s = new Scanner(System.in);
                  System.out.println("enter String");
		  String str = s.next();
                  System.out.println("enter charcter to grt index");
		  char ch = s.next().charAt(0);
                  System.out.println("enter starting point");
		  int st = s.nextInt();

		  System.out.println(str.indexOf(ch,st));
	   }
     }
