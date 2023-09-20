import java.util.*;

	class Contries{
	
		String name = null;
		int no_of_states = 0;

			Contries(String name,int no_of_states){
			
				this.name = name;
				this.no_of_states = no_of_states;
			}
			public String toString(){
			
				return "{" + name + ":" +no_of_states + "}";  
			}
	}
	class SortByName implements Comparator{
	
		public int compare(Object obj1,Object obj2){
		
			return ((Contries)obj1).name.compareTo(((Contries)obj2).name);
		}
	}
	class SortByNum implements Comparator{
	
		public int compare(Object obj1,Object obj2){
		
			return ((Contries)obj1).no_of_states - ((Contries)obj2).no_of_states;
			
		}
	}

	class TreeMapDemo{
	
		public static void main(String args[]){
		
			TreeMap tm = new TreeMap(new SortByName());
			
			tm.put(new Contries("India",29),"Developing");
			tm.put(new Contries("Pakistan",17),"Poor");
			tm.put(new Contries("China",35),"Developed");

			System.out.println(tm);
		}
	}
