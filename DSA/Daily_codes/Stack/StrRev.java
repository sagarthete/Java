import java.util.Scanner;
import java.util.Stack;

class StackRev {

    String revString(String str) {

        Stack<Character> s = new Stack<Character>();
        char arr[] = new char[str.length()];
        int i = 0;
        while (i < str.length()) {
            char ch = str.charAt(i);
            s.push(ch);
            i++;
        }
        i = 0;
        while (i < str.length()) {
            arr[i] = s.pop();
	    i++;
        }
	return new String(arr);

    }
}

class Demo {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.next();

        StackRev s = new StackRev();
        str = s.revString(str);
        System.out.println(str);
    }
}
