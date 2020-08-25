
#include<stdio.h>

void main() {
/*
	int i , j , k;

	int count=1;

	for(i=1;i<=4;i++){
		
		for(k=1;k<=i;k++) {
			printf("  ");
		}

		for(j=4;j>=i;j--) {

			printf("  %d",count*count);
			count++;
		}
		printf("\n");
}

}
O/p:
ketan@ketan-tuf-fx505dt:~/java$ ./a.out
    1  4  9  16
      25  36  49
        64  81
          100
ketan@ketan-tuf-fx505dt:~/java$ vim spacepatternpgm3.c
*/

/*Pyramid Code :
int count=1;
int i,j,k;
        for(i=1;i<=4;i++){
                
                for(k=3;k>=i;k--) {
                        printf("  ");
                }

                for(j=1;j<=i*2-1;j++) {

                        printf(" *");
                        
                }
                printf("\n");
}
O/p:
ketan@ketan-tuf-fx505dt:~/java$ ./a.out
       *
     * * *
   * * * * *
 * * * * * * *
*/

/*
	int count=1;
int i,j,k;
        for(i=1;i<=4;i++){
			int x=1;                
                for(k=3;k>=i;k--) {
                        printf("  ");
                }

                for(j=1;j<=i*2-1;j++) {

                        printf(" %d",x);
			x++;
                        
                }
                printf("\n");
}

}

O/p:
ketan@ketan-tuf-fx505dt:~/java$ ./a.out
       1
     1 2 3
   1 2 3 4 5
 1 2 3 4 5 6 7
ketan@ketan-tuf-fx505dt:~/java$
*/

int count=1;
int i,j,k;
        for(i=1;i<=4;i++){
                        int x=1;
                for(k=3;k>=i;k--) {
                        printf("  ");
                }

                for(j=1;j<=i*2-1;j++) {

                   printf(" %d",x);
		   if(j==1 || j==2 || j==3 ||j==4) 
			   x++;
		   else
			   --x;
			}

                printf("\n");
                }
}



