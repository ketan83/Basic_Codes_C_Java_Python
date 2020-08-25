#include<stdio.h>

void main() {

	int a =20;
/*
	else{                              //error: ‘else’ without a previous ‘if’
		printf("Both are Same\n");
	}

	 else if{                         //error: expected ‘(’ before ‘{’ token
   
     
                printf("Both are Same\n");
        }
*/

	if(a==10) {
		printf("a is 10");
	}
	else(a>10){ //error: expected ‘;’ before ‘{’ token  else la kadi condition nasti                         


                printf("a is greater\n");
        }

}
