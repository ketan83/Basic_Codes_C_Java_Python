#include<stdio.h>
void main() {

	int x,y,z,ch;
	 printf("Enter values in x & y");
	 scanf("%d %d",&x, &y);
	         	printf("*********MENU********");
			printf("1.Addition \n");
			printf("2.Subtraction \n");
			printf("3.Multiplication \n");
			printf("Out of if \n");
			printf("Enter your choice \n");
			scanf("%d",&ch);
	 switch(ch) {

	case 1 : z = x+y;
		 printf("Addition is %d\n",z);
			break; 
	case 2: z = x-y;
		 printf("Subtraction is %d\n",z);
			break; 
	case 3 : z = x*y;
		 printf("Multiplication is %d\n",z);
			break; 
	case 4: z = x/y;
		 printf("Division is %d\n",z);
			break; 
	 }

}
