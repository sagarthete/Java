import java.util.Scanner;

/**
 * Node
 */
class Node {

    int data;
    Node next = null;

    Node(int data) {

        this.data = data;
    }
}

class LinkedQueue {

    Node head = null;
    Node rear = null;

    void enqueue(int data) {

        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = rear.next;
        }
    }

    int dequeue() {

        if (head == null) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int ret = head.data;
            head = head.next;
            return ret;
        }
    }

    int front() {
        if (head == null) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            return head.data;
        }
    }

    int rear() {
        if (head == null) {
            System.out.println("queue is empty");
            return -1;
        } else {
            return rear.data;
        }
    }

    void printQ() {
        if (head == null) {
            System.out.println("queue is empty");
            return;
        } else {
            Node temp = head;

            while (temp.next != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }
}

class Client {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        LinkedQueue lq = new LinkedQueue();

        char ch;

        do {

            System.out.println("1.enqueue");
            System.out.println("2.dequeue");
            System.out.println("3.front");
            System.out.println("4.rear");
            System.out.println("2.printQ");

            System.out.println("enter your choice");
            int choice = sc.nextInt();

            switch (choice) {

                case 1: {
                    System.out.println("enter data");
                    int data = sc.nextInt();
                    lq.enqueue(data);
                }
                    break;

                case 2: {
                    int ret = lq.dequeue();
                    if (ret != -1)
                        System.out.println(ret + " is poped");

                }
                    break;
                case 3: {
                    int ret = lq.front();
                    if (ret != -1) {
                        System.out.println(ret + " is at front");
                    }
                }
                    break;

                case 4: {
                    int ret = lq.rear();
                    if (ret != -1) {
                        System.out.println(ret + " is at rear");
                    }
                }
                    break;
                case 5:
                    lq.printQ();
                    break;

                default:
                    System.out.println("wrong input..");
            }
            System.out.println("do you want to continue?..");
            ch = sc.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');
    }
}
