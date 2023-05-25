
   class Project{
     
        String projName = "onlineEdu";
	int noofEmp = 20;

	void clientInfo(){
	
	     String name = "Core2Web";

	     System.out.println(name);
	     System.out.println(projName);
	     System.out.println(noofEmp);
	}

   }
   
   class C2W{
   
         public static void main(String args[]){
	  
	        Project obj = new Project();
		obj.clientInfo();
	 }
   }
