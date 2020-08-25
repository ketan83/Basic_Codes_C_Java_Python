#include<stdio.h>
void main() {

	int i , j ,r1,c1 ,r2 ,c2 ,r3 ,c3,r4 ,c4,r5, c5 ;
	char a[20][20] ;

//	printf("Enter number of rows & columns: ");
//	scanf("%d%d",&r1,&c1);


	printf("Enter elements of matrix : \n");

	for(i=0 ; i<4 ; i++) {
		
		for(j=0;j<4;j++) {

			scanf("%c",&a[i][j]);
		}
	}

	printf("Elements of the matrix are : \n");

	for(i=0 ; i<4 ; i++) {

                for(j=0;j<4 ; j++) {

                        printf(" %c ",a[i][j]);
                }
		printf("\n");
        }

}

