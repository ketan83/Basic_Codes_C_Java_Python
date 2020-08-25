
/*
#include<stdio.h>

void main() {

	int i , j ,rows =0,cols =0;
	printf("Enter no. of rows & columns ");
	scanf("%d%d",&rows,&cols);


	for( i=1; i<= rows ;i++) {
		for( j= 1; j<=cols ;j++) {

				printf(" A ");
		}
				printf("\n");
	}


}

Output :
ketan@ketan-tuf-fx505dt:~/ppa5$ cc nested_for_loop.c
ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
-1--1--1--1--1--1-
-1--1--1--1--1--1-
-1--1--1--1--1--1-
-1--1--1--1--1--1-
-1--1--1--1--1--1-
-1--1--1--1--1--1-


ketan@ketan-tuf-fx505dt:~/ppa5$ cc nested_for_loop.c
ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
Enter no. of rows & columns 5 5
 A  A  A  A  A
 A  A  A  A  A
 A  A  A  A  A
 A  A  A  A  A
 A  A  A  A  A

*
*/

/*
#include<stdio.h>

void main() {

        int i , j ,rows =5,cols =5, x ;
       // printf("Enter no. of rows & columns ");
        //scanf("%d%d",&rows,&cols);


        for( i=1; i<= rows ;i++) {
				
			        x = 1;
                for( j= 1; j<=cols ;j++) {
                                while(x <= 5 ) {

					printf("%d ",x);
					x = x +1;
						}
				
                }
                                printf("\n");
        }


}



Output :


ketan@ketan-tuf-fx505dt:~/ppa5$ vim nested_for_loop.c
ketan@ketan-tuf-fx505dt:~/ppa5$ cc nested_for_loop.c
ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
ketan@ketan-tuf-fx505dt:~/ppa5$

*/
/*
	#include<stdio.h>
         void main() {

	int i,j,k=0;

	for(i=1; i<=4 ;i++) {

		for(j=1;j<=i;j++){
			
			printf("* ");
			
		}
		printf("\n");
	}

}
*/
