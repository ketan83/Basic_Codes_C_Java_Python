#include<stdio.h>

void main(){

	int a;
	printf("Enter value of a");
	scanf("%d\n",&a);
	switch(a){

	case 9: { int x=20;
			       int y=20;
		       printf("%d\n",x+y);
		       }
			break;

	case 10: { int x=30;
			       int y=30;
		       printf("%d\n",x-y);
			break;

	default:printf("None of it will get printed");
		break;

	}
	printf("Out of switch");



}
}
