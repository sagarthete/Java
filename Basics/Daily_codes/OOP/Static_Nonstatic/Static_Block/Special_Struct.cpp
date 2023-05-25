
   #include<iostream>
    using namespace std;
 
          class Demo{
	  
	        public:

		      void fun(){
		      
		         cout<<"in class Demo"<<endl;
		      }	
	  
	 };

         void gun(){
	 
	      cout<<"in gun function"<<endl;
	 }

         void mun(){
	     
             cout<<"in mun"<<endl;
     
	 }
    
         int main(){
	 
            Demo obj;		  
	    void (*ptr)(void);
	    void (*fun_ptr)(void);
	    ptr = gun;
	    fun_ptr = mun;
	    Demo *obj_ptr = &obj;

	    void (*arr[2])(void) = {ptr,fun_ptr};

	     cout<<arr[0]<<endl;
	     cout<<arr[1]<<endl;
	 }
     
