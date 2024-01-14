import java.util.*;

class Queue{

	int sarr[];
	int front;
	int rear;
	int maxsize;

	Queue(int size){
		this.sarr = new int[size];
		front = -1;
		rear = -1;
		maxsize = size;
	}

	void push(int data){
	
		if(rear == maxsize-1){
			System.out.println("q is full");
		}else{
		
			if(front==-1){
				front =  rear = 0;
			}else{
				rear++;
			}
			sarr[rear] = data;
		}
	}
	int pop(){
		
		if(front == -1){
			System.out.println("q is empty");
			return -1;
		}else{
			int ret = sarr[front];

			if(front==rear){
				front = rear = -1;
			}else{
				front++;
			}
			return ret;
		}
	}	

	void printQ(){
		if(front==-1){
			System.out.println("Q is empty");

		}else{
			for(int i = front;i<=rear;i++){
				System.out.print(sarr[i]+" ");
			}
			System.out.println();
		}
	}

	void reverseQ(int pos){
		

		if(front==-1){
			System.out.println("queue is empty");
		}else{
			int ind = pos-1;
			for(int i=0;i<pos/2;i++){
				int temp = sarr[i];
				sarr[i] = sarr[ind];
				sarr[ind] = temp;
				ind--;
			}
		}
	}
}

class Client{

	public static void main(String args[]){
	
		System.out.println("enter size");
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();

		Queue q = new Queue(size);


                char ch ;

                do{

                        System.out.println("1.push");
                        System.out.println("2.pop");
                        System.out.println("3.printQ");
			System.out.println("4.reverse from perticular position");

                        System.out.println("enter your choice");
                        int choice = sc.nextInt();

                        switch(choice){

                                case 1:{
                                        System.out.println("enter data");
                                        int data = sc.nextInt();
                                        q.push(data);
                                        }
                                       break;

                                case 2:{
                                        int ret = q.pop();
                                        if(ret!=-1)
                                                System.out.println(ret+" is poped");

                                        else{
						System.out.println(ret);
					}
				}
                                       break;

                                case 3:
                                       q.printQ();
                                       break;
				case 4:{
					System.out.println("enter the position");       
					int pos = sc.nextInt();
				       q.reverseQ(pos);
				       }
				       break;

                                default:
                                       System.out.println("wrong input..");
                        }
                        System.out.println("do you want to continue?..");
                        ch = sc.next().charAt(0);
                }while(ch=='y'||ch=='Y');
	}
}
