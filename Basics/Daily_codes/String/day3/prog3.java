
    class StringDemo{
    
          public static void main(String args[]){
	  
	         	String str1 = "Shashi";
			String str2 = new String("Shashi");
			String str3 = "SHashi";
			String str4 = new String("Shashi");
	         	
			String str5 = "SAgar";
			String str6 = new String("Sagar");
			String str7 = "SAkshi";
			String str8 = new String("Sakshi");
	  
			System.out.println(str1.hashCode());
			System.out.println(str2.hashCode());
			System.out.println(str3.hashCode());
			System.out.println(str4.hashCode());
			
			System.out.println(str5.hashCode());
			System.out.println(str6.hashCode());
			System.out.println(str7.hashCode());
			System.out.println(str8.hashCode());
			

	  }
     
    }
