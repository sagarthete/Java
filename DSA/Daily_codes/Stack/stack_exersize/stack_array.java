import java.util.*;

class Stack{
	
	int top = -1;
	int size;
	int arrStack[];
	
	Stack(int size){
		this.size = size;
		arrStack = new int[size];
	}

	void push(int data){
	
		if(top==size-1){
			System.out.println("stack is full");
		}else{
		
			top++;
			arrStack[top] = data;
		}
	}

	int pop(){
	
		if(top==-1){
			return -1;
		}else{
		
			int data = arrStack[top];
			top--;
			return data;
		}
	}

	int peek(){
		if(top==-1){
		
			return -1;
		}else{
		
			return arrStack[top];
		}
	}
	boolean empty(){
		if(top<=size-2){
			return true;
		}
		return false;
	}

	void printStack(){
	
		if(top==-1){
			System.out.println("stack is empty..");
		}
		else{
			System.out.print("[ ");
			for(int i=0;i<=top;i++){
			
				System.out.print(arrStack[i]+" ");
			}
			System.out.println("]");
		}
	}

}
class Client{

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of stack");
		int size = sc.nextInt();

		Stack st = new Stack(size);

		char ch;

		do{
			System.out.println("_____MENU_____\n");
			System.out.println("1.push");
			System.out.println("2.pop");
			System.out.println("3.peek");
			System.out.println("4.empty");
			System.out.println("5.printStack");

			System.out.println("enter your Choice");

			int choice = sc.nextInt();

			switch(choice){
			
				case 1:{
					System.out.println("enter element..");
					int data = sc.nextInt();
					st.push(data);	
					}
				       break;

				case 2:{
					int data = st.pop();
					if(data==-1)
						System.out.println("stack is empty..");
					else
						System.out.println("poped element is :"+data);
					
					}
				       break;

				case 3:{
					int data = st.peek();
					if(data==-1)
						System.out.println("stack is empty..");
					else
						System.out.println("element at top is :"+data);
					
					}
				       break;

				case 4:{
					boolean val = st.empty();
					if(val==true)
						System.out.println("stack is empty");
					else
						System.out.println("stack is full");
					}	
				       break;
				case 5:
					st.printStack();
					break;
				default:
					System.out.println("wrong choice");
				
			}
		
			System.out.println("continue ?????....");
			ch = sc.next().charAt(0);
			
		}while(ch=='y' || ch=='Y');
	}
}

