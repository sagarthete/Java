 import Number.Number;
 import ArrayPack.ArrayDemo;
 import java.util.Scanner;
 
 class Client {
 
 	public static void main(String args[]){
	
			Scanner sc = new Scanner(System.in);
			char ch4 = 'A';
		do{
			System.out.println("_____MENU_____");
			System.out.println("1.Accenture");
			System.out.println("2.EQtech");
			System.out.println("3.PTC");
			
			System.out.println("enter serial number");
			int num = sc.nextInt();
			ArrayDemo obj1 = new ArrayDemo();
				
			Number obj2 = new Number();
			char ch1 = 'a';
			char ch2 = 'a';
			char ch3 = 'a';
			
			switch(num){
			
				case 1:
				{	
					do{
						System.out.println("____Topics____");
						System.out.println("1.Array");
						System.out.println("2.Numbers");
						System.out.println("enter your choice");
						int num1 = sc.nextInt();
					 

						switch(num1){
						
							case 1:{
								do{
									System.out.println("___Codes____");
									System.out.println("1.Search");
									System.out.println("1.sort");
									System.out.println("enter choice");
									int num2 = sc.nextInt();	
									switch(num2){
						
										case 1:
											obj1.search();
											break;
										case 2:
											obj1.sort();
											break;
										default :
											System.out.println("wrong choice");

										}
									System.out.println("enter Y/N to continue");
									ch1 = sc.next().charAt(0);
								}while(ch1=='y'||ch1=='Y');

								break;
							}
							case 2:{
							
								do{
									System.out.println("____Select option____");
									System.out.println("1.Amstrong");
									System.out.println("2.Perfect");

									System.out.println("enter choice");
									int num3 = sc.nextInt();

								
									switch(num3){
										
										case 1:
											obj2.armStrongNum();
											break;
										case 2:
											obj2.perfectNum();
											break;
										default :
											System.out.println("wrong choice");

										}
									System.out.println("enter Y/N to continue");
									ch2 = sc.next().charAt(0);
								}while(ch2=='y'||ch2=='Y');

								break;
							}

						}
					 System.out.println("enter Y/N to continue");
					 ch3 = sc.next().charAt(0);
					}while(ch3=='y'||ch3=='Y');
					break;
				}
				default:
					System.out.println("wrong choice");
				
			}
			System.out.println("enter Y/N to continue or not");
			ch4 = sc.next().charAt(0);
		}while(ch4=='y'||ch4=='Y');
 
  	}
 }
