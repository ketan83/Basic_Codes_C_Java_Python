#include<stdio.h>

void main() {

/*
	int i , j , k;
	

	 for(i =1 ;i<=4;i++){

		for(k=4;k>=i;k--) {

			printf("  ");
		}
		for(j=1;j<=i;j++) {

			printf("* ");
		
			}
			printf("\n");



		}


Output:
	ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
        *
      * *
    * * *
  * * * *
ketan@ketan-tuf-fx505dt:~/ppa5$ vim space_pattern_pgm.c
*/

	/*
		int i , j , k;
        char ch = 'D';

         for(i =1 ;i<=4;i++){

                for(k=4;k>=i;k--) {

                        printf("  ");
                }
                for(j=1;j<=i;j++) {

                        printf("%c ",ch);
                
                        }
			ch--;
                        printf("\n");



                }

Output :

	 ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
        D
      C C
    B B B
  A A A A
*/            

	/*
			 int i , j , k,x;
       char ch = 'D';

         for(i =1 ;i<=4;i++){
             x=1;
		 
                for(k=3;k>=i;k--) {

                        printf("  ");
                }
		
                for(j=1;j<=i;j++) {

                        printf("%d ",x);
                	x = x +1;
                        }
                        
                        printf("\n");



                }



Output :
	 ketan@ketan-tuf-fx505dt:~/ppa5$ cc space_pattern_pgm.c
ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
        1
      1 2
    1 2 3
  1 2 3 4
ketan@ketan-tuf-fx505dt:~/ppa5$
*/

	/*
	    int i , j , k,x;
       char ch ;

         for(i =1 ;i<=4;i++){
             ch = 'A';

                for(k=4;k>=i;k--) {

                        printf("  ");
                }

                for(j=1;j<=i;j++) {

                        printf("%c ",ch);
                        ++ch;
                        }

                        printf("\n");

		 }

Output :
	 ketan@ketan-tuf-fx505dt:~/ppa5$ cc space_pattern_pgm.c
ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
        A
      A B
    A B C
  A B C D
ketan@ketan-tuf-fx505dt:~/ppa5$
*/

	/*
		int i , j , k,x;
       char ch ;

         for(i =1 ;i<=4;i++){
             ch = 'D';

                for(k=4;k>=i;k--) {

                        printf("  ");
                }

                for(j=1;j<=i;j++) {

                        printf("%c ",ch);
                        ch--;
                        }

                        printf("\n");

                 }

Output :
	 ketan@ketan-tuf-fx505dt:~/ppa5$ cc space_pattern_pgm.c
ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
        D
      D C
    D C B
  D C B A
ketan@ketan-tuf-fx505dt:~/ppa5$ vim space_pattern_pgm.c
*/

	/*
	 int i , j , k,x;
       char ch ;

         for(i =1 ;i<=4;i++){
             ch = 'A';
       
                for(k=3;k>=i;k--) {

                        printf("  ");
			ch++;
                }
		

                for(j=1;j<=i;j++) {

                printf("%c ",ch);
                        ch++;
                        }

                        printf("\n");

                 }


Output:
	 ketan@ketan-tuf-fx505dt:~/ppa5$ cc space_pattern_pgm.c
ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
      D
    C D
  B C D
A B C D
*/

}
