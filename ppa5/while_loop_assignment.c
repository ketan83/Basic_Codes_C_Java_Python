 #include<stdio.h>
int main() {
/* Que.1 program to print the sum of all even numbers and multiplication of odd
   numbers between 1 to n. 
	int sum =0;
	int mult=1;
	int startNum1=1;
	int startNum2=1;
	int endNum;
	printf("ENter the ending number :");
	scanf("%d",&endNum);
	while(startNum1<=endNum) {

		if(startNum1%2==0) {
			sum =sum + startNum1;
		}
			startNum1++;
	}
			printf("Sum of even numbers from 1 to ending number is %d\n",sum);
		

		 while(startNum2<=endNum) {

              
                        if(startNum2%2==1){
                                mult=mult * startNum2;
                                }
                        startNum2++;
                        
        }

                        printf("Multiplication of odd numbers from 1 to ending number is %d\n",mult);


Output :
			ketan@ketan-tuf-fx505dt:~/ppa5$ cc while_loop_assignment.c
ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
ENter the ending number :10
Sum of even numbers from 1 to ending number is 30
Multiplication of odd numbers from 1 to ending number is 945
ketan@ketan-tuf-fx505dt:~/ppa5$

 */

/*   program to print the count of even numbers which are divisible by 5 from 1 to 50


	int i=1;
	while(i<=50) {

	if(i%5==0 && i%2==0) {

		
                           
			printf("%d\t",i);

		}

		i++;
	}

Output :
	ketan@ketan-tuf-fx505dt:~/ppa5$ cc while_loop_assignment.c
ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
10	20	30	40	50	ketan@ketan-tuf-fx505dt:~/ppa5$
*/

/*  program to take input from user and print sum of all natural numbers from 1 to
upto that number
 *
	int sum =0;
	int  i=1;
	int n;
	printf("Enter the ending number :");
	scanf("%d",&n);
	while(i<=n) {
		
		sum = sum + i;
		i++;
	}
	printf("Sum of the natural no.s from  1 to %d is %d \n",n,sum);
		

Output :
	ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
Enter the ending number :10
Sum of the natural no.s from  1 to 10 is 55

*/

/*a program, that prints square of odd numbers and cube of even numbers. 
 *
	int square ;
        int cube;
        int startNum1=1;
        int startNum2=1;
        int endNum;
        printf("ENter the ending number :");
        scanf("%d",&endNum);
        while(startNum1<=endNum) {

                if(startNum1%2==0) {
                        cube = startNum1 * startNum1 *startNum1;
                        printf("Cube of even number %d is %d\n",startNum1,cube);
                }
                        startNum1++;
        }
                

                 while(startNum2<=endNum) {

              
                        if(startNum2%2==1){
                                square= startNum2 * startNum2;
                        printf("Square of odd number %d is %d\n",startNum2,square);
                                }
                        startNum2++;
                        
        }

	Output :
		 ketan@ketan-tuf-fx505dt:~/ppa5$ cc while_loop_assignment.c
ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
ENter the ending number :10
Cube of even number 2 is 8
Cube of even number 4 is 64
Cube of even number 6 is 216
Cube of even number 8 is 512
Cube of even number 10 is 1000
Square of odd number 1 is 1
Square of odd number 3 is 9
Square of odd number 5 is 25
Square of odd number 7 is 49
Square of odd number 9 is 81
*/

/* program to print the countdown of days to submit the assignment
 *
	int i;
	printf("Enter number of days to complete the assignment :");
	scanf("%d",&i);
	while(i>0) {

		printf("%d days remaining \n",i);
		i--;
	}
		printf("%d days Assignment is overdue ",i);
Output:
ketan@ketan-tuf-fx505dt:~/ppa5$ cc while_loop_assignment.c
ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
Enter number of days to complete the assignment :7
7 days remaining
6 days remaining
5 days remaining
4 days remaining
3 days remaining
2 days remaining
1 days remaining
0 days Assignment is overdue  ketan@ketan-tuf-fx505dt:~/ppa5$


		*/
/*
		int odd_no_diff;
        
        int startNum1=1;
        int startNum2=1;
        int endNum1;
        printf("ENter the ending number :");
        scanf("%d",&endNum1);
        int endNum2;
       // printf("ENter the ending number :");
       // scanf("%d",&endNum2);
        while(endNum1>=startNum1) {

                if(endNum1%2==1) {
			printf("%d\t",endNum1);
                }else {
			printf("%d is an even  number \n ",endNum1);
		}

                        endNum1--;
                        
        }
                /*

                 while(endNum2>=startNum2) {

              
                        if(endNum2%2==1){
                                
					endNum2 = endNum2 - 1;
					
                                }
                        endNum2--;
			printf("%d\t",endNum2);
                        
        }
*/
	/* C program for coversion of fahrenheit to celsius degree

	float f =1;
	float i =0;
	while ( i<101) {

	printf("%.2f fahrenheit  = ",i);
	f = (i-32)*5/9;

	printf("%.2f  celsius\n",f);
         i++;
	
	}

}

Output :
ketan@ketan-tuf-fx505dt:~/ppa5$ vim while_loop_assignment.c
ketan@ketan-tuf-fx505dt:~/ppa5$ cc while_loop_assignment.c
ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
0.00 fahrenheit  = -17.78  celsius
1.00 fahrenheit  = -17.22  celsius
2.00 fahrenheit  = -16.67  celsius
3.00 fahrenheit  = -16.11  celsius
4.00 fahrenheit  = -15.56  celsius
5.00 fahrenheit  = -15.00  celsius
6.00 fahrenheit  = -14.44  celsius
7.00 fahrenheit  = -13.89  celsius
8.00 fahrenheit  = -13.33  celsius
9.00 fahrenheit  = -12.78  celsius
10.00 fahrenheit  = -12.22  celsius
11.00 fahrenheit  = -11.67  celsius
12.00 fahrenheit  = -11.11  celsius
13.00 fahrenheit  = -10.56  celsius
14.00 fahrenheit  = -10.00  celsius
15.00 fahrenheit  = -9.44  celsius
16.00 fahrenheit  = -8.89  celsius
17.00 fahrenheit  = -8.33  celsius
18.00 fahrenheit  = -7.78  celsius
19.00 fahrenheit  = -7.22  celsius
20.00 fahrenheit  = -6.67  celsius
21.00 fahrenheit  = -6.11  celsius
22.00 fahrenheit  = -5.56  celsius
23.00 fahrenheit  = -5.00  celsius
24.00 fahrenheit  = -4.44  celsius
25.00 fahrenheit  = -3.89  celsius
26.00 fahrenheit  = -3.33  celsius
27.00 fahrenheit  = -2.78  celsius
28.00 fahrenheit  = -2.22  celsius
29.00 fahrenheit  = -1.67  celsius
30.00 fahrenheit  = -1.11  celsius
31.00 fahrenheit  = -0.56  celsius
32.00 fahrenheit  = 0.00  celsius
33.00 fahrenheit  = 0.56  celsius
34.00 fahrenheit  = 1.11  celsius
35.00 fahrenheit  = 1.67  celsius
36.00 fahrenheit  = 2.22  celsius
37.00 fahrenheit  = 2.78  celsius
38.00 fahrenheit  = 3.33  celsius
39.00 fahrenheit  = 3.89  celsius
40.00 fahrenheit  = 4.44  celsius
41.00 fahrenheit  = 5.00  celsius
42.00 fahrenheit  = 5.56  celsius
43.00 fahrenheit  = 6.11  celsius
44.00 fahrenheit  = 6.67  celsius
45.00 fahrenheit  = 7.22  celsius
46.00 fahrenheit  = 7.78  celsius
47.00 fahrenheit  = 8.33  celsius
48.00 fahrenheit  = 8.89  celsius
49.00 fahrenheit  = 9.44  celsius
50.00 fahrenheit  = 10.00  celsius
51.00 fahrenheit  = 10.56  celsius
52.00 fahrenheit  = 11.11  celsius
53.00 fahrenheit  = 11.67  celsius
54.00 fahrenheit  = 12.22  celsius
55.00 fahrenheit  = 12.78  celsius
56.00 fahrenheit  = 13.33  celsius
57.00 fahrenheit  = 13.89  celsius
58.00 fahrenheit  = 14.44  celsius
59.00 fahrenheit  = 15.00  celsius
60.00 fahrenheit  = 15.56  celsius
61.00 fahrenheit  = 16.11  celsius
62.00 fahrenheit  = 16.67  celsius
63.00 fahrenheit  = 17.22  celsius
64.00 fahrenheit  = 17.78  celsius
65.00 fahrenheit  = 18.33  celsius
66.00 fahrenheit  = 18.89  celsius
67.00 fahrenheit  = 19.44  celsius
68.00 fahrenheit  = 20.00  celsius
69.00 fahrenheit  = 20.56  celsius
70.00 fahrenheit  = 21.11  celsius
71.00 fahrenheit  = 21.67  celsius
72.00 fahrenheit  = 22.22  celsius
73.00 fahrenheit  = 22.78  celsius
74.00 fahrenheit  = 23.33  celsius
75.00 fahrenheit  = 23.89  celsius
76.00 fahrenheit  = 24.44  celsius
77.00 fahrenheit  = 25.00  celsius
78.00 fahrenheit  = 25.56  celsius
79.00 fahrenheit  = 26.11  celsius
80.00 fahrenheit  = 26.67  celsius
81.00 fahrenheit  = 27.22  celsius
82.00 fahrenheit  = 27.78  celsius
83.00 fahrenheit  = 28.33  celsius
84.00 fahrenheit  = 28.89  celsius
85.00 fahrenheit  = 29.44  celsius
86.00 fahrenheit  = 30.00  celsius
87.00 fahrenheit  = 30.56  celsius
88.00 fahrenheit  = 31.11  celsius
89.00 fahrenheit  = 31.67  celsius
90.00 fahrenheit  = 32.22  celsius
91.00 fahrenheit  = 32.78  celsius
92.00 fahrenheit  = 33.33  celsius
93.00 fahrenheit  = 33.89  celsius
94.00 fahrenheit  = 34.44  celsius
95.00 fahrenheit  = 35.00  celsius
96.00 fahrenheit  = 35.56  celsius
97.00 fahrenheit  = 36.11  celsius
98.00 fahrenheit  = 36.67  celsius
99.00 fahrenheit  = 37.22  celsius
100.00 fahrenheit  = 37.78  celsius
ketan@ketan-tuf-fx505dt:~/ppa5$
*/
 
/* C program to count number of digits in  numbers
	int n, cnt =0;
	printf("Enter a number\n");
	scanf("%d",&n);

	while(n!=0) {

		n=n/10;
		cnt++;
	}

	printf("%d\n",cnt);
	}

Output:
ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
Enter a number
619
3
ketan@ketan-tuf-fx505dt:~/ppa5$
*/

/*  program to print the character is vowel or consonant from ‘A’ to ‘Z’.Take a
range of characters from user.
 *
	char u , l;
	printf("Lower bound of range :\n");
	scanf(" %c",&l);
	printf("Upper bound of range :\n");
	scanf(" %c",&u);

	while(l!=u) {

	if(l=='A' ||l=='E'|| l== 'I' ||l=='O' || l=='U'){
		printf("%c is vowel\n",l);
		printf("\n");
	l++;

	}else {

		printf("\n");
		printf("%c is consonant \n",l);
		printf("\n");
		l++;
	}
	}
		printf("\n");
	printf("%c is consonant \n",l);
	}

Output :
ketan@ketan-tuf-fx505dt:~/ppa5$ vim while_loop_assignment.c
ketan@ketan-tuf-fx505dt:~/ppa5$ cc while_loop_assignment.c
ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
Lower bound of range :
A
Upper bound of range :
Z
A is vowel


B is consonant


C is consonant


D is consonant

E is vowel


F is consonant


G is consonant


H is consonant

I is vowel


J is consonant


K is consonant


L is consonant


M is consonant


N is consonant

O is vowel


P is consonant


Q is consonant


R is consonant


S is consonant


T is consonant

U is vowel


V is consonant


W is consonant


X is consonant


Y is consonant


Z is consonant
ketan@ketan-tuf-fx505dt:~/ppa5$
*/

/*  program which take’s number from user’s if number is even print that number
in reverse order or if number is odd print that number in reverse order by difference two?
	int n;
	printf("ENter number :");
	scanf("%d",&n);

   	if(n%2==0) {

 		while(n!=0) {	
	 	printf("%d \t",n);
		n--;
		}
	}
		else {
			while (n!=-1){
				printf("%d \t",n);
				n=n-2;
			}
		}

}
Output:
ketan@ketan-tuf-fx505dt:~/ppa5$ cc while_loop_assignment.c
ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
ENter number :7
7 	5 	3 	1 	ketan@ketan-tuf-fx505dt:~/ppa5$ cc while_loop_as./a.out
ENter number :8
8 	7 	6 	5 	4 	3 	2 	1 	ketan@ketan-tuf-fx505dt:~/ppa5$
*/

/* C program to take input from user and check whether the number is Perfect
number or not. Using while loop.
  int n ,rem ,sum =0,i=0;
        printf("ENter number :");
        scanf("%d",&n);

		while(i<=(n-1)) {
			rem = n%i;
			if(rem ==0){
				sum = sum +i;

			}
			i++;
			}

			if(sum == n)
				printf("%d is a perfect number \n",n);
				else
				printf("%d is not  a perfect number \n",n);
				return 0;

				}
				*/
