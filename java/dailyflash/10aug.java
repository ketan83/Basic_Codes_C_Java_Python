
import java.util.Scanner; 
/* PROGRAM TO PRINT CUBE OF ODD NUMBERS BETWEEN 1 TO 50
class program1 {

	public static void main(String[] args) {
	
	Scanner obj = new Scanner(System.in);
		int i ,j =0,x, n;
	System.out.println("Enter number ");
	n = obj.nextInt();

	for(i =1 ;i<=n; i++){

		if(i%2==1){

			x=i*i*i;
	
				System.out.println("Cube of " +i+ " is "+x);
				System.out.println("\r\n");
			}
	}
	}
}

O/p : 

ketan@ketan-tuf-fx505dt:~/java/dailyflash$ javac 10aug.java
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program1
Enter number 
50
Cube of 1 is 1


Cube of 3 is 27


Cube of 5 is 125


Cube of 7 is 343


Cube of 9 is 729


Cube of 11 is 1331


Cube of 13 is 2197


Cube of 15 is 3375


Cube of 17 is 4913


Cube of 19 is 6859


Cube of 21 is 9261


Cube of 23 is 12167


Cube of 25 is 15625


Cube of 27 is 19683


Cube of 29 is 24389


Cube of 31 is 29791


Cube of 33 is 35937


Cube of 35 is 42875


Cube of 37 is 50653


Cube of 39 is 59319


Cube of 41 is 68921


Cube of 43 is 79507


Cube of 45 is 91125


Cube of 47 is 103823


Cube of 49 is 117649


ketan@ketan-tuf-fx505dt:~/java/dailyflash$ 
*/

/* PROGRAM TO PRINT ADDITION OF 1 TO 10 WITH 10 TO 1 
 *
class program2{

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		int i , j , n ,x =10 ,y;

		System.out.println("Enter number ");
	       	n = obj.nextInt();

		for(i =1 ;i<=n; i++) {
		
			       y =i+x;
				System.out.println(i+ " + " + x + " = " +y);
				x--;
		}
	}
	}

O/p:

ketan@ketan-tuf-fx505dt:~/java/dailyflash$ javac 10aug.java
^[[Aketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program2
Enter number
10
1 + 10 = 11
2 + 9 = 11
3 + 8 = 11
4 + 7 = 11
5 + 6 = 11
6 + 5 = 11
7 + 4 = 11
8 + 3 = 11
9 + 2 = 11
10 + 1 = 11
*/

/*   PROGRAM TO PRINT PRIME NUMBER SERIES RANGING UPTO THAT NUMBER FR0M 1    
class program3 {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		int i ,j,c,n;

		System.out.println("Enter Number ");
		n = obj.nextInt();
		System.out.println("\r\n");
		for(i= 2 ; i<=n ; i++) {
			 c=0 ;
			 j =1;
			while(j<=i){

				if(i%j==0) {
					c++;
				}
				j++;
			}
				if(c==2) {

					System.out.println(i);

				}

			}
		}
	}

O/p:

ketan@ketan-tuf-fx505dt:~/java/dailyflash$ javac 10aug.java
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program3
Enter Number
20


2
3
5
7
11
13
17
19
ketan@ketan-tuf-fx505dt:~/java/dailyflash$

*/

/* PROGRAM TO  PRINT TABLE OF 4 IN REVERSE ORDER USING WHILE LOOP
 *
 *
class program5 {
	
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		int i=10 , j , n;

		System.out.println("Enter the number ");
		n = obj.nextInt();

		System.out.println("table of 4 in reverse order is ");

		while(i>=1){
		
			j = n * i;

			System.out.println(j);
				
			i--;
			}
		}

}

O/p:

ketan@ketan-tuf-fx505dt:~/java/dailyflash$ javac 10aug.java
^[[Aketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program5
Enter the number
4
table of 4 in reverse order is
40
36
32
28
24
20
16
12
8
4
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ vim 10aug.java
*/

/* PROGRAM TO PRINT SERIES OF FACTORIALS OF THAT NUMBERS RANGING UPTO THAT NUMBER FROM 1
 *
class program4 {

	public static void main(String[] args) {

		  Scanner obj = new Scanner(System.in);
                int i=10 , j , x=1 ,n ,fact=1;

                System.out.println("Enter the number upto which you want to get factorials from 1 ");
                n = obj.nextInt();

	for ( j =1 ; j <=n ; j++) {

		for(i=j ; i>=j; i--) {
		
				fact = fact * i;
				//n--;
		System.out.println("Factorial of " + j + " is " +fact);
		}

	}		
	}
}

O/p :

ketan@ketan-tuf-fx505dt:~/java/dailyflash$ vim 10aug.java
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ javac 10aug.java
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program4
Enter the number upto which you want to get factorials from 1
10
Factorial of 1 is 1
Factorial of 2 is 2
Factorial of 3 is 6
Factorial of 4 is 24
Factorial of 5 is 120
Factorial of 6 is 720
Factorial of 7 is 5040
Factorial of 8 is 40320
Factorial of 9 is 362880
Factorial of 10 is 3628800
ketan@ketan-tuf-fx505dt:~/java/dailyflash$
*/
