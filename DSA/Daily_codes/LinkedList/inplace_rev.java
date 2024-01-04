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

	void inplaceRevItr(){
	
		if(head == null){
			System.out.println("empty LL to reverse");
		}
		else{
			Node prev = null;
			Node curr = head;
			Node forward = null;

			while(curr!=null){
			
				forward = curr.next;
				curr.next = prev;
				prev = curr;
				curr = forward;
			}
			head = prev;
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
                        System.out.println("2.inplaceRev with iterations");
                        System.out.println("3.inplaceRev with recurtion");
                        System.out.println("4.printLL");
                        
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
                                       	ll.inplaceRevItr();
                                        break;

                                case 3:{
					Node prev = null;
                                        ll.inplaceRevRec(prev,ll.head);
					}
				       break;
				case 4:
				       ll.printLL();
				       break;
				default:
				       System.out.println("wrong choice");

			}
                        System.out.println("do you want to continue ?????");
                        ch = sc.next().charAt(0);


                }while(ch=='Y' || ch=='y');
        }
}

