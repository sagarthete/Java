 package Array;
 import java.util.*;
 public class ADDITION{
 	
	ArrayList obj = new ArrayList();
	public ADDITION(){ 	
		
	}
	public void addList(int x){
	
		obj.add(x);	
	}
	public void addList(float x){
	
		obj.add(x);	
	}
	public void addList(String x){
	
		obj.add(x);	
	}
	public  int Size(){
	
		return obj.size();
	}
	public void Contains(Object s){
	
		System.out.println(obj.contains(s));
	}
	public void addList(int x,Object e){
	
		obj.add(x,e);
	}
	public void Remove(Object s){
	
		System.out.println(obj.remove(s));
	}
	public void AddAll(Collection s){
		
		System.out.println(obj.addAll(s));
	}
	public void Get(int x){
	
		System.out.println(obj.get(x));
	}
	public void Set(int x,Object ob){
	
		System.out.println(obj.set(x,ob));
	}
	public ArrayList print(){
	
		return obj;
	}

}

