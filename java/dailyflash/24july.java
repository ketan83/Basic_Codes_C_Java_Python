/*Program1
 *
class even_odd{
int a;
	int evenOdd(int a) {

		if(a%2==0)
		{
			System.out.println(a+"is an even number");
		}
			else
			{
				System.out.println(a+"is  an odd number");
			}
			return 1;
		}
}
	
class program1 {
public static void main(String[] args){

	
	even_odd number = new even_odd();
	number.evenOdd(16);
	
	}
}

Output :
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program1
13is  an odd number
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ vim 24july.java
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ javac 24july.java
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program1
16is an even number
ketan@ketan-tuf-fx505dt:~/java/dailyflash$
*/

/* Program 2
class angle {

	int right = 90;
	
	

	int angle = 20;
	void angleOfTriangles () {
	if(angle< right) {

		System.out.println(angle+"is an acute angle");
	}
	else if(angle == right) {

		System.out.println(angle+"is a right angle");
	}
		if(angle > right ){

			System.out.println(angle+"is an obtuse angle");
	}
	}

}

class program2 {

	public static void main(String[] args) {

	angle degrees = new angle();
	degrees.angleOfTriangles();


	}	

}
 Output :
 ketan@ketan-tuf-fx505dt:~/java/dailyflash$ javac 24july.java
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program2
20is an acute angle
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ vim 24july.java
*/

/*Program 3:
class relationalOperators {

	int a =5;
	int b= 10;

	void ifstmt(){
	if(a>=b){

		System.out.println(a+" value of a is greater than b");
	}
	else{

		System.out.println(b+" value of b is greater than a");
	}
}

}

class program3 {
	public static void main(String[] args) {

		relationalOperators condition = new relationalOperators();
	       condition.ifstmt();
	}	       

	}

Output:
etan@ketan-tuf-fx505dt:~/java/dailyflash$ vim 24july.java
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ javac 24july.java
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program3
10 value of b is greater than a
ketan@ketan-tuf-fx505dt:~/java/dailyflash$
*/

/* Program 4
class alphabets {

	void letters() {

	char c = 'A';

	if('A'==c || 'E'==c || 'I'==c ||'O'==c || 'U'== c) {

	System.out.println(c+" is vowel");

	}
		else
		{

	System.out.println(c+" is consonant");
		}
	}
}

class program4{


		public static void main(String[] args){

		alphabets obj = new alphabets();
		obj.letters();

		}

}

Output :
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ javac 24july.java
^[[Aketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program4
A is vowel
*/

/*
class college {

	int a;

	boolean isEligible(int a) {

		
		System.out.println("Student is having attendance of percentage "+a);
		System.out.println("Processing ............");
		if(65 >=75) {

			System.out.println("The Student 1 is eligible for the exam");
		}else {

			System.out.println("The Student 1 is not  eligible for the exam");

			}
		return true;
	}
}



class program5 {

	public static void main(String[] args) {

		college attendance = new college();
		attendance.isEligible(65);



	}
}

Program 5:
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ javac 24july.java
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program5
Student is having attendance of percentage 65
Processing ............
The Student 1 is not  eligible for the exam
ketan@ketan-tuf-fx505dt:~/java/dailyflash$
*/
