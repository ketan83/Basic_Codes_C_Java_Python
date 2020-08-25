import java.util.Scanner;


/*
class program1 {

	public static void main(String[] args) {
	Scanner obj = new Scanner(System.in);

	int side1  ,side2 , Hypo ;
	System.out.println("ENter sides of Triangle & desired hypotenuse :");
	side1 = obj.nextInt();
	side2 = obj.nextInt();
	Hypo = obj.nextInt();

	Hypo = Hypo * Hypo;

	side1 = side1*side1 ;
	side2 = side2*side2 ;

	if(Hypo == (side1+side2)) {

		System.out.println("Triangle Satisfies the problem ");
	} else {
		System.out.println("Triangle does not Satisfies the problem ");
	}

	}
}

O/p:
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program1
ENter sides of Triangle & desired hypotenuse :
3 4 5
Triangle Satisfies the problem
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program1
ENter sides of Triangle & desired hypotenuse :
3 6 9
Triangle does not Satisfies the problem
ketan@ketan-tuf-fx505dt:~/java/dailyflash$
*/

/*
class program4 {

	public static void main(String[] args) {

		int  i , j , x =1;

		for ( i=1  ; i<=4 ; i++) {

			for (j =1 ; j<=4 ; j++) {

				System.out.print("  "+ x );
				x++;
			}
			System.out.println("\n");
		}
	}
}
O/p:
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ javac 20aug.java
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program4
  1  2  3  4

  5  6  7  8

  9  10  11  12

  13  14  15  16

ketan@ketan-tuf-fx505dt:~/java/dailyflash$
*/



/*
	class program5 {


	void percentage(int marks) {

		System.out.println("Percentage is " + marks + "%");

	}


	void grade(int marks) {

	if(marks>=90) 
		System.out.println("Grade : A");
	else if(marks>=80) 
		System.out.println("Grade : B");
	else if(marks>=70) 
		System.out.println("Grade : C");
	else if(marks>=60) 
		System.out.println("Grade : D");
	else if(marks>=50) 
		System.out.println("Grade : E");
	else if(marks>=40) 
		System.out.println("Grade : F");
	}

	

        public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

	program1 obj1  = new program1();
        int marks ,i;
	char grade;
        System.out.println("ENter marks of Five Subjects Physics , Chemistry , Biology , Mathematics , Computer Science  :");
	for( i=1  ; i<=5 ; i++) {

		System.out.println(  "  Subject " + i);
        	marks = obj.nextInt();
		obj1.percentage(marks);
		obj1.grade(marks);

		System.out.println("\n");
	}



       }
	}

O/p:
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program5
ENter marks of Five Subjects Physics , Chemistry , Biology , Mathematics , Computer Science  :
  Subject 1
90
Percentage is 90%
Grade : A


  Subject 2
80
Percentage is 80%
Grade : B


  Subject 3
70
Percentage is 70%
Grade : C


  Subject 4
60
Percentage is 60%
Grade : D


  Subject 5
40
Percentage is 40%
Grade : F

*/



/*
class program4 {

	public static void main(String[] args) {

		 Scanner obj = new Scanner(System.in);
		int year;

		System.out.println("ENter a year ");
		year = obj.nextInt();

		if(year%4==0) {
			System.out.println(year + " is aleap year ");
		}else {
			System.out.println(year + " is not aleap year ");
		}

		}
}


O/p:
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ javac 20aug.java
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program4
ENter a year
2000
2000 is aleap year
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ javac 20aug.java
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program4
ENter a year
1900
1900 is aleap year
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program4
ENter a year
2100
2100 is aleap year
ketan@ketan-tuf-fx505dt:~/java/dailyflash$
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program4
ENter a year
2020
2020 is aleap year
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program4
ENter a year
2015
2015 is not aleap year
ketan@ketan-tuf-fx505dt:~/java/dailyflash$
*/

/*
class program2 {

	public static void main(String[] args) {

		int A;  //final amount
		int P = 2000 ; // initial principal balance
		int r = 10; // annual interest rate (in %age)
		int t = 2; // time ( in years);

		A =P * ( 1 + (r*t));  // Simple Interest Formula 

		System.out.println("Using Formula Final Amount is  " + A); // 42000

			}
}

O/p:

ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program2
Using Formula Final Amount is  42000
ketan@ketan-tuf-fx505dt:~/java/dailyflash$
*/
