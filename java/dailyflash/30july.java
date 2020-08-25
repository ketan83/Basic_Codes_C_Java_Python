/*

class arithmatic {

	public static void main(String[] args) {

		int x , y,z ,l=1;
			x =40;
			y=20;
		switch(l) {

			case 1: z = x+ y;
				System.out.println("Addition of x & y is "+z);
				break;	

			case 2: z = x-y;
				System.out.println("Subtraction of x & y is "+z);
				break;	

			case 3: z = x*y;
				System.out.println("Multiplication of x & y is "+z);
				break;

			case 4: z = x/y;
				System.out.println("Division of x & y is "+z);
				break;	

			case 5: z = x%y;
				System.out.println("Modulus of x & y is "+z);
				break;	
		}
		}
}
O/p:
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java arithmatic
Addition of x & y is 60
ketan@ketan-tuf-fx505dt:~/java/dailyflash$

*/

import java.util.Scanner;

/*
class program2 {

		public static void main(String[] args) {


			Scanner obj = new Scanner(System.in);
			char ch;

			System.out.println("Enter Username ");
				ch = obj.next().charAt(0);

			switch(ch) {

				case 'c' : System.out.println(" Programming language C , C++");
					 System.out.println("\r\n");
					 	break;
			
				case 'j' : System.out.println(" Programming language java");
					 System.out.println("\r\n");
					 	break;
			
				case 'p' : System.out.println(" Programming language python3");
					 System.out.println("\r\n");
					 	break;
			
				case 'r' : System.out.println(" Programming language Ruby");
					 System.out.println("\r\n");
					 	break;
				case 'l' : System.out.println(" Programming language Latex");
					 System.out.println("\r\n");
					 	break;
				 default : System.out.println("N0 Programming language ");
					 System.out.println("\r\n");
					 	break;
			}
			}
}

O/p:
etan@ketan-tuf-fx505dt:~/java/dailyflash$ java program1
16is an even number
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program2
Enter Username
l
 Programming language Latex


ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program2
Enter Username
c
 Programming language C , C++


ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program2
Enter Username
p
 Programming language python3
*/


/*
class program3 {

                public static void main(String[] args) {


                        Scanner obj = new Scanner(System.in);
                        String ch;

                        System.out.println("Enter Username ");
                                ch = obj.nextLine();

                        switch(ch) {

                                case "MH" : System.out.println(" State Maharashtra");
                                         System.out.println("\r\n");
                                                break;

                                case "MP" : System.out.println(" State Madhya Pradesh");
                                         System.out.println("\r\n");
                                                break;

                                case "UP" : System.out.println("State Uttar Pradesh");
                                         System.out.println("\r\n");
                                                break;

                                case "BR" : System.out.println(" State Bihar");
                                         System.out.println("\r\n");
                                                break;
                                case "JH" : System.out.println(" State Jharkhand");
                                         System.out.println("\r\n");
                                                break;
                                 default : System.out.println("No State Name Found ");
                                         System.out.println("\r\n");
                                                break;
                        }
                        }
}

O/p:


ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program3
Enter Username
MH
 State Maharashtra


ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program3
Enter Username
MP
 State Madhya Pradesh


ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program3
Enter Username
UP
State Uttar Pradesh

*/


/*
class program4 {

                public static void main(String[] args) {


                        Scanner obj = new Scanner(System.in);
                        int  x;

                        System.out.println("Enter Number ");
                                x = obj.nextInt();

                          switch(x) {

                                case 1 : System.out.println(" One");
                                         System.out.println("\r\n");
                                                break;

                                case 2 : System.out.println(" Two");
                                         System.out.println("\r\n");
                                                break;

                                case 3 : System.out.println("Three");
                                         System.out.println("\r\n");
                                                break;

                                case 4 : System.out.println(" Four ");
                                         System.out.println("\r\n");
                                                break;
                                case 5 : System.out.println(" Five ");
                                         System.out.println("\r\n");
                                                break;
                                 default : System.out.println("No Number  Found ");
                                         System.out.println("\r\n");
                                                break;
                        }
                        }
}

O/p:
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ javac 30july.java
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program4
Enter Number
2
 Two


ketan@ketan-tuf-fx505dt:~/java/dailyflash$
ketan@ketan-tuf-fx505dt:~/java/dailyflash$
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program4
Enter Number
7
No Number  Found


ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program4
Enter Number
4
 Four


ketan@ketan-tuf-fx505dt:~/java/dailyflash$
*/

/*
class program5 {

                public static void main(String[] args) {


                        Scanner obj = new Scanner(System.in);
                        int  x;

                        System.out.println("Enter Number ");
                                x = obj.nextInt();
				if(x==0) {
					System.out.println(x+" is equal to zero ");
				
				}else if(x>=0) {

					System.out.println(x+" is greater than zero " );
				}else if(x<=0){

					System.out.println(x+ " is less than zero");

				}
                                
                        }
}

O/p:
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program5
Enter Number
65
65 is greater than zero
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program5
Enter Number
-20
-20 is less than zero
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program5
Enter Number
0
0 is equal to zero
*/
