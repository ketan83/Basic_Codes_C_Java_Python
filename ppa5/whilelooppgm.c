#include<stdio.h>

void main() {

	/*
	int i=1;
	while(i<=100) {

	if(i%8 ==0) {
	printf("\n");
	printf("%d is divisible by 8\n",i);
	printf("\n");
	}
	else{
		printf("%d s not divisible by 8\n",i);
		}
	i++;

}
*/
 //	int i=1;
//	int num;
	
/*	for(i=0;i<=10;i++) {
	printf("enter an even number");
	scanf("%d",&num);
	if(num%2==0) {
		printf("even no = %d\n",num);
	}
	else
		break;

		}
			printf("After break comes out of loop \n");
		       */
/*
	while(i<=20) {
		printf("Enter number");
		scanf("%d",&num);

		if(num%4 ==0 && num%10 ==0)
			break;
		else
			printf("num =%d\n",num);
		i++;
	}
		printf("Out of While\n");
*/

/*
	int num =0;
	int rem = 0;
	int sum =0;
	printf("ENter the number :");
	scanf("%d",&num);
	while(num!=0) {

		rem = num %10;
		sum = sum + rem;
		num = num /10;

		}
		printf("sum =  %d\n",sum);

Output :
ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
ENter the number :123456
sum =  21
ketan@ketan-tuf-fx505dt:~/ppa5$
*
*/
/*
	int i=1;
	 while(i<=10)  {
	
	 	if(i%2==0){
	       		continue;
		}
		else{
			printf("%d\n",i);
		}
		i++;
	 }		
*/

	for(int i=1;i<=10;i++) {

		if(i%2==0){
			continue;
		}else {
			printf("%d\n",i);
		}
	}
}
