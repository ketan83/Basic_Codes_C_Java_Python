
/* Program 2
class ArithmaticOperations {

	void addition() {
		
		int add ;
		int a =40 ;
		int b = 20;
		add = a+b;
		System.out.println("Addition of 2 no.s is "+add);
	}

	void subtraction() {
		
		int sub ;
	     int a =40 ;
	     int b = 20;
		sub = a-b;
		System.out.println("Subtraction of 2 no.s is "+sub);
	}

	void multiplication() {
		
		int mult;
	     int a =40 ;
	     int b = 20;
		mult= a*b;
		System.out.println("Subtraction of 2 no.s is "+mult);
	}

	void division() {
		
		int div;
	     int a =40 ;
	     int b = 20;
		div= a/b;
		System.out.println("Division of 2 no.s is "+div);
	}

	void modulus() {
		
		int mod;
	     int a =40 ;
	     int b = 20;
		mod= a%b;
		System.out.println("MOdulus of 2 no.s is "+mod);
	}
	
	public static void main(String[] args) {

	ArithmaticOperations obj1 = new ArithmaticOperations();
	obj1.addition();
	obj1.subtraction();
	obj1.multiplication();
	obj1.division();
	obj1.modulus();

	}

}

	Output :
	ketan@ketan-tuf-fx505dt:~/17july$ javac Operators_assignment.java
ketan@ketan-tuf-fx505dt:~/17july$ java ArithmaticOperations
Addition of 2 no.s is 60
Subtraction of 2 no.s is 20
Subtraction of 2 no.s is 800
Division of 2 no.s is 2
MOdulus of 2 no.s is 0
ketan@ketan-tuf-fx505dt:~/17july$ 

 */

/*
 * 	Program3
class PrePostPgm1 {

	public static void main(String[] args) {
	int a =10;
	int b= 20;
	int c = 50;
	int ans = 0;

	ans = a++ + ++b + ++c;
	System.out.println(ans);
	}
}

Output :
        ketan@ketan-tuf-fx505dt:~/17july$ java PrePostPgm1
82
ketan@ketan-tuf-fx505dt:~/17july$ 
*/

/*Program 4
  	
class PrePostPgm2 {

	public static void main(String[] args) {
	int a =10;
	int b= 20;
	int c = 50;
	int ans = 0;

	ans = --a + ++b + c--;
	System.out.println(ans);
	}
}

// Output :
 ketan@ketan-tuf-fx505dt:~/17july$ java PrePostPgm2
80
ketan@ketan-tuf-fx505dt:~/17july$
*/
  
/* Program5	 
  	
class PrePostPgm3 {

	public static void main(String[] args) {
	int a =10;
	int b= 20;
	int c = 50;
	int ans = 0;

	ans = a++ + --b + c--;
	System.out.println(ans);
	}
}

//Output :
     ketan@ketan-tuf-fx505dt:~/17july$ java PrePostPgm3
79
ketan@ketan-tuf-fx505dt:~/17july$ 

*/

 /* Program1

 class dominos {

	int price=0 ;
	int quantity=0 ;
	static int total = 0;


	static void bill() {
	
	System.out.println("**************BILL PARTICULARS**************");
       	System.out.println("1. Dominos Pizza ");	
       	System.out.println("2. Fries ");	
	System.out.println("\r\n");

	}

	public static void main(String[] args) {

	bill();
	dominos pizza = new dominos();
	pizza.price = 300;
	pizza.quantity = 5;
	System.out.println("Price of a Pizza each "+pizza.price);
	System.out.println("No. of quantity "+pizza.quantity);
	total = pizza.price*pizza.quantity;
	System.out.println("Amount of Pizzas is  "+total);
	System.out.println("\r\n");

	dominos fries = new dominos();
	fries.price = 100;
	fries.quantity = 5;
	System.out.println("Price of a Fries each "+fries.price);
	System.out.println("No. of quantiy "+fries.quantity);
	total = fries.price*fries.quantity;
	System.out.println("Amount of Pizzas is  "+total);
	System.out.println("\r\n");
	
	total = (pizza.price*pizza.quantity) + (fries.price*fries.quantity);
	System.out.println("Total amount of all the food items is :"+total);
	System.out.println("\r\n");
	}



 }


output:

ketan@ketan-tuf-fx505dt:~/17july$ vim Operators_assignment.java
ketan@ketan-tuf-fx505dt:~/17july$ javac Operators_assignment.java
ketan@ketan-tuf-fx505dt:~/17july$ java  dominos
**************BILL PARTICULARS**************
1. Dominos Pizza 
2. Fries 


Price of a Pizza each 300
No. of quantity 5
Amount of Pizzas is  1500


Price of a Fries each 100
No. of quantiy 5
Amount of Pizzas is  500


Total amount of all the food items is :2000


ketan@ketan-tuf-fx505dt:~/17july$ 
*/

