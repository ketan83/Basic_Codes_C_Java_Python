#include <stdio.h>


/*    -------------------------------------------------------  BUBBLE SORTING PROGRAM -----------------------------------------------------

	void bubble(int a[] , int size) {

		int i , j , t;

		for(i=0 ; i<size-1 ; i++) {

			for(j=0 ; j<size-i-1 ; j++) {

				if(a[j] > a[j+1]) {

					t  =a[j] ;
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}


	}

	O/p:
	ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
	Sorted Array in Ascending Order:
	-1  2  5  6  7  9
	*/


/*	---------------------------------------------------  SELECTION SORTING PROGRAM -------------------------------------------------------

   void selection(int a[] , int n) {

		int i , j ,t;

		for(i=0 ; i<n-1 ; i++) {

			for (j=i+1 ; j<n ; j++) {

				if(a[i]>a[j]) {

					t = a[i] ;
					a[i] = a[j] ;
					a[j] = t;

				}
			}
		}
	}

	O/p:
	ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
	Sorted Array in Ascending Order:
	-1  2  5  6  7  9
*/


/*
	void insertion(int a[] , int n) {

		int i , j ,t;

		for(i=1 ; i<n ; i++) {

			j = i-1;
			t=a[i] ;

			while(j>=0 && t<a[j]) {

				a[j+1] = a[j];
				j--;
			}

			a[j+1] = t;
		}
	}

	O/p:
	ketan@ketan-tuf-fx505dt:~/ppa5$ ./a.out
Sorted Array in Ascending Order:
-1  2  5  6  7  9
*/


		// function to print the array

	void printArray(int array[], int size) {

  			for (int i = 0; i < size; ++i) {
    			printf("%d  ", array[i]);
  
			}
  		printf("\n");
	}

	// driver code
	int main() {
  		
		int data[] = {9 , 6 , -1 , 7,2,5};

  //int size = sizeof(data) / sizeof(data[0]);

  		int size=6;
 // bubble(data, size);
		
 // selection(data , size);
 
		insertion(data ,size);

		printf("Sorted Array in Ascending Order:\n");
  		printArray(data, size);
	}









