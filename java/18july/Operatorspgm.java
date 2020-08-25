/* Program 1
 *
class RelationalOperators{

	public static void main(String[] args) {

		int n1 =10;
		int n2 =20;
		boolean ans;

		System.out.println(n1  ==  n2);  //false
		System.out.println(n1  !=  n2);  //true
		System.out.println(n1  <  n2);  // true
		System.out.println(n1  >  n2);  //false
		System.out.println(n1  <=  n2);  //true
		System.out.println(n1  >=  n2);  //false

	}

		}
Output: 
ketan@ketan-tuf-fx505dt:~/18july$ vim Operatorspgm.java
ketan@ketan-tuf-fx505dt:~/18july$ javac  Operatorspgm.java
ketan@ketan-tuf-fx505dt:~/18july$ java RelationalOperators
false
true
true
false
true
false


*/

/*

class LogicalOperators{

	public static void main(String[] args) {

		int n1 = 10;
		int  n2 = 20;
		boolean ans;
                
		ans  = (n1!=n2) && (n1<n2); //true
		System.out.println(ans);  
	//	System.out.println(n1  !=  n2);  //true
	//	System.out.println(n1  <  n2);  // true
	//	System.out.println(n1  >  n2);  //false
	//	System.out.println(n1  <=  n2);  //true
	//	System.out.println(n1  >=  n2);  //false

		ans  = (n1<=n2)||(n1>n2);          //true
		System.out.println(ans);  
	}

		}

*/


/* Program 3
class LogicalDemo {

	public static void main(String[] args) {

		int i  =5;
		int j =4;
		boolean ans ;

	ans = (i++ >= j++) && (--j < i++);
System.out.println("Answer 1 = "+ans);	
	

	ans = (--i < j--) || (j++ >= ++i);
System.out.println("Answer 2 = "+ans);	
	
	

		}

}

//Output :
ketan@ketan-tuf-fx505dt:~/18july$ java LogicalDemo
Answer 1 = true
Answer 2 = false
*/



/* Program 2
 *
class OperatorsPgm2 {

	public static void main(String[] args){

	int num =2 ;
	
	num >>>= 2;
	System.out.println("num = "+num);

	num <<= 3;
	System.out.println("num ="+num);

	num ^= 2;
	System.out.println("num = "+num);

	 num = ++num;
	System.out.println("num ="+num);

	 num = ~num;
	System.out.println("num ="+num);

	}


}

Output :
ketan@ketan-tuf-fx505dt:~/18july$ javac  Operatorspgm.java
ketan@ketan-tuf-fx505dt:~/18july$ java OperatorsPgm2
num = 0
num =0
num = 2
num =3
inum =-4
ketan@ketan-tuf-fx505dt:~/18july$
*/

/* Program 5
class Pune{

	static int covidActiveCases = 10000;
	int totalcases = 20000;

	static void noCorona() {
	
	System.out.println(" Recovered Cases from Coronavirus is 667k");		
	

	}

	void lockdown() {
	
		Pune.covidActiveCases = 100000 ;
		totalcases = 120000 ;
		System.out.println("Pune Active Cases"+Pune.covidActiveCases); 
		System.out.println("Pune total Cases"+totalcases); 
	}

	


}

class Mumbai{

	static int covidActiveCases = 30000;
	int totalcases = 50000;

	static void noCorona() {
	
			
	System.out.println(" Recovered Cases from Coronavirus is 467k");		


	}

	void lockdown() {
	
		Mumbai.covidActiveCases = 200000 ;
		totalcases = 240000 ;
		System.out.println("Mumbai Active Cases"+Mumbai.covidActiveCases); 
		System.out.println("Mumbai total Cases"+totalcases); 
	}



}



	class Covid {
	
	public static void main(String[] args) {

	Pune obj1 = new Pune();
	obj1.lockdown();


	Mumbai obj2 = new Mumbai();
	obj2.lockdown();

	}
}
	


Output :

ketan@ketan-tuf-fx505dt:~/18july$ javac Operatorspgm.java
ketan@ketan-tuf-fx505dt:~/18july$ java Covid
Pune Active Cases100000
Pune total Cases120000
Mumbai Active Cases200000
Mumbai total Cases240000
*/
