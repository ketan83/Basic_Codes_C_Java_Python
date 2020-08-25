#include<stdio.h>

void main() {
int  a=3;
switch(a) {            //condition lihine mandatory ahe

	case 1 : printf("one\n");  //zari cases nhi lihila tari pan error yet nhi
		break;		           // break ha ek jump stmt ahe ani za nhi lihila tar jya particular case madhe ahet tya nantar all cases che sagle statements execute hoil.

	case 2: printf("two\n");
		break;

	printf("inside Switch"); //zar fakt switch madhe print statement lihila without case tar te kadhich execute honar nhi ......!!!!!!
}

	printf("outside Switch\n");	
}
