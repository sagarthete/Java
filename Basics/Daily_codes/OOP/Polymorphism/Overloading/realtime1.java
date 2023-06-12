
   class IPL{
   
       void matchInfo(String team1,String team2){
       
	     System.out.println(team1+" "+team2);       
        }
       void matchInfo(String team1,String team2,String venue){
       
	     System.out.println("venue = "+venue);       
        }
   }

class Client{

       public static void main(String args[]){
       IPL IPL2023 = new IPL();
       IPL2023.matchInfo("CSK","GT");
       IPL2023.matchInfo("CSK","GT","NMDS");
       }
}
