import java.util.*;

class Node{

	int data;
	Node next = null;

	Node(int data){
		this.data = data;
	}
}
class LinkedStack{

	Node head = null;
	Node top = null;

	void push(int data){
		
		Node newNode = new Node(data);

		if(head==null){
		
			head = newNode;
			top = newNode;
		}else{
			top.next = newNode;
			top = top.next;
		}
	}
	int pop(){
	
		if(head==null){
			System.out.println("stack is empty");
			return -1;
		}else if(head.next==null){
			int ret = head.data;
			head = null;
			return ret;	
		}else{
		
			Node temp = head;

			while(temp.next.next!=null){
				temp = temp.next;
			}
			int ret = temp.next.data;
			top = temp;
			top.next = null;
			return ret;
		}

	}

	int top(){
	
		if(head==null){
			System.out.println("stack is empty");
			return -1;
		}else{
			return top.data;
		}
	}
	void printStack(){
	
		if(head==null){
			System.out.println("stack is empty");
		}else{
		
			Node temp = head;

			while(temp.next!=null){
			
				System.out.print(temp.data+" ");
				temp = temp.next;
			}
			System.out.println(temp.data);
		}
	}
}
class Client{

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		LinkedStack ls = new LinkedStack();

		char ch;
		do{
			System.out.println("____MENU____\n");
			System.out.println("1.push");
			System.out.println("2.pop");
			System.out.println("3.top");
			System.out.println("1.printStack\n");

			System.out.println("enter your choice");

			int choice = sc.nextInt();

			switch(choice){
			
				case 1:{
					System.out.println("enter data");
					int data = sc.nextInt();
					ls.push(data);
					}
					break;

				case 2:{
					int ret = ls.pop();
					if(ret!=-1){
						System.out.println(ret+" is popped");
					}
					}
				       break;
				case 3:{
					int ret = ls.top();
					if(ret!=-1){
						System.out.println(ret+" is on top");
					}
					}
				        break;
				case 4:
					ls.printStack();
					break;
				default:
					System.out.println("wrong choice");
			}
			System.out.println("Continue????");
			ch = sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');	
	}
}
