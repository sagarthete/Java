
     class StringDemo{
     
           public static void main(String args[]){
	   
	          char str1 [] = {'C','2','W'};    // Specifically on integer Cache on Heap

                  String str2 = "Core2Web";            //this type of string get allocated SPecifically on "SCP" on heap

		  String str3 = new String("Core2web"); // this gets allocated on Heap

 
		 System.out.println(str1);
		 System.out.println(str2);
		 System.out.println(str3);

	   }
     
     }
