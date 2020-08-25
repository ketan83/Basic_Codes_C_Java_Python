// ALL IMPORTANT SORTING ALGORITHMS


#include<stdio.h>

void main() {

	int  a[10] ,n;

	printf("Enter no. of  elements in the array \n");

	scanf("%d",&n);

		
		int i;
		for(i=0 ; i<=n ;i++) {

			scanf("%d",&a[i]);
		}
	



                int j;
                for(j=0 ; j<=n ;j++) {

                        printf("%d\t",a[j]);
                }
	



	for(i=0 ; i<n-1 ; i++ ) {

		for (j=0 ; j<n-1-i ;j++) {

			if (a[j] > a[j+1] ) {

				int t;
				t = a[j];
				a[j] = a[j+1] ;
				a[j+1] = t;
			}

			printf(" %d \t  ",a[j]);
		}
	}

	printf("\n");
}


