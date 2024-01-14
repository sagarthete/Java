import java.util.*;

class Stack{
	int stackarr[];
	int top1;
	int top2;
	int maxsize;

	Stack(int size){
		this.stackarr = new int[size];
		top1 = -1;
		top2 = size;
		maxsize = size;
	}

	void push1(int data){
	
		if(top2-top1>1){
			top1++;
			stackarr[top1] = data;
		}else{
			System.out.println("stack is full");
		}
	}
	void push2(int data){
	
		if(top2-top1>1){
			top2--;
			stackarr[top2] = data;
		}else{
			System.out.println("stack is full");
		}
	}
	int pop1(){
		if(top1==-1){
			System.out.println("stack is empty");
			return -1;
		}else{
			int ret = stackarr[top1];
			top1--;
			return ret;

		}
	}
	int pop2(){
		if(top2==maxsize){
			System.out.println("stack is empty");
			return -1;
		}else{
			int ret = stackarr[top2];
			top2++;
			return ret;

		}
	}
	void printStack1(){
		if(top1==-1){
			System.out.println("stack is empty");
		}else{
			for(int i=0;i<=top1;i++){
				System.out.print(stackarr[i]+" ");
			}
			System.out.println();
		}
	}
	void printStack2(){
	
		if(top2==maxsize){
			System.out.println("stack is empty");
		}else{
		
			for(int i = maxsize-1;i>=top2;i--){
				System.out.print(stackarr[i]+" ");
			}
			System.out.println();
		}
	}
}
class Client{

	public static void main(String args[]){
	
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the size");
			int size = sc.nextInt();
			
			Stack st = new Stack(size);
			
			char ch;

                do{
                        System.out.println("_____MENU_____\n");
                        System.out.println("1.push1");
                        System.out.println("2.pop1");
                        System.out.println("3.push2");
                        System.out.println("4.pop2");
            		System.out.println("5.printStack1");
            		System.out.println("6.printStack2");

			System.out.println("enter your choice");
			int choice = sc.nextInt();

                      switch(choice){

                                case 1:{
                                        System.out.println("enter element..");
                                        int data = sc.nextInt();
                                        st.push1(data);
                                        }
                                       break;

                                case 2:{
                                        int data = st.pop1();
                                        if(data==-1)
                                                System.out.println("stack is empty..");
                                        else
                                                System.out.println("poped element is :"+data);

                                        }
                                       break;

                                case 3:{
                                        System.out.println("enter element..");
                                        int data = sc.nextInt();
                                        st.push2(data);
  
                                        }
                                       break;

                                case 4:{
                                        int data = st.pop2();
                                        if(data==-1)
                                                System.out.println("stack is empty..");
                                        else
                                                System.out.println("poped element is :"+data);
                                        
                                        }
                                       break;
                                case 5:
                                        st.printStack1();
                                        break;
                                case 6:
                                        st.printStack2();
                                        break;
                                default:
                                        System.out.println("wrong choice");

                        }

                        System.out.println("continue ?????....");
			ch = sc.next().charAt(0);			
		}while(ch=='y'|| ch=='Y');
	}
}


