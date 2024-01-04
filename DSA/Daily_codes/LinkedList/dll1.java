import java.util.*;
class Node{
	
	int data;
	Node next = null;
	Node prev = null;

	Node(int data){
		this.data = data;
	}
}

class LinkedList{

	Node head = null;

	void addFirst(int data){
	
		Node newNode = new Node(data);

		if(head == null){
			head = newNode;
		}
		else{
		
			newNode.next = head;
			head = newNode;
		}
	}
	void addLast(int data){
	
		Node newNode = new Node(data);
		
		if(head==null){
			head = newNode;
		}
		else{
			Node temp = head;
			while(temp.next!=null){
				
				temp = temp.next;
			}
			newNode.prev = temp;
			temp.next = newNode;
		}

	}
	void addAtPos(int data,int pos){
	
		int count = countNode();
		
		if(pos<=0 || pos>=count+2){
		
			System.out.println("wrong input");
		}
 
		Node newNode = new Node(data);

		if(head==null){
			head = newNode;
		}	
		if(pos==1){
		
			addFirst(data);
		}
		else if(pos==count+1){
		
			addLast(data);
		}else{
			Node temp = head;

			while(pos-2!=0){
			
				temp = temp.next;
				pos--;
			}
			newNode.next = temp.next;
			temp.next = newNode;
		}

	}

	void deleteFirst(){
	
		if(head == null){
			System.out.println("linkedList is empty");
		}
		if(head.next==null){
			head = null;
		}
		else{
		
			head = head.next;
		}

	}
	void deleteLast(){
	
		if(head==null){
			System.out.println("linkedList is empty");
		}
		if(head.next==null){
			
			head = null;
		}
		else{
		
			Node temp = head;

			while(temp.next.next!=null){
				
				temp = temp.next;
			}
			temp.next = null;
		}
	}

	void deleteAtPos(int pos){
	
		int count = countNode();

		if(pos<=0 || pos>=count+1){
			System.out.println("wrong input");
		}
		if(head==null){
			System.out.println("linkedList is empty");
		}
		if(pos == 1){
			deleteFirst();
		}else if(pos == count){
			deleteLast();
		}else{
			Node temp = head;
			while(pos-2!=0){
			
				temp = temp.next;
				pos--;
			}
			temp.next = temp.next.next;
		}

	}

	int countNode(){
		int count = 0;
		Node temp = head;

		while(temp!=null){
		
			count++;
			temp = temp.next;
		}
		return count;
	}

	void printSll(){
	
		if(head==null){
			System.out.println("LinkedList is empty");
		}
		else{
		
			Node temp = head;
			while(temp.next!=null){
				System.out.print(temp.data+"->");
				temp = temp.next;
			}
			System.out.print(temp.data);
			System.out.println();
		}
	}

}

class Client{

	public static void main(String args[]){
	
		LinkedList ll = new LinkedList();
		
		char ch;

		do{
		
			System.out.println("\n--------MENU--------\n");
			System.out.println("1.addFirst");
			System.out.println("2.addLast");
			System.out.println("3.addAtPos");
			System.out.println("4.deleteFirst");
			System.out.println("5.deleteLast");
			System.out.println("6.deleteAtPos");
			System.out.println("7.count");
			System.out.println("8.printSll");
			
			System.out.println("\nenter your choice..........");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();

			switch(choice){
			
				case 1:{
				
					System.out.println("enter data");
					int data = sc.nextInt();
					ll.addFirst(data);
				}
					break;

				case 2:{
				
					System.out.println("enter data");
					int data = sc.nextInt();
					ll.addLast(data);
				
				}
					break;

				case 3:{
				
					System.out.println("enter data");
					int data = sc.nextInt();
					System.out.println("enter pos");
					int pos = sc.nextInt();
					
					ll.addAtPos(data,pos);
				
				}
					break;

				case 4:
					ll.deleteFirst();
					break;
				case 5:
					ll.deleteLast();
					break;
				case 6:{
				
					System.out.println("enter pos");
					int pos = sc.nextInt();
					ll.deleteAtPos(pos);
				}
				case 7:{
				
					int count = ll.countNode();
					System.out.println(count);
				}
					break;

				case 8:
					ll.printSll();
					break;

				default:
					System.out.println("wrong input");

			}

			System.out.println("do you want to continue ?????");
			ch = sc.next().charAt(0);


		}while(ch=='Y' || ch=='y');
	}
}
