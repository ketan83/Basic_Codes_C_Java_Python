
class nested_for_demo1 {

	public static void main(String[] args) {
		
		int i , j;

		for ( i=1 ; i<=5 ;i++) {

			for (j =1 ; j<=5 ;j++) {

				System.out.print("#\t ");  // give print not println

			}

			System.out.println();
	}

		}
}
/*
ketan@ketan-tuf-fx505dt:~/java$ java nested_for_demo
#	 #	 #	 #	 #
#	 #	 #	 #	 #
#	 #	 #	 #	 #
#	 #	 #	 #	 #
#	 #	 #	 #	 #
*/



class nested_for_demo2
{

        public static void main(String[] args) {

                int i , j;

                for ( i=1 ; i<=5 ;i++) {

                        for (j =1 ; j<=5 ;j++) {

                                if(i == 5) {

					System.out.print("= \t");
				}else {
					System.out.print("* \t");
					}
                        }

                        System.out.println();
        }

                }
}

class nested_for_demo3
{

        public static void main(String[] args) {

                int i , j ,x=1;

                for ( i=1 ; i<=5 ;i++) {

                        for (j =1 ; j<=5 ;j++) {


                               System.out.print(x +"\t");
			       x++;
                        }

                        System.out.println();
        }

                }
}


