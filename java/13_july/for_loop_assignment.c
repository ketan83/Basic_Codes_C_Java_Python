#include<stdio.h>

void main() {

	/********************    Answer1 : ***************************** c program to print a table of 3 take input from user
  	
	int x ,y, i;
	printf("Enter the  number whose table is to be created :");
        scanf("%d",&x);

	for (i=1;i<=10;i++) {

	y = x * i;
	printf("3 * %d = %d\n ",i,y);

	}	


Output :
ketan@ketan-tuf-fx505dt:~/ppa5$ vim for_loop_assignment.c
ketan@ketan-tuf-fx505dt:~/ppa5$ cc for_loop_assignment.c
ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
Enter the  number whose table is to be created :3
3 * 1 = 3
 3 * 2 = 6
 3 * 3 = 9
 3 * 4 = 12
 3 * 5 = 15
 3 * 6 = 18
 3 * 7 = 21
 3 * 8 = 24
 3 * 9 = 27
 3 * 10 = 30
*/
  

/*      Answer 3 : c program to print even numbers between 50 to 70
	int i ;
 
       	for ( i=50; i<=70 ;i++) {
	
		if(i%2==0) {

			printf("even=%d\n",i);
		}
		
}

Output :
 ketan@ketan-tuf-fx505dt:~/ppa5$ cc for_loop_assignment.c
ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
even=50
even=52
even=54
even=56
even=58
even=60
even=62
even=64
even=66
even=68
even=70
ketan@ketan-tuf-fx505dt:~/ppa5$ 

*/

/*************************  Answer 7 :************************************** program to print multiples of 6 upto 60.
 *  
	 int x ,y, i;
        printf("Enter the  number whose table is to be created :");
        scanf("%d",&x);

        for (i=1;i<=10;i++) {

        y = x * i;
        printf("6 * %d = %d\n ",i,y);

        }

Output :
ketan@ketan-tuf-fx505dt:~/ppa5$ vim for_loop_assignment.c
ketan@ketan-tuf-fx505dt:~/ppa5$ cc for_loop_assignment.c
ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
Enter the  number whose table is to be created :6
6 * 1 = 6
 6 * 2 = 12
 6 * 3 = 18
 6 * 4 = 24
 6 * 5 = 30
 6 * 6 = 36
 6 * 7 = 42
 6 * 8 = 48
 6 * 9 = 54
 6 * 10 = 60

 */

/*   *************************Answer 8 :*************************** C program to print alphabets in reverse order between y to j
 
      char x ;
 
   printf("Alphabets printed in reverse order : \n");  
   for(x = 'y' ; x>='j' ; x--) {

    printf("%c\n",x);

	}
}

Output :
ketan@ketan-tuf-fx505dt:~/ppa5$ vim for_loop_assignment.c
ketan@ketan-tuf-fx505dt:~/ppa5$ cc for_loop_assignment.c
ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
Alphabets printed in reverse order :
y
x
w
v
u
t
s
r
q
p
o
n
m
l
k
j

  */

/* ************************* Answer 5: ************************** c program to print all the ASCII values of numbers 1 to 128
 *
	char ch1,ch2;
	printf("ASCII Values of Characters starting from  A to ending with Z is : \n ");  
	for(ch1 = 'A';ch1<='Z';ch1++) {

	printf("%d\n",ch1);
	}

	 printf("\n");
	 printf("\n");
	printf("ASCII Values of Characters starting from a  to ending with z is : \n");  

        for(ch2 = 'a';ch2<='z';ch2++) {

        printf("%d\n",ch2);
        }

Output:

ketan@ketan-tuf-fx505dt:~/ppa5$ vim for_loop_assignment.c
ketan@ketan-tuf-fx505dt:~/ppa5$ cc for_loop_assignment.c
ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
ASCII Values of Characters starting from  A to ending with Z is :
 65
66
67
68
69
70
71
72
73
74
75
76
77
78
79
80
81
82
83
84
85
86
87
88
89
90


ASCII Values of Characters starting from a  to ending with z is :
97
98
99
100
101
102
103
104
105
106
107
108
109
110
111
112
113
114
115
116
117
118
119
120
121
122
ketan@ketan-tuf-fx505dt:~/ppa5$

*/

/*************************** Answer 6 *************************** c program to print characters from A to Z in upper case and in lower case
 *
 int num1 = 65;//A
 int num2 = 97;//a

for(int i = 0; i <= 26; i++){
printf("%c = %c \n  ",num1,num2);
num1++;
num2++;
}

Output :
ketan@ketan-tuf-fx505dt:~/ppa5$ cc for_loop_assignment.c
ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
A = a
  B = b
  C = c
  D = d
  E = e
  F = f
  G = g
  H = h
  I = i
  J = j
  K = k
  L = l
  M = m
  N = n
  O = o
  P = p
  Q = q
  R = r
  S = s
  T = t
  U = u
  V = v
  W = w
  X = x
  Y = y
  Z = z
  [ = {
  ketan@ketan-tuf-fx505dt:~/ppa5$ vim for_loop_assignment.c

*/

/* ******************* Answer 9 ********************************* C pogram to  print all alternative numbers in reverse order from 30 to 16
 *  
  int x ,i;
  printf("ALternative numbers in reverse order between 15 to 30: \n ");
  for(i = 30 ;i>=16 ;i-=2) {

	  	printf("%d\n",i);
  }

  Output :

  ketan@ketan-tuf-fx505dt:~/ppa5$ vim for_loop_assignment.c
ketan@ketan-tuf-fx505dt:~/ppa5$ cc for_loop_assignment.c
ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
ALternative numbers in reverse order between 15 to 30:
 30
28
26
24
22
20
18
16

*/

/**************** Answer 2 :****************************  C program to print all odd  numbers between 20 to 40
   int i ;
 
        for ( i=20; i<=40 ;i++) {
        
                if(i%2==1) {

                        printf("odd=%d\n",i);
                }


 }

Output :
ketan@ketan-tuf-fx505dt:~/ppa5$ vim for_loop_assignment.c
ketan@ketan-tuf-fx505dt:~/ppa5$ cc for_loop_assignment.c
ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
odd=21
odd=23
odd=25
odd=27
odd=29
odd=31
odd=33
odd=35
odd=37
odd=39

*/
 
/* Que4.   C program to print all divisors of 50
  for( int i =1;i<=25;i++) {

	if(50%i==0)
		printf("%d\n", i);
  }

 Output:
ketan@ketan-tuf-fx505dt:~/ppa5$ vim for_loop_assignment.c
ketan@ketan-tuf-fx505dt:~/ppa5$ cc for_loop_assignment.c
ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
1
2
5
10
25
*/ 

/*  Que 10. C program to print all numbers which can divide to 65
  
  int n;
  printf("ENter a  number ");
  scanf("%d",&n);                   //65

  for(int i =1;i<=n;i++){

	if(n%i==0) {

		printf("%d\n",i);

  }
}
 Output :
 ketan@ketan-tuf-fx505dt:~/ppa5$ cc for_loop_assignment.c
ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
ENter a  number 65
1
5
13
65
 
 */

}
