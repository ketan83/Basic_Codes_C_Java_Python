#include<stdio.h>

void main() {
	int a=1;
	char ch = 'S';
	float f =20.5;

	switch(ch) {

	case 1 : printf("One\n");
		 break;

	case 'S' : printf("second one\n");
		   	break;
	case 20.5 : printf("third one\n");
		    break;
	}
	printf("Outside Switch\n");
}
