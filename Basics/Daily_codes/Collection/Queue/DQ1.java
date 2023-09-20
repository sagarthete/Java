
import java.util.*;

	class DQDemo{
	
		public static void main(String args[]){
		
			Deque dq = new ArrayDeque();

			dq.offer(20);	
			dq.offer(10);	
			dq.offer(30);	
			dq.offer(40);

			dq.offerFirst(5);
			dq.offerLast(50);
			
			System.out.println(dq);

			dq.pollFirst();	
			dq.pollLast();

			System.out.println(dq);

			System.out.println(dq.peekFirst());	
			System.out.println(dq.peekLast());	

			Iterator itr1 = dq.iterator();

			while(itr1.hasNext()){
			
				System.out.println(itr1.next());
			}
		}
	
	}
