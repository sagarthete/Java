import java.util.*;
import java.util.Stack;

class ValidParanthesis{

	boolean paranthesisCheck(String str){
	
		Stack<Character> s = new Stack<Character>();
		for(int i=0;i<str.length();i++){
			
			char ch = str.charAt(i);
			if(ch=='(' || ch=='{' || ch=='['){
			
				s.push(ch);
 			}else{
				
				if(!s.empty()){
					
					char ch1 = s.peek();
					if((ch==')' && ch1=='(') || (ch=='}' && ch1=='{') || (ch==']' && ch1=='[')){
					
						s.pop();
					}else{
					
						return false;
					}
				}else{
					return false;
				}
			}
		}
		if(s.empty()){
			return true;
		}else{
			return false;
		}
	}
}
class Client{

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter String of parenthesis");

		String str = sc.next();

		ValidParanthesis vp = new ValidParanthesis();
		boolean ret = vp.paranthesisCheck(str);

		if(ret){
			System.out.println("valid");
		}else{
			System.out.println("not valid");
		}
	}
}
