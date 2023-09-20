import java.util.*;

	class Project{
	
		String name = null;
		int teamsize = 0;
		int duration = 0;

		Project(String name,int teamsize,int duration){
		
			this.name = name;
			this.teamsize = teamsize;
			this.duration = duration;
		}
		public String toString(){
		
			return name;
		}
	}
	
	class SortByDuration implements Comparator{
	
		public int compare(Object obj1,Object obj2){
		
			return ((Project)obj1).duration - ((Project)obj2).duration;
		}
	}

	class PQDemo{
	
		public static void main(String args[]){
		
			PriorityQueue p = new PriorityQueue(new SortByDuration());

				p.offer(new Project("sagar",10,11));
				p.offer(new Project("tejas",20,21));
				p.offer(new Project("abhi",30,31));
				p.offer(new Project("vaibhav",40,11));

				System.out.println(p);
		}
	}
