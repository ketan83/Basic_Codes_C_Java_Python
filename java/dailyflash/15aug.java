// NOTE : ALL THE NAMES OF CLASSES ARE WRITTEN AFTER QUESTION PROGRAM NUMBER , ALSO OUTPUT IS ALSO THERE OF RESPECTIVE PROGRAM QUESTIONS
// BUT QUESTION NO.4 NOT SOLVED


/*
class program19 {
	 public static void main(String[] args) {

		 char x = 'A';

		 int i , j;

		 for(i=1 ;i<=4 ; i++) {

			 for(j=1 ; j<=4 ; j++) {

				 System.out.print("\t"+x+"\t");
				 x++;
			 }

			 System.out.println("\n");
		 }
	 }
}


O/p :

ketan@ketan-tuf-fx505dt:~/java/dailyflash$ javac 15aug.java
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program15
	A		B		C		D

	E		F		G		H

	I		J		K		L

	M		N		O		P

ketan@ketan-tuf-fx505dt:~/java/dailyflash$
*/

/*
class program20 {
         public static void main(String[] args) {

                 char x = 'A';
		 char y = 'a';
                 int i , j;

                 for(i=1 ;i<=4 ; i++) {

                         for(j=1 ; j<=4 ; j++) {
					if(i==2 || i==4) {

                                 System.out.print("\t"+y+"\t");
                                 		y++;
					} else {

                                 System.out.print("\t"+x+"\t");
				 x++;
					}
						
                         }

                         System.out.println("\n");
                 }
         }
}

O/p:
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ javac 15aug.java
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program20
	A		B		C		D

	a		b		c		d

	E		F		G		H

	e		f		g		h

ketan@ketan-tuf-fx505dt:~/java/dailyflash$

*/

/*
class program18 {

	public static void main(String[] args) {

		int num= 420 , rem;
		int x =num;


		while(num!=0) {

			rem=num%10;
			System.out.print(rem);
			num = num / 10;
		}
		System.out.println("\n");

		}
		
}

O/p:
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ javac 15aug.java
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program18
024

*/

/*
class program17 {

	public static void main(String[] args) {

		int n = 7;
		int flag =0 ,i ;

		for( i = 2 ;i <=n/2 ; i++) {

			if(n%i==0) {
			
				flag = 1;
		
			}
		}

		if(flag == 1) {

				System.out.println(n+" is not a prime number \n");
		} else {

				System.out.println(n+" is  a prime number \n");
			}
	}
}

O /p :
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ javac 15aug.java
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program17
13 is  a prime number
*/

/*
class program24 {

	public static void main(String[] args) {

		int num= 234 , rem ,x , i=0;;
		x = num ;

		while(num!=0) {

			rem = num %10;
			i++;
			num = num / 10;
		}

		System.out.println("Number of digits in " + x +" is " +i);

	}
}

O/p:
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program24
Number of digits in 234 is 3
ketan@ketan-tuf-fx505dt:~/java/dailyflash$
*/


/*
class program13 {

	public static void main(String[] args) {

		int x, num =9,dup=0 ,sum=0,rem, i=0 ;
		int  y = num;

		if(num!= 0) {

			x = num*num;
			 dup = x;
			System.out.println("Square of " + num + " is " +x);

			while(x!=0) {
				
				rem = x %10;
				sum = sum + rem;
				x =x/10;
			}
			num = num/10;
		}
		 System.out.println("Sum of digits of " + dup + " is " + sum);

		 if(y == sum) {

			 System.out.println(y + " is a neon number ");

		 } else {

			 System.out.println(y + " is not a neon number ");
		 }
	}
				
}

O/p:

ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program13
Square of 9 is 81
Sum of digits of 81 is 9
9 is a neon number
ketan@ketan-tuf-fx505dt:~/java/dailyflash$

*/ 
/*
class program11 {

	public static void main(String[] args) {

		int i ,n = 24;
		System.out.println(" Perfect Divisors of " +n+ "are ");

		for( i =1 ;i <=24 ; i++) {

			if(n%i==0) {

				System.out.print("\t" +i+ "\t") ;
			}

		}
		System.out.println("\n");
	}
}

O/p :

ketan@ketan-tuf-fx505dt:~/java/dailyflash$ javac 15aug.java
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program11
 Perfect Divisors of 24are
	1		2		3		4		6		8		12		24

*/

/*
class program10 {

	public static void main(String[] args) {

	 int n =10 , power =2  , x , i;
  x = n;
	 for( i =1 ; i< power ; i++) {
	 
		 n = n * n ;
	 }
	 System.out.println(x + " to the power " +power+ " is " +n);  

	}
}

O/p:
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program10
10 to the power 2 is 100
ketan@ketan-tuf-fx505dt:~/java/dailyflash$
*/

/*
class program9 {

	public static void main(String[] args) {
	
		int  n = 121;

		int first = n ;
		int last ;

		while(first>=10) {

			first = first / 10;
		}

		 last = n %10;

		 if(first == last) {

			 System.out.println(n + " is a palindrome number ");
		 } else {

			 System.out.println(n + " is not a palindrome number ");

				}
	
	}
}

O/p:
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program9
121 is a palindrome number
ketan@ketan-tuf-fx505dt:~/java/dailyflash$
*/

/*
class program6 {

	public static void main(String[] args) {

		int i ,n = 6 , sum =0;

		for( i = 1; i <  n ; i++) {

			if(n%i==0) {
			
					sum = sum + i;
			}
		}
		System.out.println(sum);

		if(n == sum) {
				System.out.println(n + " is a perfect number ");
		} else { 

			System.out.println(n + " is not a perfect number ");
		  }
	}
}


ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program6
6
6 is a perfect number
ketan@ketan-tuf-fx505dt:~/java/dailyflash$

*/

/*
class program6 {

	public static void main(String[] args) {

		 int x = 50 , y = 7 , z = 56 ;

		if((x > y)  &&  (x < z) && (y < z)) {

			System.out.println(" Minimum number from " + x +"," + y + "," +z + "  is" + y);
	}
	}
}

O/p:
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program6
 Minimum number from 50,7,56  is7
ketan@ketan-tuf-fx505dt:~/java/dailyflash$

*/

/*
class program5 {

	public static void main(String[] args) {

		int c1 = 'a';
		int c2 = 'b';
		int c3 = 'c';
		int c4 = 'd';

		System.out.println("a = " +c1);
		System.out.println("b = " +c2);
		System.out.println("c = " +c3);
		System.out.println("d = " +c4);

		
	}
}
O/p:

ketan@ketan-tuf-fx505dt:~/java/dailyflash$ javac 15aug.java
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program5
a = 97
b = 98
c = 99
d = 100
ketan@ketan-tuf-fx505dt:~/java/dailyflash$
*/

/*
class program22 {

	public static void main(String[] args) {

		String sVar = "g";

		switch(sVar) {

	    case "a" : System.out.println(sVar + " is a vowel ");
			 break;

	    case "e" : System.out.println(sVar + " is a vowel ");
			 break;

	    case "i" : System.out.println(sVar + " is a vowel ");
			 break;
	    case "o" : System.out.println(sVar + " is a vowel ");
			 break;
	    case "u" : System.out.println(sVar + " is a vowel ");
			 break;
	    case "g" : System.out.println(sVar + " is a consonant ");
			 break;
			default : System.out.println("Wrong Choice ");
				  break;
		}
	}
}

O/p:
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program22
u is a vowel
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ vim 15aug.java
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ javac 15aug.java
iketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program22
g is a consonant
ketan@ketan-tuf-fx505dt:~/java/dailyflash$
*
*
*
*/


/*
class program23 {

	public static void  main(String[] args) {

	int a,b,gcd = 0;
a=20 ;
b=28;

		int i=1;
	while(i <= a && i <= b) {
	
		if((a % i == 0) && (b % i == 0))

			{
				gcd = i;
			}
		 i++;
	}

			System.out.println("GCD of "  + a +  " & " + b + " is  " +gcd);
			System.out.println("\n");
	
	} 

}


O/p:
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ javac 15aug.java
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program23
GCD of 20 & 28 is  4

*/


/*
class program12 {

	public static void main(String[] args) {

			int i= 5 , j =10 , k =15;
			boolean ans ;

			ans = (i<(j-10))?true:false;
			System.out.println(ans);

			ans = (i==(i=j))?true:false;
			System.out.println(ans);

			ans = ((i&j&k)!=0)?true:false;
			System.out.println(ans);

			ans = ((i^j>>2)==0)?true:false;
			System.out.println(ans);
			}
}

O/p:

ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program12
false
false
true
false
ketan@ketan-tuf-fx505dt:~/java/dailyflash$
*/

/*
class program21 {

	public static void main(String[] args) {

			boolean bVar= true , bVar1 = false;
			char cVar1 = false;
			int cVar = 0;
			boolean ans;

			ans = (bVar == bVar1) ? (bVar == cVar1) : false;
				System.out.println(ans);

			ans = (cVar1 == bVar1) ? (bVar == cVar1) : false;

			System.out.println(ans);



			}
}

O/p:
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ javac 15aug.java
15aug.java:499: error: incompatible types: boolean cannot be converted to char
			char cVar1 = false;
			             ^
15aug.java:503: error: incomparable types: boolean and char
			ans = (bVar == bVar1) ? (bVar == cVar1) : false;
			                              ^
15aug.java:506: error: incomparable types: char and boolean
			ans = (cVar1 == bVar1) ? (bVar == cVar1) : false;
			             ^
15aug.java:506: error: incomparable types: boolean and char
			ans = (cVar1 == bVar1) ? (bVar == cVar1) : false;
			                               ^
4 errors
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ vim 15aug.java
*/


/*
 class program1{

    public static void main(String[] args) {

    	int year=2019;
    	
    
    	
        boolean isLeap = false;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            }
            else
                isLeap = true;
        }
        else {
            isLeap = false;
        }

        if(isLeap==true)
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year.");
    }
}

O/p:
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program1
2016 is a Leap Year.
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ vim 15aug.java
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ javac 15aug.java
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program1
2019 is not a Leap Year.
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ 
*/

