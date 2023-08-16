 import java.util.*;
 	
	class VectorTh extends Thread{
	
		Vector obj = null;
		VectorTh(Vector obj){
		
			this.obj = obj;
		}

		public void run(){
		
			obj.add(10);
			System.out.println(obj);
		}
		
	}
 	
        class VectorDemo{
	
		public static void main(String args[]){
		
			Vector v = new Vector();

			VectorTh obj1 = new VectorTh(v);
			obj1.run();
			v.add(20);
			v.add(30);

			System.out.println(v);
		}
	}
