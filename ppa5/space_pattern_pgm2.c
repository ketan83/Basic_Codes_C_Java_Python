#include<stdio.h>

void main(){

	/*
	int i ,j,k;
	for(i=5;i>=1;i--) {

		for(k=4;k>=i;k--){
			printf("  ");
		}

		for(j=1;j<=i;j++){
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
	int i,j,k;
	char c = 'A';

	for (i=5;i>=1;i--) {

	 c = 'A';
		for(k=4;k>=i;k--){
			printf("  ");
		}
		for(j=1;j<=i;j++){
			printf("%c ",c);
			c++;
		}
		printf("\n");
	}
	

O/p:
A B C D E
  A B C D
    A B C
      A B
        A

*/

	/*
 int i,j,k;
        int x = 1;

        for (i=4;i>=1;i--) {

         
                for(k=4;k>=i;k--){
                        printf("  ");
                }
		
                for(j=1;j<=i;j++){
                        printf(" %d",x*x);
                        x++;
                }
                printf("\n");
        }
	O/P:
		ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
   1 4 9 16
     25 36 49
       64 81
         100
*/
	/*
	int x=1;
 for(int i =1;i<=4;i++) {
	 for(int k=1;k<i;k++) {
		 printf("   ");
	 }

	 for(int j=4;j>=i ;j--) {
		 printf(" %d",x*x);
		 x++;
	 }
	 printf("\n");
 }

 O/p:
	 ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
 1 4 9 16
  25 36 49
   64 81
    100
*/
}
