 #include<stdio.h>
         void main() {
/*
        int i,j,k=0;

        for(i=1; i<=4 ;i++) {

                for(j=1;j<=i;j++){

                        printf("* ");

                }
                printf("\n");
        }

Output :
*
* *
* * *
* * * *

*/


/*

        int i , j ,rows =5,cols =5, x ;
       // printf("Enter no. of rows & columns ");
        //scanf("%d%d",&rows,&cols);


        for( i=1; i<= rows ;i++) {

                                x = 1;
                for( j= 1; j<=i ;j++) {
                                
			printf("%d ",j);

                }
                                printf("\n");
        }


	O/p :
		ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/

		 /*
		 int i , j ,rows =5,cols =5, x ;
       // printf("Enter no. of rows & columns ");
        //scanf("%d%d",&rows,&cols);


        for( i=1; i<=5 ;i++) {

					
			for( j= 5; j>=i ;j--) {

                        printf("* ");

                }
                                printf("\n");
        }


	O/p:
		ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
* * * * *
* * * *
* * *
* *
*
*/

		 /*
		  int i , j ,rows =5,cols =5, x ;
       // printf("Enter no. of rows & columns ");
        //scanf("%d%d",&rows,&cols);


        for( i=1; i<=5 ;i++) {

			x=1;
                        for( j= 5; j>=i ;j--) {
			printf("%d ",j);
			}
		       
                                printf("\n");
	}
        

o/p:
     ketan@ketan-tuf-fx505dt:~/ppa5$ cc nested_for_loop2.c
ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
5 4 3 2 1 
5 4 3 2 
5 4 3 
5 4 
5 
*/

		 /*
		 	 int i , j ,rows =5,cols =5, x ;
       // printf("Enter no. of rows & columns ");
        //scanf("%d%d",&rows,&cols);


        for( i=1; i<=5 ;i++) {

                        x=1;
                        for( j= 5; j>=i ;j--) {
                        printf("%d ",x);
			x++;
                        }
                       
                                printf("\n");
        }

	o/p;
	ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
*/

		/* 
		  int i , j ,rows =5,cols =5, x ;
       // printf("Enter no. of rows & columns ");
        //scanf("%d%d",&rows,&cols);


        for( i=5; i>=1 ;i--) {

                        x=5;
                        for( j= 1; j<=i ;j++) {
                        printf("%d ",i*i);
                        
                        }
                      		 
                                printf("\n");
        }

	O/p:
		ketan@ketan-tuf-fx505dt:~/ppa5$ cc nested_for_loop2.c
ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
25 25 25 25 25
16 16 16 16
9 9 9
4 4
1
*/

}

