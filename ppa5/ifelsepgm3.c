#include<stdio.h>

void main() {

int marks;
int compMarks;

 printf("Enter the no. marks in percentage you got = ");
 scanf("%d",&marks);
 printf("Enter the no. compMarks in percentage you got = ");
 scanf("%d",&compMarks);


if  ( marks> 70) {

        printf("FC / Modern College\n");
        if(compMarks > 80)
                printf("FC - BCS");
else
        printf("Modern- BSC\n");
        }
else{

        printf("Became a Sportsman\n");

}


printf("Program Completed");

}

