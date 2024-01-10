//simple queue implementation

import java.util.*;
class Queue{

	int qarr[];
	int front;
	int rear;
	int maxsize;

	Queue(int size){
		
		this.qarr = new int[size];
		front = -1;
		rear = -1;
		maxsize = size;
	}

	void enqueue(int data){
	
		if(rear==maxsize-1){
			System.out.println("queue is full");
		}else{
			if(front==-1){
				front = rear = 0;
			}
			else{
				rear++;
			}
			qarr[rear] = data;
		}
	}

	int dequeue(){
		
		if(front == -1){
			System.out.println("queue is empty");
		}else{
			int ret = qarr[front];
			front++;
			if(front>rear){
				front = rear = -1;
			}
			return ret;
		}
		return -1;
	}
	int frontEle(){
		
		if(front==-1){
			System.out.println("queue is empty");
			return -1;
		}
		return qarr[front];
	}

	int rearEle(){
		
		if(front==-1){
			System.out.println("queue is empty");
			return -1;
		}
		return qarr[rear];
	}

	void printQ(){
		
		if(front==-1){
			System.out.println("queue is empty");
		}
		else{
		
			for(int i=front;i<=rear;i++){
				System.out.print(qarr[i]+" ");
			}
			System.out.println();
		}
	}
}
class Client{

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size = sc.nextInt();

		Queue q = new Queue(size);

		char ch ;

		do{

			System.out.println("1.enqueue");
			System.out.println("2.dequeue");
			System.out.println("3.frontEle");
			System.out.println("4.rearEle");
			System.out.println("5.printQ");

			System.out.println("enter your choice");
			int choice = sc.nextInt();

			switch(choice){
			
				case 1:{
					System.out.println("enter data");
					int data = sc.nextInt();
					q.enqueue(data);
					}
				       break;

				case 2:{
					int ret = q.dequeue();
					if(ret!=-1)
						System.out.println(ret+" is poped");
						
					}
				       break;

				case 3:{
					int fr = q.frontEle();
					if(fr!=-1)
						System.out.println(fr+" is at front end");
					}
				       break;

				case 4:{
					int rr = q.rearEle();
					if(rr !=-1)
						System.out.println(rr+" is at rear end");
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
