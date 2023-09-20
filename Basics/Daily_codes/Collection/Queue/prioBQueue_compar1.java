import java.util.concurrent.*;
import java.util.*;

	class Demo{
	
		String name = null;
		Demo(String name){
		
			this.name = name;
		}
		public String toString(){
		
			return name;
		}
	}
	
	class SortByName implements Comparator{
	
		public int compare(Object obj1,Object obj2){
		
			return (((Demo)obj1).name.compareTo(((Demo)obj2).name));
		}
	}
	class ComparetorDemo{
	
		public static void main(String args[]){
		
			PriorityBlockingQueue pbq = new PriorityBlockingQueue(3,new SortByName());

			pbq.offer(new Demo("bharat"));
			pbq.offer(new Demo("akash"));
			pbq.offer(new Demo("champak"));

			System.out.println(pbq);

		}
	}
