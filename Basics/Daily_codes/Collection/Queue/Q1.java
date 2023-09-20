import java.util.*;

	class QDemo{
	
		public static void main(String args[]){
		
			Queue q = new LinkedList();

			q.offer(10);
			q.offer(30);
			q.offer(20);
			q.offer(50);
			q.offer(40);
			System.out.println(q);
			
			//poll();
			q.poll();
			q.poll();

			System.out.println(q);

			//peek();
			
			System.out.println(q.peek());

			//element();

			System.out.println(q.element());

			//remove();
			q.remove();

			System.out.println("after remove.....");
			System.out.println(q.peek());
			System.out.println(q.peek());
			System.out.println(q);

			q.poll();
			q.poll();
			q.poll();
			System.out.println("after polll..");
			System.out.println(q);
			q.remove();         // throws exception when q is empty


		}
		
	}
