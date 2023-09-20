
import java.util.concurrent.*;
import java.util.*;

	class BlockingQueueDemo{
	
		public static void main(String args[])throws InterruptedException{
		
			BlockingQueue bq = new ArrayBlockingQueue(7);

			bq.offer(10);
			bq.offer(20);
			bq.offer(30);
			bq.offer(40);
			
			System.out.println(bq);
			System.out.println("using put method....");

			bq.put(50);

			System.out.println(bq);

			ArrayList al = new ArrayList();
			System.out.println(al);

			bq.drainTo(al);

			System.out.println(bq);
			System.out.println(al);


		}
	}
