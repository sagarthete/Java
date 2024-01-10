// circular queue
/**
 * circularQ
 */
import java.util.*;

public class circularQ {

    int cqarr[];
    int front;
    int rear;
    int maxsize;

    circularQ(int size) {
        this.cqarr = new int[size];
        front = -1;
        rear = -1;
        maxsize = size;
    }

    void enqueue(int data) {

        if ((rear == maxsize - 1 && front == 0) || ((rear + 1) % maxsize )== front) {
            System.out.println("queue is full");
        }else{
		 if (front == -1) {
            		front = rear = 0;
       		}else if (front != 0 && rear == maxsize - 1) {
            		rear = 0;
        	}else {
            		rear++;
        	}
        	cqarr[rear] = data;
	}
    }

    int dequeue() {

        if (front == -1) {
            System.out.println("queue if empty");
            return -1;
        } else {
            int ret = cqarr[front];
            if (front == rear) {
                front = rear = -1;
            } else if (front == maxsize - 1) {
                front = 0;
            } else {
                front++;
            }
            return ret;
        }
    }

    void printQ() {

        if (front == -1) {

            System.out.println("queue is empty");
        } else {
            if (front <= rear) {
                for (int i = front; i <= rear; i++) {
                    System.out.print(cqarr[i]+" ");
                }
		System.out.println();
            } else {
                for (int i = front; i < maxsize; i++) {
                    System.out.print(cqarr[i] + " ");
                }
                for (int i = 0; i <= rear; i++) {
                    System.out.print(cqarr[i] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int size = sc.nextInt();

        circularQ q = new circularQ(size);

        char ch;

        do {

            System.out.println("1.enqueue");
            System.out.println("2.dequeue");
            System.out.println("5.printQ");

            System.out.println("enter your choice");
            int choice = sc.nextInt();

            switch (choice) {

                case 1: {
                    System.out.println("enter data");
                    int data = sc.nextInt();
                    q.enqueue(data);
                }
                    break;

                case 2: {
                    int ret = q.dequeue();
                    if (ret != -1)
                        System.out.println(ret + " is poped");

                }
                    break;
                case 3:
                    q.printQ();
                    break;

                default:
                    System.out.println("wrong input..");
            }
            System.out.println("do you want to continue?..");
            ch = sc.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');
    }
}

