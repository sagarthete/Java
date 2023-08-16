 import java.util.*;
 	
	class VectorTh extends Thread{
	
		Vector obj = null;
		VectorTh(Vector obj){
		
			this.obj = obj;
		}

		public void run(){
		
			obj.add(10);
			System.out.println(obj);
			try{
			
				Thread.sleep(5000);
			}catch(InterruptedException e){}
		}
		
	}
 	
        class VectorDemo{
	
		public static void main(String args[]){
		
			Vector v = new Vector();

			VectorTh obj1 = new VectorTh(v);
			obj1.run();
			
			VectorTh obj2 = new VectorTh(v);
			obj2.run();
			
			VectorTh obj3 = new VectorTh(v);
			obj3.run();
			
			System.out.println(v);
		}
	}
