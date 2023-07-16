
// simple inheritance

 class Employee{
 
 	String name = null;
	int id = 0;

	void work(){
	
		System.out.println("working in java");
	}
	void getSalary(){

		System.out.println("acc no is := .......");
	
	}

 }

class HR extends Employee{

	void management(){
	
		System.out.println("managing project");
	}

	public static void main(String args[]){
	
		HR obj = new HR();
		obj.work();
		obj.getSalary();
		obj.management();
	}

}
