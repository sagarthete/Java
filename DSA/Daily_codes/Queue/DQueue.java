// Dequeue in array
import java.util.*;

class Deque{

	int darr[];
	int front;
	int rear;
	int maxsize;

	Deque(int size){
		this.darr = new int[size];
		front = -1;
		rear = -1;
		maxsize = size;
	}

	void pushBack(int data){
	
		if(rear==maxsize-1){
			System.out.println("queue is full");
		}else{
		
			if(front == -1){
				
				front = rear  = 0;
			}else{
				rear++;
			}
			darr[rear] = data;
		}
	}
	int popFront(){
		
		if(front == -1){
			System.out.println("queue is empty");
			return -1;
		}else{
			if(front<=rear){
				int ret = darr[front];
				front++;
				return ret;
			}else{
				System.out.println("queue is empty");
				return -1;
			}
		}
	}
	int popBack(){
		
		if(front==-1){
			System.out.println("queue is empty");
			return -1;
		}else{
		
			if(rear<front){
				System.out.println("queue is empty");
				return -1;
			}else{
				int ret = darr[rear];
				rear--;
				return ret;
			}
		}	
	}
	void pushFront(int data){
		
		if(front==0){
			System.out.println("queue is full");
			return;
		}else{
		
			if(front==-1){
				front = rear = 0;
				darr[front] = data;
			}else{
				if(front>0 && front <= rear){
					front--;
					darr[front] = data;
				}
			}
			return;
		}
	}
	void printQ(){
	
		if(front == -1){
			System.out.println("queue is empty");
		}else{
			if(front <= rear){
				for(int i = front;i<=rear;i++){
					System.out.print(darr[i]+" ");
				}
				System.out.println();
			}else{
				System.out.println("queue is empty");
			}
		}
	}
}
class Client{

	public static void main(String args[]){
	
		
                Scanner sc = new Scanner(System.in);
                System.out.println("enter size");
                int size = sc.nextInt();

                Deque q = new Deque(size);

                char ch ;

                do{

                        System.out.println("1.pushfront");
                        System.out.println("2.popFront");
                        System.out.println("3.popBack");
                        System.out.println("4.pushBack");
                        System.out.println("5.printQ");

                        System.out.println("enter your choice");
                        int choice = sc.nextInt();

                        switch(choice){

                                case 1:{
                                        System.out.println("enter data");
                                        int data = sc.nextInt();
                                        q.pushFront(data);
                                        }
                                       break;

                                case 2:{
                                        int ret = q.popFront();
                                        if(ret!=-1)
                                                System.out.println(ret+" is poped");

                                        }
                                       break;

                                case 3:{
                                        int fr = q.popBack();
                                        if(fr!=-1)
                                                System.out.println(fr+" is popped");
                                        }
                                       break;

                                case 4:{
                                        System.out.println("enter data");
                                        int data = sc.nextInt();
                                        q.pushBack(data);
                                        
                                        }
                                       break;

                                case 5:
                                       q.printQ();
                                       break;

                                default:
                                       System.out.println("wrong input..");
                        }
                        System.out.println("do you want to continue?..");
                        ch = sc.next().charAt(0);
                }while(ch=='y'||ch=='Y'); 
	}
}
