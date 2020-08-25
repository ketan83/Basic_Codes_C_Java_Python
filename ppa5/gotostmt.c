#include<stdio.h>


void main () {

	/*
	int x =7;
	printf("Goto statement \n");

	goodmorning :                          //label statement
		printf("Good Morning  \n");
		printf("Have a nice day  \n");
		x--;
		printf("  \n");

		if(x>=5)
	goto goodmorning;

O/p:
Goto statement
Good Morning
Have a nice day

Good Morning
Have a nice day

Good Morning
Have a nice day

*/
	/*

		printf("Goto stmt \n");

		goto goodafternoon;

			printf("After goto stmt \n");

		goodafternoon:
			printf("Good AFternoon \n");


			O/p:
etan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
Goto stmt 
Good AFternoon 

			*/

/* case 1:
	int x=10;

	for(int i=1 ;i<=x ;i++) {

	goto fordemo;


	}

fordemo:
	printf("Printing Statement \n");

	ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
Printing Statement
*/

	/* case 2:
		int x=10;
	int i=1;
fordemo:
        printf("Printing Statement \n");
        for( ;i<=x ;i++) {

        goto fordemo;


        }

//	O/p :
//	Printing this stmt infinite times ..
  //      printf("Printing Statement \n");

//fordemo:
  //      printf("Printing Statement \n");

*/
	/* case 3:
	     int x=10;
        int i=1;
fordemo:
        printf("Printing Statement \n");
        for( ;i<=x ;) {
	i++;
        goto fordemo;


        }

	O/p :
		ketan@ketan-tuf-fx505dt:~/ppa5$ cc gotostmt.c
ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
Printing Statement
Printing Statement
Printing Statement
Printing Statement
Printing Statement
Printing Statement
Printing Statement
Printing Statement
Printing Statement
Printing Statement
Printing Statement
 */
}
