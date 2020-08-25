/*
#include<stdio.h>

void main() {

	int i , j, k;
	char ch='A';

	for(i =1;i<=5 ;i++) {

		for(k=4;k>=i;k--) {

			printf("  ");
		}

		for(j=1 ; j<=i*2-1; j++) {

			printf("%c ",ch);
		}
		ch++;
		printf("\n");
	}


}
O/p:

ketan@ketan-tuf-fx505dt:~/ppa5/dailyflash$ ./a.out
        A
      B B B
    C C C C C
  D D D D D D D
E E E E E E E E E
ketan@ketan-tuf-fx505dt:~/ppa5/dailyflash$

*/


/*
#include<stdio.h>

void main() {

        int i , j, k;

        for(i =1;i<=5 ;i++) {

        int x=1;
                for(k=4;k>=i;k--) {

                        printf("  ");
                }

                for(j=1 ; j<=i*2-1; j++) {

                        printf("%d ",x);
                x++;
                }
                printf("\n");
        }


}

O/p:

etan@ketan-tuf-fx505dt:~/ppa5/dailyflash$ ./a.out
        1
      1 2 3
    1 2 3 4 5
  1 2 3 4 5 6 7
1 2 3 4 5 6 7 8 9
ketan@ketan-tuf-fx505dt:~/ppa5/dailyflash$

*/

/*
#include<stdio.h>
void main() {

        int i , j, k;

        for(i =1;i<=4 ;i++) {

        int x=1;
	
                for(k=3;k>=i;k--) {

                        printf("  ");
			x++;
                }

                for(j=1 ; j<=i*2-1; j++) {

                        printf("%d ",x);
                x++;
                }
                printf("\n");
        }


}

ketan@ketan-tuf-fx505dt:~/ppa5/dailyflash$ ./a.out
      4
    3 4 5
  2 3 4 5 6
1 2 3 4 5 6 7
ketan@ketan-tuf-fx505dt:~/ppa5/dailyflash$
*/

/*
#include<stdio.h>
void main() {

        int i , j, k;

        for(i =1;i<=4 ;i++) {

        char x='A';

                for(k=3;k>=i;k--) {

                        printf("  ");
                        x++;
                }

                for(j=1 ; j<=i*2-1; j++) {

                        printf("%c ",x);
			if(j<i)
                		x++;
			else
				x--;
                }
                printf("\n");
        }


}

ketan@ketan-tuf-fx505dt:~/ppa5/dailyflash$ ./a.out
      D 
    C D C 
  B C D C B 
A B C D C B A 
ketan@ketan-tuf-fx505dt:~/ppa5/dailyflash$ 
*/


/*
#include<stdio.h>
void main() {

        int i , j, k,mult;

        for(i =1;i<=4 ;i++) {

        int  x= i;

                for(k=3;k>=i;k--) {

                        printf("  ");
                      //  x++;
                }

                for(j=1 ; j<=i*2-1; j++) {
			
		mult=1;
                        
                        if(j<i){
				mult = x*x*x;
                                x--;
			}
                        else{
				mult = x*x;
				x++;
			}

			if(mult<10)
				printf("%d  ",mult);
			else if(mult<100) 
				printf("%d ",mult);
			else
				printf("  %d ",mult);
                }
                printf("\n");
        }


}
ketan@ketan-tuf-fx505dt:~/ppa5/dailyflash$ cc 30july.c
ketan@ketan-tuf-fx505dt:~/ppa5/dailyflash$ ./a.out
      1
    8  1  4
  27 8  1  4  9
64 27 8  1  4  9  16
ketan@ketan-tuf-fx505dt:~/ppa5/dailyflash$


*/
