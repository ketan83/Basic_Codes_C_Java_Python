/* Program1 :
class daysOfWeek {

	public static void main(String[] args) {

		int x =3;

		switch(x) {

		case 1 : System.out.println(" Day 1 : Sunday ");
			 System.out.println("\r\n");
				break;

		case 2 : System.out.println(" Day 2 : Monday ");
			 System.out.println("\r\n");
				break;

		case 3 : System.out.println(" Day 3 : Tuesday ");
			 System.out.println("\r\n");
				break;

		case 4 : System.out.println(" Day 4 : Wednesday ");
			 System.out.println("\r\n");
				break;

		case 5 : System.out.println(" Day 5 : Thursday ");
			 System.out.println("\r\n");
				break;

		case 6 : System.out.println(" Day 6 : Friday ");
			 System.out.println("\r\n");
				break;

		case 7 : System.out.println(" Day 7 : Saturday ");
			 System.out.println("\r\n");
				break;
		}
	}

}
O/p:
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java daysOfWeek
 Day 3 : Tuesday


ketan@ketan-tuf-fx505dt:~/java/dailyflash$ */

/*
class replaceCharacter {

	public static void main


}
*/

/* Program 3 :
 *
class ifelseladder {

	public static void main(String[] args) {

		int num1 = 40 , num2 = 70 , num3 = 30;

		if(num1 > num2  && num1 >3) {

			System.out.println("Largest number is "+num1);
		}else if(num2 > num1 && num2 > num3 ){

			System.out.println("Largest number is "+num2);
		} else if(num3 > num1 && num3 > num2) {
			
			System.out.println("Largest number is "+num3);
		}
	}
			

	}
O/p:
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java ifelseladder
Largest number is 70
ketan@ketan-tuf-fx505dt:~/java/dailyflash$
*/

/*
class program4 {

	static boolean isDivisible() {


	}

	public static void main(String[]  args) {

	int dividend=8 , divisor = 2;


	}

}
*/

/* Program 5:
class program5 {

	static int isEven() {


	}

	public static void main(String[] args) {

		int 
}
*/

class characters {

	public static void main(String[] args) {
	char x1 = 'a' , x2 = 'A';
	char y = ' ';
//	char x = x1 - x2;	
	char ch  = 'A';
 //       char  ch1=ch+y;

		if(ch>65 && ch<122){
			ch = ch+32;
	System.out.println(ch+ " is replaced by " +(char)ch);	
		}
	}
}
