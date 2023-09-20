import java.util.concurrent.*;
import java.util.*;

	class ComparetorDemo{
	
		public static void main(String args[]){
		
			PriorityBlockingQueue pbq = new PriorityBlockingQueue();

			pbq.offer("kanha");
			pbq.offer("ashish");
			pbq.offer("badhe");
			pbq.offer("rohit");

			System.out.println(pbq);
		}
	
	}
