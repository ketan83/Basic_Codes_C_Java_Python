
/*  Program 3

class program3 {

	public static void main(String[] args) {
		int num =0 ;
		 int result =0; 
		 int result1 =0; 
		
		 num=188;
	       	result = num>>>4;
		System.out.println("Result ="+result);   // Output : Result =11


//		num=255; 
//		result1 = num<<<3;   // error
		
 		num = -108; 
		result1 =num>>>23;                    
		System.out.println("Result ="+result1); // output : Result =511
 

  //              num=-123; 
//		result1 = num<<<15;   //error
	}


}

Output :
In case 2 & 4 Error comes up as
ketan@ketan-tuf-fx505dt:~/22july$ javac operators_assignment.java
operators_assignment.java:13: error: illegal start of type
		result1 = num<<<3;
		                ^
operators_assignment.java:19: error: illegal start of type
		result1 = num<<<15;
		                ^
2 errors
*/

/*
class program4 {

        public static void main(String[] args) {
	
		int a = 25, b = -34, c = 19, d = 4;
 int res = ((a << 2) | (b >> 3));
 boolean result = ((a << 2 | b >> 3) < -10 ) || ((c++ << 2 & b-- >>> d) >= 23);


		System.out.println("Result ="+res); 
		System.out.println("Result ="+result); 
	}

}


Output:

Result =-1
Result =true
*/

/*
class program1 {

        public static void main(String[] args) {

		int n1 =-38, res1 = n1>>4;
		System.out.println(res1); // O/p: -3
	}
}

*/

/* Program 5

class arithmatic {

	static	int a =40 ;
	static	int b = 20;
	
	void addition() {
		
		int add ;

		add = a+b;
		System.out.println("Addition of 2 no.s is "+add);
	}

	void subtraction() {
		
		int sub ;
		sub = a-b;
		System.out.println("Subtraction of 2 no.s is "+sub);
	}

	void multiplication() {
		
		int mult;
	     
		mult= a*b;
		System.out.println("Subtraction of 2 no.s is "+mult);
	}

	void division() {
		
		int div;
	  
		div= a/b;
		System.out.println("Division of 2 no.s is "+div);
	}

	void modulus() {
		
		int mod;
	   
		mod= a%b;
		System.out.println("MOdulus of 2 no.s is "+mod);
	}

	static void display() {

			
		
		System.out.println("****************Arithmatic Operators****************");



	}
	



}



	class Bitwise {

		static	int num = 30 ;
		int x =9 ,y =10;
	int ans ;
	

	void UnsignedRightShift() {
	num >>>= 2;
	System.out.println("num = "+num);
	}

	void LeftShift() {
	num <<= 3;
	System.out.println("num ="+num);
	}

	void BitwiseEXOR() {
	num ^= 2;
	System.out.println("num = "+num);
	}

	void PreIncrement() {
	 num = ++num;
	System.out.println("num ="+num);
	}

	void Complimentary() {
	 num = ~num;
	System.out.println("num ="+num);
	}


	void BitwiseOR() {
	ans = x & y;
	System.out.println(ans);
	}

	void BitwiseAND() {
	ans = x | y;
	System.out.println(ans);
	}

	void RightShift() {
	num >>= 3;
	System.out.println("num ="+num);
	}

	static void BitwiseDisplay() {

		System.out.println("****************Biwise Operators****************");

	}
}

	class LogicalOperators {


	static int n1 =10, n2 =20;

	boolean ans ;
       
	void logicalAND() {
	ans = (n1!=n2) && (n1<n2);
	System.out.println(ans);
	}

	void logicalOR() {
	ans = (n1!=n2) || (n1<n2);
	System.out.println(ans);
	}

	static void LogicalDisplay() {

		System.out.println("****************Logical Operators****************");

	}

	}


class Operators {


	public static void main(String[] args) {

	arithmatic obj = new arithmatic();
	obj.display();
	obj.addition();
	obj.subtraction();
	obj.multiplication();
	obj.division();
	obj.modulus();

	System.out.println("\r\n");

	LogicalOperators obj2 = new LogicalOperators();
	obj2.LogicalDisplay();
	obj2.logicalAND();
	obj2.logicalOR();

	System.out.println("\r\n");

	Bitwise obj3 = new Bitwise();
	obj3.BitwiseDisplay();
	obj3.UnsignedRightShift();
	obj3.LeftShift();
	obj3.RightShift();
	obj3.BitwiseEXOR();
	obj3.PreIncrement();
	obj3.Complimentary();
	obj3.BitwiseOR();
	obj3.BitwiseAND();

	}







}

Output :
ketan@ketan-tuf-fx505dt:~/22july$ java Operators
****************Arithmatic Operators****************
Addition of 2 no.s is 60
Subtraction of 2 no.s is 20
Subtraction of 2 no.s is 800
Division of 2 no.s is 2
MOdulus of 2 no.s is 0


****************Logical Operators****************
true
true


****************Biwise Operators****************
num = 7
num =56
num =7
num = 5
num =6
num =-7
8
11

*/

