import java.util.Scanner;

class Node {
    int data;
    Node next = null;

    Node(int data) {
        this.data = data;
    }
}

class circularQ {

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
        rear.next = head;
    }

    int dequeue() {
        if (head == null) {
            System.out.println("queue is empty");
            return -1;
        } else {
            int ret = head.data;
            head = head.next;
            rear.next = head;
            return ret;
        }
    }

    void printQ() {
        if (head == null) {
            System.out.println("queue is empty");
        } else {
            Node temp = head;
            while (temp.next != head) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }
}

class Demo{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        circularQ q = new circularQ();

        char ch;

        do {

            System.out.println("1.enqueue");
            System.out.println("2.dequeue");
            System.out.println("3.printQ");

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

