
 class File{
 
       File(){
       
         System.out.println("in File Constructor");

       }

       void openFile(String fileType){
       
            System.out.println(fileType+" file Opened");
       }

       void closeFile(String fileType){
        
            System.out.println(fileType+" file closed");
       
       }
 }

 class TextFile extends File{
 
       TextFile(){
        
          System.out.println("in TextFile constructor");
       }

       void OperateTextFile(String type){
       
            openFile(type);
	    closeFile(type);
       }
 
 }

class AudioFile extends File{

      AudioFile(){
      
         System.out.println("in AudioFile constructor");

      }
      void operateAudioFile(String type){
            
	    openFile(type);
	    closeFile(type);
      
      }
}

class User{

      public static void main(String args[]){
      
             TextFile obj = new TextFile();
	     obj.OperateTextFile("text");
	     obj.OperateAudioFile("text");
      }
}
