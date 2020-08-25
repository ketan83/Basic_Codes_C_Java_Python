#include<stdio.h>

void main() {

/*	
	int i,j;
	char c = 'A';
	i=0;                                     // outer loop initialization

	while(i<=4) {                             // outer loop condition

		j=4;                              // outer loop initialization
		while(j>=i) {                     // inner loop condition  
			
			printf(" %c ",c);
			c++;                     // character to be incremented by 1
			j--;                     // inner loop decrement     
		}
		      printf("\n");
			i++;                     // outer loop increment
	}


O/p:

	ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
 A  B  C  D  E
 F  G  H  I
 J  K  L
 M  N
 O

*/

	/*
		int outer =1;
		
		int count = 1;	 
                                            
                 char ch = 'A';

        while(outer<=5)
       	{                            

                int inner=5;                              
                while(inner>=outer)
	        	{                       
			if(inner == 2||inner == 4){
                        
				
				printf("%d ",count);
		         } 
			else
		       
		{		
                                            
                        printf("%c ",ch);                      
                }
                    count++,   ch++;

		     inner--;
                                           
             }
			printf("\n");
			outer++;
	}



Output :
	A 2 C 4 E
F 7 H 9
J 11 L
M 14
O
*/

	 int outer =1;

                int count = 1;

                 char ch = 'A';
 
        while(outer<=5)                                // row ke liye
        {

                int inner=5;
                while(inner>=outer)         // column ke liye
                        {
                        if(outer == 1 || inner == 1){


                                printf(" * ");
                         }
                        else

                {

                        printf(" = ");
                }
                    count++,   ch++;

                     inner--;

             }
                        printf("\n");
                        outer++;
        }

}
