//NOTE : ALL PROGRAMS NAMES NUMBERS ARE WRITTEN IN THE  FORM OF CLASS NAMES , ALSO OUTPUT OF RESPECTIVE QUESTIONS IS PROVIDED  

import java.util.Scanner;

/* 	PROGRAM1
 *
class program1 {
public static void main(String[] args) {

	Scanner obj = new Scanner(System.in);
	char ch ;
	System.out.println("ENter a character :");
	ch = obj.next().charAt(0);
	

	if((ch>=97) && (ch<=122) || (ch>=65) && (ch<=90))
					System.out.println(ch+" is an alphabet \n" );
				   else
					System.out.println(ch+" is not an alphabet \n");
					
}
}
O/p;
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program1
ENter a character :
g
g is an alphabet

ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program1
ENter a character :
{
{ is not an alphabet

ketan@ketan-tuf-fx505dt:~/java/dailyflash$
*/

/*	PROGRAM2 
 *
 class program2 {
public static void main(String[] args) { 

	Scanner obj = new Scanner(System.in);
	char ch ;
        System.out.println("ENter a character :");
        ch = obj.next().charAt(0);

	if((ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') || (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'))
													     System.out.println(ch+" is a vowel \n" );
													   else
													      System.out.println(ch+" is a consonant \n");
					}
}
O/p:
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ javac 18aug.java
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program2
ENter a character :
g
g is a consonant

ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program2
ENter a character :
u
u is a vowel

ketan@ketan-tuf-fx505dt:~/java/dailyflash$
*/


 /* 	PROGRAM 3
  *
 class program3 {
public static void main(String[] args) {

	Scanner obj = new Scanner(System.in);
	 char ch='*' ;
        //System.out.println("ENter a character :");
  	//ch = obj.next().charAt();

	if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
			System.out.println(ch+" is a  character \n");
		else //if(ch>='z')
		   System.out.println(ch+" is a special character \n");
		//else if(ch>='0' && ch<='9')
		//	System.out.println(ch+" is a digit \n");
}
}
O/p:
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program3
{ is a special character

ketan@ketan-tuf-fx505dt:~/java/dailyflash$ vim 18aug.java
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ javac 18aug.java
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program3
* is a special character

ketan@ketan-tuf-fx505dt:~/java/dailyflash$
*/



/*	PROGRAM 4
 *
class program4{
public static void main(String[] args) {

	int i , j;

	for(i=1; i <=4 ; i++) {
		for(j=1; j<=4 ;j++) {

			System.out.print(" 1 ");

		}
		System.out.println("\n");
	}
}
}
O/p:
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ javac 18aug.java
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program4
 1  1  1  1

 1  1  1  1

 1  1  1  1

 1  1  1  1

ketan@ketan-tuf-fx505dt:~/java/dailyflash$
*/

/*	PROGRAM 5
 *
class program5 {
public static void main(String[] args) {

	int x =1 ,y =4 , z=2;

	if(x>y)
		System.out.println("x is greater than y \n");
	else if(y<z)
		System.out.println("z is greater than y \n");
	else if((x<y) && (y>z) &&(x<z)) 
		System.out.println(y+" is max number among "+x+y+ " & "+ z +"\n");
}
}
o/p;
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program5
4 is max number among 14 & 2

ketan@ketan-tuf-fx505dt:~/java/dailyflash$
*/
