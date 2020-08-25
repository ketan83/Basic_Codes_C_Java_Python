#include<stdio.h>

void main()
{

	int num =10;
	int ans =0;

	//ans = ++num + ++num;  // output will be 24
//	ans = num++ + num++;    //output will be 21
	//ans = --num + --num;    //output will be 16
	 //	ans = num-- + num--;    //output will be 19
	printf("%d\n",ans); // 24,21 ,16,19
	printf("%d\n",num); //12 , 12 , 8 ,8  
}
