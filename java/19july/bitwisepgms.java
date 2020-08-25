

/* Program1:

class Bitwise {

	public static void main(String[] args) {
	int x =27 ;
	int y =10;

	ans = x&y;                       //  bitwise AND
	System.out.println("Ans ="+ans); // 8

	ans = x | y;                      // Bitwise OR 
	System.out.println("Ans ="+ans); // 11

	ans = x ^ y;                      // Bitwise EXOR
	System.out.println("Ans ="+ans); // 3
	
	ans = ~x;                        //Compliment
	System.out.println("Ans ="+ans); // -10
*/

/*
	long a =5 ;
       	long b=6; 
	long  ans =0;
        ans =a & b;                       //  bitwise AND
        System.out.println("Ans ="+ans); // 

        ans = a |b ;                      // Bitwise OR 
        System.out.println("Ans ="+ans); // 

        ans = a ^b ;                      // Bitwise EXOR
        System.out.println("Ans ="+ans); // 

        ans = ~a;                        //Compliment
        System.out.println("Ans ="+ans); // 
	
Output:
ketan@ketan-tuf-fx505dt:~/19july$ java Bitwise
Ans =4
Ans =7
Ans =3
Ans =-6
*/

	/*

	 char a =5 ;
        char b=6; 
        int  ans =0;
	/*
	 *Here if data type of ans is char then it will give error as:
	     ketan@ketan-tuf-fx505dt:~/19july$ javac bitwisepgms.java
bitwisepgms.java:47: error: incompatible types: possible lossy conversion from int to char
        ans =a & b;                       //  bitwise AND
               ^
bitwisepgms.java:50: error: incompatible types: possible lossy conversion from int to char
        ans = a |b ;                      // Bitwise OR 
                ^
bitwisepgms.java:53: error: incompatible types: possible lossy conversion from int to char
        ans = a ^b ;                      // Bitwise EXOR
                ^
bitwisepgms.java:56: error: incompatible types: possible lossy conversion from int to char
        ans = ~a;                        //Compliment
	 *
	 *    As internally all the characters has some integer values, so data type should be made int;
	 *   
	 * 
        ans =a & b;                       //  bitwise AND
        System.out.println("Ans ="+ans); // 

        ans = a |b ;                      // Bitwise OR 
        System.out.println("Ans ="+ans); // 

        ans = a ^b ;                      // Bitwise EXOR
        System.out.println("Ans ="+ans); // 

        ans = ~a;                        //Compliment
        System.out.println("Ans ="+ans); // 
        

Output :
	ketan@ketan-tuf-fx505dt:~/19july$ vim bitwisepgms.java
ketan@ketan-tuf-fx505dt:~/19july$ javac bitwisepgms.java
ketan@ketan-tuf-fx505dt:~/19july$ java Bitwise
Ans =4
Ans =7
Ans =3
Ans =-6

	
	/*
float a = 5.3f;
       float b=6.9f; 
        int  ans =0.0f;
        ans =a & b;                       //  bitwise AND
        System.out.println("Ans ="+ans); // 

        ans = a |b ;                      // Bitwise OR 
        System.out.println("Ans ="+ans); // 

        ans = a ^b ;                      // Bitwise EXOR
        System.out.println("Ans ="+ans); // 

        ans = ~a;                        //Compliment
        System.out.println("Ans ="+ans); // 



	}
									NOTE : IF DATA TYPE OF ANS IS MADE FLOAT THEN ,
	ketan@ketan-tuf-fx505dt:~/19july$ javac bitwisepgms.java
bitwisepgms.java:94: error: bad operand types for binary operator '&'
        ans =a & b;                       //  bitwise AND
               ^
  first type:  float
  second type: float
bitwisepgms.java:97: error: bad operand types for binary operator '|'
        ans = a |b ;                      // Bitwise OR
                ^
  first type:  float
  second type: float
bitwisepgms.java:100: error: bad operand types for binary operator '^'
        ans = a ^b ;                      // Bitwise EXOR
                ^
  first type:  float
  second type: float
bitwisepgms.java:103: error: bad operand type float for unary operator '~'
        ans = ~a;                        //Compliment
              ^
4 errors
    
                                                        NOTE : IF DATA TYPE OF ANS IS MADE INTEGER THEN ,
ketan@ketan-tuf-fx505dt:~/19july$ vim bitwisepgms.java
ketan@ketan-tuf-fx505dt:~/19july$ javac bitwisepgms.java
bitwisepgms.java:93: error: incompatible types: possible lossy conversion from float to int
        int  ans =0.0f;
                  ^
bitwisepgms.java:94: error: bad operand types for binary operator '&'
        ans =a & b;                       //  bitwise AND
               ^
  first type:  float
  second type: float
bitwisepgms.java:97: error: bad operand types for binary operator '|'
        ans = a |b ;                      // Bitwise OR
                ^
  first type:  float
  second type: float
bitwisepgms.java:100: error: bad operand types for binary operator '^'
        ans = a ^b ;                      // Bitwise EXOR
                ^
  first type:  float
  second type: float
bitwisepgms.java:103: error: bad operand type float for unary operator '~'
        ans = ~a;                        //Compliment
              ^
5 errors
*
* /
*
*/  /*
	double a =5.6f ;
        double b=6.9f; 
        int	ans =0.0f;
        ans =a & b;                       //  bitwise AND
        System.out.println("Ans ="+ans); // 

        ans = a |b ;                      // Bitwise OR 
        System.out.println("Ans ="+ans); // 

        ans = a ^b ;                      // Bitwise EXOR
        System.out.println("Ans ="+ans); // 

        ans = ~a;                        //Compliment
        System.out.println("Ans ="+ans); // 



	Error comes up as L:

	IF DATA TYPE OF ANSWER IS MADE DOUBLE THEN ,

	ketan@ketan-tuf-fx505dt:~/19july$ javac bitwisepgms.java
bitwisepgms.java:160: error: bad operand types for binary operator '&'
        ans =a & b;                       //  bitwise AND
               ^
  first type:  double
  second type: double
bitwisepgms.java:163: error: bad operand types for binary operator '|'
        ans = a |b ;                      // Bitwise OR
                ^
  first type:  double
  second type: double
bitwisepgms.java:166: error: bad operand types for binary operator '^'
        ans = a ^b ;                      // Bitwise EXOR
                ^
  first type:  double
  second type: double
bitwisepgms.java:169: error: bad operand type double for unary operator '~'
        ans = ~a;                        //Compliment
              ^
4 errors

	IF DATA TYPE OF ANSWER IS MADE INTEGER THEN , 	

ketan@ketan-tuf-fx505dt:~/19july$ vim bitwisepgms.java
ketan@ketan-tuf-fx505dt:~/19july$ javac bitwisepgms.java
bitwisepgms.java:159: error: incompatible types: possible lossy conversion from float to int
        int	ans =0.0f;
           	     ^
bitwisepgms.java:160: error: bad operand types for binary operator '&'
        ans =a & b;                       //  bitwise AND
               ^
  first type:  double
  second type: double
bitwisepgms.java:163: error: bad operand types for binary operator '|'
        ans = a |b ;                      // Bitwise OR
                ^
  first type:  double
  second type: double
bitwisepgms.java:166: error: bad operand types for binary operator '^'
        ans = a ^b ;                      // Bitwise EXOR
                ^
  first type:  double
  second type: double
bitwisepgms.java:169: error: bad operand type double for unary operator '~'
        ans = ~a;                        //Compliment
              ^
5 errors


}
		

}
*/


/* Program3:
class Bitwise1 {

		public static void main(String[] args) {

			int num1 =10;
			int num2 = 5;
			int ans = 0;

			ans = (num1++ | num2)&((++num2)^num1);

				System.out.println("Ans = "+ans);



		}



}
O/p:

ketan@ketan-tuf-fx505dt:~/19july$ javac bitwisepgms.java
ketan@ketan-tuf-fx505dt:~/19july$ java Bitwise1
Ans = 13
*/

/*
class Program4
{
	public static void main(String[] args) {
	    int num=6;
	    long lnum=7;
	    float fnum=21.5f;
	    double dnum=211.312;
	    char c='f';
		System.out.println(~num);
		System.out.println(~lnum);
		System.out.println(~fnum);//error
		System.out.println(~dnum);//error
		System.out.println(~c);
	}
}


Conclusion :
 Here it gives error as
 ketan@ketan-tuf-fx505dt:~/19july$ javac bitwisepgms.java
bitwisepgms.java:278: error: bad operand type float for unary operator '~'
		System.out.println(~fnum);//error
		                   ^
bitwisepgms.java:279: error: bad operand type double for unary operator '~'
		System.out.println(~dnum);//error
		                   ^
2 errors
*/


/*
class Program3
{
	public static void main(String[] args) {

	    int num1=10,num2=5;
	    int num,mum;
	    System.out.println((num1++ | num2)&((++num2)^num1));
	}
}
Output :
ketan@ketan-tuf-fx505dt:~/19july$ java Program3
13
*i
*
*/

/* Program5
class Cricket{

    static int totalPlayers=10;
    int out;

    static void displayRemaining(){
	    System.out.println(totalPlayers+" players are remaining to bat");
    }
    void playersOut(int out){
	totalPlayers -= out;
   System.out.println(" Some Batsmen get caught on  gully, Some get clean bold while Some of them got LBW \r\n ");
    }
}


 class ASHES_2019 {
	public static void main(String[] args) {

	    Cricket england=new Cricket();
	    england.playersOut(5);
	    england.displayRemaining();

	    Cricket australia = new Cricket();
	    australia.playersOut(3);
	    australia.displayRemaining();
	}
}

Output :
ketan@ketan-tuf-fx505dt:~/19july$ java ASHES_2019
 Some Batsmen get caught on  gully, Some get clean bold while Some of them got LBW

5 players are remaining to bat
 Some Batsmen get caught on  gully, Some get clean bold while Some of them got LBW

2 players are remaining to bat
ketan@ketan-tuf-fx505dt:~/19july$
*/
