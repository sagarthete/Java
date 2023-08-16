 import java.util.*;
 
 class VectorTh extends Thread{
 
	Vector vt = null;

	VectorTh(Vector vt){
	
		this.vt = vt;
	}

 	public void run(){
	
		try{
			vt.addElement("pranav");
			Thread.sleep(5000);
			System.out.println(vt);
		}catch(InterruptedException e){}
	
	} 
} 
 
 class VectorDemo{
 
 	public static void main(String args[]){
	
		Vector v = new Vector();

		 v.add("sagar");
		 v.add("vaibhav");

		VectorTh obj1 = new VectorTh(v);
		VectorTh obj2 = new VectorTh(v);
		VectorTh obj3 = new VectorTh(v);

		obj1.start();
		obj2.start();
		obj2.start();

	}
 
 }
