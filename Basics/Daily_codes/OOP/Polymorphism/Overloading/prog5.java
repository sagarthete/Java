//use of polymorphism
  class Demo{
    
        int add(int x,int y){
	
	    return x+y;
	}
        int add(int x,int y,int z){
	
	    return x+y+z;
	}
        float add(float x,float y){
	
	    return x+y;
	}

	public static void main(String args[]){
	
	       Demo obj = new Demo();
	       System.out.println(obj.add(10,20));
	       System.out.println(obj.add(10,20,30));
	       System.out.println(obj.add(10.5f,20.5f));
	}
  }
