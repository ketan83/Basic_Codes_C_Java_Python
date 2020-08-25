// PROGRAM NUMBER NAMES WRITTEN AFTER CLASS NAMES , WITH O/P'S 

import java.util.Scanner;


/*
class  program1 {

public static void main(String[] args) {
	Scanner obj = new Scanner(System.in);
	char ch;
	System.out.println("Enter a character :");
	ch = obj.next().charAt(0);

	if(ch>='a' && ch<='z') {
		System.out.println("letter is in lowercase "+ch);
	}else if(ch>='A' && ch<='Z')
		System.out.println("letter is in uppercase "+ch);

		}
}

 * O/p:
 * ketan@ketan-tuf-fx505dt:~/java/dailyflash$ javac aug19.java
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program1
Enter a character :
A
letter is in uppercase A
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program1
Enter a character :
g
letter is in lowercase g
ketan@ketan-tuf-fx505dt:~/java/dailyflash$
*/



/*
class program4 {
public static void main(String[] args){ 
	int i , j;

	for(i=1; i<=4 ;i++) {

		for(j=1 ;j<=4 ;j++) {

			System.out.print("\t"+ j + "\t" );
		}

		System.out.println("\n");
}
}
}
O/p;
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ javac aug19.java
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program4
	1		2		3		4

	1		2		3		4

	1		2		3		4

	1		2		3		4

*/

/*
class program5 {
public static void main(String[] args) { 
Scanner obj = new Scanner(System.in);
	int x , y ,z,sum;

	System.out.println("Enter angles in degrees :");
	x = obj.nextInt();
	y = obj.nextInt();
	z = obj.nextInt();

	sum = x + y +z;

	if(sum == 180)
		System.out.println("The traingle with angles "+ x +"\t " +y +"\t "+ z +" is valid one \n");
	else
		System.out.println("The traingle with angles "+ x + y + z + " is invalid one  \n");
}
}

o/p;
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ javac aug19.java
^[[Aketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program5
Enter angles in degrees :
30 60 70
The traingle with angles 306070 is invalid one

ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program5
Enter angles in degrees :
30 60 90
The traingle with angles 30	 60	 90 is valid one

ketan@ketan-tuf-fx505dt:~/java/dailyflash$
*/


/*
class program2 {
public static void main(String[] args) { 

Scanner obj = new Scanner(System.in);
	int x;
	System.out.println("Enter a day number :");
	x = obj.nextInt();

	switch(x) {

		case 1: System.out.println(" Monday \n");
			break;

		case 2: System.out.println(" Tuesday \n");
			break;

		case 3: System.out.println(" Wednesday \n");
			break;

		case 4: System.out.println(" Thursday \n");
			break;

		case 5: System.out.println(" Friday \n");
			break;

		case 6: System.out.println(" Saturday \n");
			break;

		case 7: System.out.println(" Sunday \n");
			break;

		default :System.out.println("Wrong Choice , My friend \n");
			 break;

	}
}
}
o/p;
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program2
Enter a day number :
3
 Wednesday

ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program2
Enter a day number :
4
 Thursday

ketan@ketan-tuf-fx505dt:~/java/dailyflash$
*/

/*
class program3 {
public static void main(String[] args) {

Scanner obj = new Scanner(System.in);
        int x;
        System.out.println("Enter a month number :");
        x = obj.nextInt();

        switch(x) {

                case 1: System.out.println(" january has 31 days \n");
                        break;

                case 2: System.out.println(" February has 28 (29 leap year )days \n");
                        break;

                case 3: System.out.println(" March has 31  days\n");
                        break;

                case 4: System.out.println(" April has 30 days \n");
                        break;

                case 5: System.out.println(" May has 31 days\n");
                        break;

                case 6: System.out.println(" June has 30  days \n");
                        break;

                case 7: System.out.println(" July has 31 days\n");
                        break;

                case 8: System.out.println(" August has 31 days\n");
                        break;

                case 9: System.out.println(" September has 30 days\n");
                        break;

                case 10: System.out.println("October has 31 days \n");
                        break;

                case 11: System.out.println(" November has 30 days\n");
                        break;

                case 12: System.out.println(" December has 31 days \n");
                        break;

                default :System.out.println("Wrong Choice , My friend \n");
                         break;

        }
}
}
O/p;
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program3
Enter a month number :
4
 April has 30 days

ketan@ketan-tuf-fx505dt:~/java/dailyflash$
*/
