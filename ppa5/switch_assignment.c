#include<stdio.h>
void main() {

/*  Que. 1 : 
 *
	int a = 20;
	switch(~a) {
	case 20:
	printf("Case 20\n");
	printf("a= %d\n",a);
	break;
	case -20:
	printf("Case -20\n");
	printf("a= %d\n",a);
	break;
	case -21:
	printf("case -21\n");
	printf("a= %d\n",a);
	break;
	default:
		printf("Default\n");
		break;
}

Output :
ketan@ketan-tuf-fx505dt:~/ppa5$ vim switch_assignment.c
ketan@ketan-tuf-fx505dt:~/ppa5$ cc switch_assignment.c
ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
case -21
a= 20

   */

/* Que .2

		int x = 10;
int y = 20;
switch(x) {
case 10:                      // it should be case 10 not case x
printf("Case 10\n");
printf("x= %d\n",x);
	break;
case 20:
printf("Case 20\n");          // case 20  not case y
printf("y= %d\n",y);
	break;
default:
printf("Default\n");
   	break;
  }

output :
ketan@ketan-tuf-fx505dt:~/ppa5$ cc switch_assignment.c
ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
Case 10
x= 10

 */

/*  Que 3
 *
		float a = 5.2;
	switch((int)a){
	case 1:
	printf("one\n");
	break;
	case 5:				// switch does not accept float no.s so it will consider only integers and characters		
	printf("five\n");
	break;
	case 2:
	printf("two\n");
	break;
	default:
	printf("else\n");
	break;
}
         
     ketan@ketan-tuf-fx505dt:~/ppa5$ vim switch_assignment.c
ketan@ketan-tuf-fx505dt:~/ppa5$ cc switch_assignment.c
ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
five

	*/

/*

int x = 2;
switch(x << (x + 1)) {                // Here inside switch condition it is not getting matched with any of the cases so it will print the default one''s

default:printf("\ndefault");         
case 1:
printf("\n1");
break;
case 2:
printf("\n2");
break;
case 3:
printf("\n3");
break;
case 4:
printf("\n4");
break;
case 8:
printf("\n8");
break;
}


Output :
ketan@ketan-tuf-fx505dt:~/ppa5$ vim switch_assignment.c
ketan@ketan-tuf-fx505dt:~/ppa5$ cc switch_assignment.c
ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out

default
*/
/*  Que .5
	int a;
	switch(a = (sizeof(int) > -1)){      // in switch conditionn satisfies i.e true so it will print statements of case 1
	case 1: printf("True\n");
	break;
	case 0: printf("False\n");
	break;
}
//return 0;
 * In the line above it will give error as switch_assignment.c: In function ‘main’:
switch_assignment.c:124:8: warning: ‘return’ with a value, in function returning void
 return 0;
        ^
switch_assignment.c:2:6: note: declared here
 void main() {
      ^~~
      
Output :ketan@ketan-tuf-fx505dt:~/ppa5$ cc switch_assignment.c
ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
False

      */

/* Que .6
	int a=5, b=3;
switch(a) {
case 1:
printf("One\n");
case 5:
printf("Two.\n");
case 3:                      //here compiler will give error as switch_assignment.c:145:1: error: case label does not reduce to an integer constant case b so it should be case 3

	printf("Three.\n");
case 'a':
printf("Four.\n");
default:
printf("Default.\n");
}

	Output: 
	ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
Two.
Three.
Four.
Default.
 Here it wll print statements from all the cases because from 1st to last case there is no ' break '
  */

/* Que. 9

                    int  a ;
		    printf("ENter the month no. ");
		    scanf("%d",&a);
        switch(a){
        case 1:
        printf("January has 31 days\n");
        break;
        case 2:                                
        printf("February has 29 days in 2020\n");
        break;
        case 3:
        printf("March has 31 days\n");
        break;
        case 4:
        printf("April has 30 days \n");
        break;
        case 5:
        printf("May has 31 days\n");
        break;
        case 6:
        printf("June has 30 days\n");
        break;
        case 7:
        printf("July has 31 days \n");
        break;
        case 8:
        printf("August has 31 days\n");
        break;
        case 9:
        printf("September has 30\n");
        break;
}
 Output :

 ketan@ketan-tuf-fx505dt:~/ppa5$ cc switch_assignment.c
ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
ENter the month no. 7
July has 31 days
ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
ENter the month no. 6
June has 30 days

*/

/* Question.8
	int a;
  printf("ENter your choice : ");
                    scanf("%d",&a);
	switch((int)a){
        case 1:
        printf("one\n");
        break;
        case 2:                                
        printf("two\n");
        break;
        case 3:
        printf("three\n");
        break;
        case 4:
        printf("four\n");
        break;
        case 5:
        printf("five\n");
        break;
        default:
        printf("Number is greater than 5\n");
        break;
}
}

 	Output:
	ketan@ketan-tuf-fx505dt:~/ppa5$ vim switch_assignment.c
ketan@ketan-tuf-fx505dt:~/ppa5$ cc switch_assignment.c
ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
ENter your choice : 4
four
ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
ENter your choice : 6
Number is greater than 5
ketan@ketan-tuf-fx505dt:~/ppa5$ 
*/

 /* Ques 10 :		
  int x,y,z,a;
  printf("Enter values in x and y : ");
  scanf("%d%d",&x,&y);
  z  = x * y;
  printf("Multiplication of x & y values is %d\n",z); 
  printf("ENter your choice :");
  scanf("%d",&a);
  switch(a) {
	case 1 : if(z%2==0) {
			 printf("%d is an even number\n",z);
		 } else {
				 printf("%d is an odd number\n",z);
			}
		 break;
	case 2 : printf("Sorry negative no.s are not allowed \n");
		 break;
  }
	Output:
	ketan@ketan-tuf-fx505dt:~/ppa5$ cc switch_assignment.c
ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
Enter values in x and y : 4 3
Multiplication of x & y values is 12
ENter your choice :1
12 is an even number
ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
Enter values in x and y : 3 9
Multiplication of x & y values is 27
ENter your choice :1
27 is an odd number
ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
Enter values in x and y : -4 3
Multiplication of x & y values is -12
ENter your choice :2
Sorry negative no.s are not allowed

   */

/* Question 7 program
	int a,b,c,d,e,f,z,x =1 , z1  ,l =20;
  printf("Enter marks obtained in subjects eng sci maths ss hindi ");
  scanf("%d%d%d%d%d",&a,&b,&c,&d,&e);
  z  = a+b+c+d+e;
  z1 = z/5;
  printf("Average of all the marks is %d\n ",z1);
  printf("Addition of Marks of all subjects are %d \n",z);
  printf("Passing marks in each subject out of 50 is %d \n",l);
  if ( (a > l) & (b > l) & (c > l) & ( d > l) & (e >  l)) {
	  printf("Choice = %d\n" , x);
  }else {
	  printf("Choice = %d\n" , ++x);
  }
//  printf("Enter you choice :");
 // scanf("%d",&x);
  switch(x){
                  

	case 1 : printf("THis student has passed in all  the subjects\n ");
		   	break;

	case 2 : printf("THis student has not  passed in all the subjects\n ");
		   	break;

  }

}
O/p :
ketan@ketan-tuf-fx505dt:~/ppa5$ cc switch_assignment.c
ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
Enter marks obtained in subjects eng sci maths ss hindi 25 27 30 31 43
Average of all the marks is 31
 Addition of Marks of all subjects are 156
Passing marks in each subject out of 50 is 20
Choice = 1
THis student has passed in all  the subjects
 ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
Enter marks obtained in subjects eng sci maths ss hindi 12 31 34 50 24
Average of all the marks is 30
 Addition of Marks of all subjects are 151
Passing marks in each subject out of 50 is 20
Choice = 2
THis student has not  passed in all the subjects
 ketan@ketan-tuf-fx505dt:~/ppa5$

*/



