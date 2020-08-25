/*
class Football {


}


class cricket{						//instanceof operator example

	public static void main(String[] args) {
/*
		cricket test = new cricket();
		cricket odi = new cricket();
		cricket t20 = new cricket();
		cricket thirty5 = null;
		boolean res;

		res  = thirty5 instanceof cricket;
		System.out.println(res); //false
*/
		/*
		System.out.println(cricket instanceof cricket); 

		  Error will comeup as :
		  * ternary_instanceof_operatorspgms.java:14: error: cannot find symbol
		System.out.println(cricket instanceof cricket); //false
		                   ^
  symbol:   variable cricket
  location: class cricket
1 error
	 But if object is created then it will not show error and give o/p as true as instanceof operator returns boolean value.

		  *
		  *
		  *
		  * 
		cricket test = new cricket();
		cricket odi= new cricket();
		Football obj = new Football();
		System.out.println(test instanceof Object); //true  , here Extends object is parent class of cricket class so no error will be shown
		System.out.println(obj instanceof Football); //true , ( object_of_class instanceof classname) asach lihayla pahijen , indirectly extends object is also parent class of object  of Football



	}




}

*/

class ternary_operator {


	public static void main(String[] args) {

		int x =25 , y =20;
	int res=0;
	String res1 ;
	int z=22;
	System.out.println((x>y)?x:y); // it will give error as stmt error karan ghenara konitari pahijen na i.e to store result in a variable

//	System.out.println((x<y)?System.out.println("x is small"):System.out.println("y is big"));   // error 

/*
 
etan@ketan-tuf-fx505dt:~/22july$ javac ternary_instanceof_operatorspgms.java
ternary_instanceof_operatorspgms.java:63: error: 'void' type not allowed here
	System.out.println((x<y)?System.out.println("x is small"):System.out.println("y is big"));   
	                                           ^
ternary_instanceof_operatorspgms.java:63: error: 'void' type not allowed here
	System.out.println((x<y)?System.out.println("x is small"):System.out.println("y is big"));   
	                                                                            ^
ternary_instanceof_operatorspgms.java:63: error: reference to println is ambiguous
	System.out.println((x<y)?System.out.println("x is small"):System.out.println("y is big"));   
	          ^
  both method println(char[]) in PrintStream and method println(String) in PrintStream match
3 errors


*/
	res1=(x<y)?"x is small":"y is big";
       System.out.println(res1);

       res = (x>y)?((x>z)?x:z):((y>z)?y:z);
       System.out.println(res);

	}



}
