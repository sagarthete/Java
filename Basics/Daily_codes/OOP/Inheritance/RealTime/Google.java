
  class Google{
  
         String product = null;
	 int price = 0;

	 void productInfo(){
	 
	      System.out.println(product +" = "+price+" thousand ");
	     
	 }
  }

  class Alexa extends Google{
  
        Alexa(String product,int price){
	
	    this.product = product;
	    this.price = price;
	}

	void AlexaInfo(){
	
	    productInfo();
	    System.out.println(product);
	    System.out.println(price);
	}
  
  }
 
  class User{
  
        public static void main(String args[]){
	
	       Alexa product1 = new Alexa("personal digital assistanat",20);
               product1.AlexaInfo();	       
	}
  }
