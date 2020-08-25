#include<stdio.h>

/* PROGRAM 1
void main() {

	char ch;
	printf("Enter a character :");
	scanf("%c",&ch);

	if(ch>='a' && ch<='z') {
		printf("letter %c is in lowercase \n",ch);
	}else if(ch>='A' && ch<='Z')
		printf("letter %c is in uppercase \n",ch);
			
		}

O/p:
ketan@ketan-tuf-fx505dt:~/ppa5/dailyflash$ ./a.out
Enter a character :D
letter D is in uppercase
ketan@ketan-tuf-fx505dt:~/ppa5/dailyflash$ ./a.out
Enter a character :d
letter d is in lowercase
ketan@ketan-tuf-fx505dt:~/ppa5/dailyflash$ ./a.out
Enter a character :g
letter g is in lowercase
ketan@ketan-tuf-fx505dt:~/ppa5/dailyflash$
*/

/*
void main(){ PROGRAM 4

	int i , j;

	for(i=1; i<=4 ;i++) {

		for(j=1 ;j<=4 ;j++) {

			printf(" %d ",j);
		}

		printf("\n");
	}
}
O/p:
ketan@ketan-tuf-fx505dt:~/ppa5/dailyflash$ ./a.out
 1  2  3  4
 1  2  3  4
 1  2  3  4
 1  2  3  4
ketan@ketan-tuf-fx505dt:~/ppa5/dailyflash$
*/

/*
void main() { PROGRAM 5

	int x , y ,z,sum;

	printf("Enter angles in degrees :");
	scanf("%d%d%d",&x,&y,&z);

	sum = x + y +z;

	if(sum == 180)
		printf("The traingle with angles %d %d & %d is valid one \n",x,y,z);
	else
		printf("The traingle with angles %d %d & %d is invalid one  \n",x,y,z);
}

O/p:
ketan@ketan-tuf-fx505dt:~/ppa5/dailyflash$ cc aug19.c
ketan@ketan-tuf-fx505dt:~/ppa5/dailyflash$ ./a.out
Enter angles in degrees :30 60 70
The traingle with angles 30 60 & 70 is invalid one  
ketan@ketan-tuf-fx505dt:~/ppa5/dailyflash$ ./a.out
Enter angles in degrees :30 60 90
The traingle with angles 30 60 & 90 is valid one 
ketan@ketan-tuf-fx505dt:~/ppa5/dailyflash$ 
*/


/*
void main() { PROGRAM 2

	int x;
	printf("Enter a day number :");
	scanf("%d",&x);

	switch(x) {

		case 1: printf(" Monday \n");
			break;

		case 2: printf(" Tuesday \n");
			break;

		case 3: printf(" Wednesday \n");
			break;

		case 4: printf(" Thursday \n");
			break;

		case 5: printf(" Friday \n");
			break;

		case 6: printf(" Saturday \n");
			break;

		case 7: printf(" Sunday \n");
			break;

		default :printf("Wrong Choice , My friend \n");
			 break;
	
	}
}

O/p:
ketan@ketan-tuf-fx505dt:~/ppa5/dailyflash$ ./a.out
Enter a day number :4
 Thursday
ketan@ketan-tuf-fx505dt:~/ppa5/dailyflash$ ./a.out
Enter a day number :8
Wrong Choice , My friend
ketan@ketan-tuf-fx505dt:~/ppa5/dailyflash$
*/


/* PROGRAM 3
 *
 *
void main() {

        int x;
        printf("Enter a day number :");
        scanf("%d",&x);

        switch(x) {

                case 1: printf(" january has 31 days \n");
                        break;

                case 2: printf(" February has 28 (29 leap year )days \n");
                        break;

                case 3: printf(" March has 31  days\n");
                        break;

                case 4: printf(" April has 30 days \n");
                        break;

                case 5: printf(" May has 31 days\n");
                        break;

                case 6: printf(" June has 30  days \n");
                        break;

                case 7: printf(" July has 31 days\n");
                        break;

                case 8: printf(" August has 31 days\n");
                        break;

                case 9: printf(" September has 30 days\n");
                        break;

                case 10: printf("October has 31 days \n");
                        break;

                case 11: printf(" November has 30 days\n");
                        break;

                case 12: printf(" December has 31 days \n");
                        break;

                default :printf("Wrong Choice , My friend \n");
                         break;
        
        }
}

O/p:
ketan@ketan-tuf-fx505dt:~/ppa5/dailyflash$ ./a.out
Enter a day number :4
 April has 30 days
ketan@ketan-tuf-fx505dt:~/ppa5/dailyflash$ ./a.out
Enter a day number :6
 June has 30  days
ketan@ketan-tuf-fx505dt:~/ppa5/dailyflash$
*/
