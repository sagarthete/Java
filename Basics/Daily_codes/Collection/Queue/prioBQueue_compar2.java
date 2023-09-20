import java.util.concurrent.*;
import java.util.*;

	class Demo implements comparable{ 
	
		String name = null;
		Demo(String name){
			
			this.name = name;
		}
		public String toString(){
		
			return name;
		}
		public int compareTo(Object obj){
		
			return this.name.compareTo(((Demo)obj).name);
		}
	}	

	class ComparableDemo{
	
		public static void main(String args[]){
		
			PriorityBlockingQueue pbq = new PriorityBlockingQueue();

			pbq.offer(new Demo("sagar"));
			pbq.offer(new Demo("pranav"));
			pbq.offer(new Demo("vaibhav"));

			System.out.println(pbq);

		}
	}
