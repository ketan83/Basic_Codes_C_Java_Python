#include<stdio.h>
void main() {
	
		char ch;
		printf("ENter value in ch :");
		scanf("%c",&ch);
		switch(ch) {

		case '<':{
				 int a=5;
				 int b=0;
				 switch(a&&b){


					 case 0: printf("False\n");
						 break;
					 case 1: printf("true\n");
						 break;
					// case 0: printf("False");
						// break;
				 }

		printf("Out of switch 1\n");
			 }
			 break;
		case '>':{
				 int p=5;
				 int q=0;
				 switch(p||q){


					 case 0: printf("False\n");
						 break;
					 case 1: printf("True\n");
						 break;
				 }

		printf("Out of switch 2\n");
			 }

			 break;




		}
	printf("Out of main switch");


}
