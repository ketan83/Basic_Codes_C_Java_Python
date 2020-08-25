#include<stdio.h>

void main() {

int marks;
int compMarks;

 printf("Enter the no. marks in percentage you got = ");
 scanf("%d",&marks);
// printf("Enter the no. compMarks in percentage you got = ");
// scanf("%d",&compMarks);


if(marks> 80) {
  printf("FC\n");

}else if(marks > 80 && marks <90){
                printf("Modern");
} else if(marks > 60 && marks <70){
    printf("Garware\n");
	}

 else{

printf("jayKranti");

}
}

