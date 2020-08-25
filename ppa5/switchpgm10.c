#include<stdio.h>

void main(){

	char ch;

	int x=10;
	int y=20;
	printf("Enter value in ch :");
	scanf("%c",&ch);
	switch(ch){

	case'+': printf("%d\n",x+y);
		 break;
	case'-': printf("%d\n",x-y);
		 break;
	case'*': printf("%d\n",x*y);
		 break;
	case'/': printf("%d\n",x/y);
		 break;

	default:printf("None of it will get printed");
		break;

	}
	printf("Out of switch");




}
