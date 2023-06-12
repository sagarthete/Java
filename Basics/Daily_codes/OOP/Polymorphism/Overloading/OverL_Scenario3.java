// String class is Child class of Object class :parent gives priority to child

 class Demo{
 
       void fun(Object obj){
       
          System.out.println("Object class para");
       }

       void fun(String str1){
       
          System.out.println("String class para");
       
       }
 }

 class Client{
 
       public static void main(String args[]){
       
              Demo obj = new Demo();
	      obj.fun(null);                      // here no ambiguity occure : parent gives priority to child
       }
 }
