#include<stdio.h>
void main() {

		int x;
		switch(x){

		case 5+5 : printf("10- case 5+5");
			   break;
		case 6+4 : printf("10- case 6+4");
			   break;
		case 10 : printf("10- case 10"); 
			   break;

			  	//here all the cases are matched so compiler will give a duplicate error
		}

}
