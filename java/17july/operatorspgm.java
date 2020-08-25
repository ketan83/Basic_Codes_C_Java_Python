/*

class AssignmentOpDemo {

	public static void main(String[] args) {

		int age =26;
			System.out.println("My Age is "+age);
	}


}
*/
/*
	class  ArithmaticDemo {

		public static void main(String[] args) {
				int n1 =40;
				int n2 =20;
				int ans=0;
				ans = n1 +n2;
				System.out.println("Answer = "+ans);

				ans = n1-n2;
				System.out.println("Answer = "+ans);
			
				ans = n1 * n2;
				System.out.println("Answer = "+ans);

				ans = n1 /n2;
				System.out.println("Answer = "+ans);

				ans = n1%n2;
				System.out.println("Answer = "+ans);
		}

	}

	*/
/*
class UnaryDemo {

	public static void main(String[] args) {
	
		int num =10;
		boolean val = true;
		System.out.println(+num);    //10
		System.out.println(-num);    //-10
		System.out.println(++num);    //11
		System.out.println(--num);    //10
//		System.out.println(!num);    // operatorspgm.java:49: error: bad operand type int for unary operator '!', yala ithe boolean variable pahijen
		System.out.println(!val);   // false   


	}

}

*/

	class PrePostDemo {

		public static void main(String[] args) {
		
			int num =10;
			int ans =0 ;
			ans = ++num;     //++num ->  num = num + 1 , pre-increment
			System.out.println(ans);   //11
			System.out.println(num); //11

			ans = num++;                  // post-increment
			System.out.println(ans); //11   
			System.out.println(num); //12

			ans = --num;     //--num ->  num = num - 1 , pre-decrement
			System.out.println(ans);   //11
			System.out.println(num); //11

			ans = num--;                  // post-decrement
			System.out.println(ans); //11   
			System.out.println(num); //10

		//	ans = ++num + ++num;    //23 in java ,  24 in C
		//	ans = num++ + num++;    //21 in java ,  21 in C
		//	ans = --num + --num;    //17 in java , 16 in c
	//		ans = num-- + num--;    //19 in java , 19 in c
			System.out.println(ans); 
		}


	}
