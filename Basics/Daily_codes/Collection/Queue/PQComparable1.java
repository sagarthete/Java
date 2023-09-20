import java.util.*;

	class Project implements Comparable{
	
		String name = null;
		int team = 0;
		int duration = 0;

		Project(String name,int team,int duration){
		
			this.name = name;
			this.team = team;
			this.duration = duration;
		}
		public String toString(){
		
			return name;
		}
		public int compareTo(Object obj){
		
			return ((this.name).compareTo(((Project)obj).name));
		}
	}
	class PQDemo{
	
		public static void main(String args[]){
		
			PriorityQueue pq = new PriorityQueue();

			pq.offer(new Project("sagar",10,20));
			pq.offer(new Project("pranav",30,40));
			pq.offer(new Project("abhi",50,60));
			pq.offer(new Project("vaibhav",70,80));

			System.out.println(pq);
		}
	}
