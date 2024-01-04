import java.util.*;
class Node{

	Node prev = null;
	int data;
	Node next = null;

	Node(int data){
		this.data  = data;
	}
}

class DoublyLinkedList{

	Node head = null;

	void addFirst(int data){
		
		Node newNode = new Node(data);
		
		if(head ==null){
			head = newNode; 
		}
		else{
		
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
	}

	void addLast(int data){
	
		Node newNode = new Node(data);

		if(head == null){
			head = newNode;
	
		}
		else{
		
			Node temp = head;

			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = newNode;
			newNode.prev = temp;
		}
	}

	int countNode(){
	
		int count = 0;

		Node temp = head;
		while(temp!=null){
			temp = temp.next;
			count++;
		}
	
		return count;
	}
	
	void addAtPos(int data,int pos){
	
		Node newNode = new Node(data);
		
		int count = countNode();
		if(pos<=0 || pos>count+1){
			System.out.println("invalid position");
		}
		else if(head == null){
			head = newNode;
		}
		else if(pos == 1){
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
			newNode.prev = temp;
			temp.next.prev = newNode;
			temp.next = newNode;
			
			
		}
		
	}	

	void deleteFirst(){
	
		if(head.next==null){
			head=null;
		}
		else{
		
			head = head.next;
			head.prev = null;
			
		}
	}

	void deleteLast(){
	
		if(head.next == null){
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

		if(pos<=0 && pos>count+1){
			System.out.println("invalid position");

		}
		else if(pos==1){
			deleteFirst();
		}
		else if(pos==count){
			deleteLast();
		}
		else{
		
			Node temp = head;
			while(pos-2 != 0){
			
				temp = temp.next;
				pos--;
			}
			temp.next = temp.next.next;
			temp.next.prev = temp;
		}
	}
	void printDLL(){
	
		Node temp = head;
		if(head==null){
			System.out.println("linkedList is empty");
		}
		else{
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
	
		DoublyLinkedList obj = new DoublyLinkedList();
		Scanner sc = new Scanner(System.in);
		char ch;
		do{
		
			System.out.println("______MENU______");
			System.out.println("1.addFisrt");
			System.out.println("2.addLast");
			System.out.println("3.addAtPos");
			System.out.println("4.deleteFirst");
			System.out.println("5.deleteLast");
			System.out.println("6.deleteAtPos");
			System.out.println("7.countNodes");
			System.out.println("8.printDLL\n");
	
			System.out.println("ENTER YOUR CHOICE......");
			int choice = sc.nextInt();
			switch(choice){
			
				case 1:{
					System.out.println("enter data..");
					int data = sc.nextInt();
					obj.addFirst(data);
					
					}
					break;

				case 2:{
				
					System.out.println("enter data..");
					int data = sc.nextInt();
					obj.addLast(data);
					}
					break;

				case 3:{
					System.out.println("enter data..");
					int data = sc.nextInt();
					System.out.println("enter position..");
					int pos = sc.nextInt();
					obj.addAtPos(data,pos);
					
					}
				        break;

				case 4:
					obj.deleteFirst();
					break;

				case 5:
					obj.deleteLast();
					break;
				case 6:{
					System.out.println("enter position..");
					int pos = sc.nextInt();
					obj.deleteAtPos(pos);
					}
					break;
				case 7:{
					int count = obj.countNode();
					System.out.println("no of nodes are : "+count);
					}
					break;
				case 8:
					obj.printDLL();
					break;
				default:
					System.out.println("wrong choice");
			}		
			System.out.println("do you want to continue ?...");
			ch = sc.next().charAt(0);		
					
		}while(ch=='y'||ch=='Y');
	}
		

}

