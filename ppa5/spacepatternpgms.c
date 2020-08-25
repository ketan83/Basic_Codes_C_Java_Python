#include<stdio.h>

void main() {

	/*
	int i , j , k;
	int x;

	for ( i =1; i<=4 ; i++) {
		x =1;

		for( j = 3;j>=i; j--) {

			printf("   ");
			x++;
		}

		for(k=1 ; k<=i*2-1;k++) {


			printf(" %d ",x);
			x++;
		}
		printf("\n");
	}
}
O/p :


    	  4
       3  4  5
    2  3  4  5  6
 1  2  3  4  5  6  7

 */

int i , j ,k,x;

	for (i=1;i<=4;i++) {

		for(j=3;j>=i;j--) {

			printf("   ");
			x++;
		}

		//for(k=1 ; k<=i*2-1 ;k++) {
		for(k=1;k<=i*2-1;k++) {
	x=1;
		
			printf(" %d ",x);
			x++;

		}
		printf("\n");
	}
}
