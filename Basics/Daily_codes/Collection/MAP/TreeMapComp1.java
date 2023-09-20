import java.util.*;

	class Platform implements Comparable{
		
		String str = null;
		int fYear = 0;

		Platform(String str,int fYear){
		
			this.str = str;
			this.fYear = fYear;
		}
		public String toString(){
		
			return "{" + str + ":"+ fYear + "}";
		}
		public int compareTo(Object obj){
		
			return this.str.compareTo(((Platform)obj).str);
		}


	}
	class TreeMapDemo{
	
		public static void main(String args[]){
		
			TreeMap tm = new TreeMap();

			tm.put(new Platform("youtube",2005),"Google");
			tm.put(new Platform("instagram",2013),"Meta");
			tm.put(new Platform("facebook",2004),"Meta");
			tm.put(new Platform("chatGpt",2022),"OpenAI");

			System.out.println(tm);
		}
	}
	
		
	
