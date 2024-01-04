import java.util.*;

class Node{

	int data;
	Node next = null;

	Node(int data){
		this.data = data;
	}
}

class LinkedList{
	
	Node head = null;

	void addNode(int data){
	
		Node newNode = new Node(data);

		if(head==null){
		
			head = newNode;
		}
		else{
		
			Node temp = head;

			while(temp.next!=null){
			
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	void inplaceRevRec(Node prev,Node curr){
	
		if(curr==null){
			head = prev;
			return;
		}
		else{
		
			Node forward = curr.next;
			curr.next = prev;
			prev = curr;
			curr = forward;
		}
		inplaceRevRec(prev,curr);
	}
	
	int countNode(){
	
		Node temp = head;
		int count = 0;

		while(temp!=null){
			temp = temp.next;
			count++;
		}
		return count;
	}
	/*
	  this function prints next node of the two nodes in even length LL;
	 */
	void middleNode(){
		
		if(head==null){
		
			System.out .println("empty LL");
		}else if(head.next == null){
			System.out.println(head.data);
		}else{
		
			int count = countNode();
			System.out.println("count is : "+count);

			Node temp = head;
			int div = count/2;

			while(div!=0){
			
				temp = temp.next;
				div--;
			}
			System.out.println(temp.data);
		}
		
	}

	void slowFastPointer(){
		
		if(head==null){
			System.out.println("empty linkedlist");
		}else if(head.next == null){
			System.out.println(head.data);
		}else{
		
			Node slow = head;
			Node fast = head;

			while(fast.next!=null){
			
				fast = fast.next;
				if(fast.next!=null){
					fast = fast.next;
				}
				slow = slow.next;
			}
			System.out.println(slow.data);
		} 
	}

	void printLL(){
	
		if(head==null){
		
			System.out.println("empty LL...");
		}else{
			Node temp = head;
			
			while(temp.next!=null){
				//temp = temp.next;
				System.out.print(temp.data+"->");
				temp = temp.next;
			}
			System.out.println(temp.data);
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
                        System.out.println("2.MiddleByCount");
                 	System.out.println("3.inplaceRev with recurtion");
                        System.out.println("4.printLL");
                        System.out.println("5.Middle by slow fast pointer");
                        
                        System.out.println("\nenter your choice..........");
                        Scanner sc = new Scanner(System.in);
                        int choice = sc.nextInt();

                        switch(choice){

                                case 1:{

                                        System.out.println("enter data");
                                        int data = sc.nextInt();
                                        ll.addNode(data);
                                }
                                        break;

                                case 2:
                                       	ll.middleNode();
                                        break;

                                case 3:{
					Node prev = null;
                                        ll.inplaceRevRec(prev,ll.head);
					}
				       break;
				case 4:
				       ll.printLL();
				       break;
				case 5:
				       ll.slowFastPointer();
				       break;
				default:
				       System.out.println("wrong choice");

			}
                        System.out.println("do you want to continue ?????");
                        ch = sc.next().charAt(0);


                }while(ch=='Y' || ch=='y');
        }
}

