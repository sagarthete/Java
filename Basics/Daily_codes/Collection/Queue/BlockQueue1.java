
import java.util.concurrent.*;

	class BlockingQueueDemo{
	
		public static void main(String args[]){
		
			BlockingQueue bq = new ArrayBlockingQueue(4);

			bq.offer(10);
			bq.offer(20);
			bq.offer(30);
			bq.offer(40);
			bq.offer(50);
			bq.offer(60);

			System.out.println(bq);


		}
	}
