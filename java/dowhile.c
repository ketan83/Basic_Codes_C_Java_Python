#include<stdio.h>

void main() {

	int i =1 , x ,f, ch;


	do {

		printf("************************MENU************************* \n");
		printf("1.Print no.s which are even \n");
		printf("2.Print no.s in reverse order \n");
	//	printf("1.Print no.s which are even \n");
	//	printf("4..Print no.s which are even \n");
		printf("enter you choice \n");
			scanf("%d",&ch);

		switch(ch) {

		case 1:	while(i<=20){
			      if(i%2==0) {	
					printf("%d is even \n",i);
					}
			      i++;
			}
				break;
		case 2 : printf("Enter no. which you want to print in reverse order \n");
			 scanf("%d",&x);
			for(int j =x ; j>=1 ; j--) {
				printf("%d\t",j);
			}
				printf("\n");
				break;

		}
		
				printf("Do you wan to continue 1 for  YES  2 for NO \n");
				scanf("%d",&f);
	}while(f==1);

	printf("Out of While \n ");
}
