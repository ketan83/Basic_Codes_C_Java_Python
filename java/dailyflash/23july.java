/*
class ternary {

	public static void main(String[] args) {

		int x =10, y;
		int res;

		res = (10%2 == 0)? x : y;

		System.out.println(res+ " is even");
		}
}

O/p:
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ javac 23july.java
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java ternary
10 is even

	*/

/* Program 3
class ternary3 {


	 public static void main(String[] args) {

                int myage = 20, voterIdAge = 18;
                int res;

                res = (myage >= voterIdAge)? myage : voterIdAge;

                System.out.println(res+ "+ voter  is eligible to vote");
                }
O/p:
	 ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java ternary3
20+ voter  is eligible to vote
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ 


}

*/

/* Program 5
class Apple {

	public static void main(String[] args){

	Apple IOS = new Apple();

	boolean res;
	res = ( IOS instanceof Apple);
	System.out.println("IOS is the most advanced mobile operating system from Apple Inc : "+res);
	}
	
}

O/p:
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java Apple
IOS is the most advanced mobile operating system from Apple Inc : true
ketan@ketan-tuf-fx505dt:~/java/dailyflash$
*/


/* Program 4
class Human {

public static void main(String[] args) {

Human lion = null;

Human tiger = null;

Human puma = null;

Human monkey = new

Human();

boolean isLionHuman = lion instanceof Human;

System.out.println("Are Lion and Human of  same species ->"+isLionHuman);


boolean isTigerHuman = tiger instanceof Human;
System.out.println("Are Tiger and Human are of same species --> "+isTigerHuman);



boolean isMonkeyHuman = monkey instanceof Human;

System.out.println("Are Monkey and Human of same species-"+isMonkeyHuman);

boolean isPumaHuman = puma instanceof Human;

System.out.println("Are Puma and Human of same species-"+isPumaHuman);
}
}

O/p:
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java Human
Are Lion and Human of  same species ->false
Are Tiger and Human are of same species --> false
Are Monkey and Human of same species-true
Are Puma and Human of same species-false
ketan@ketan-tuf-fx505dt:~/java/dailyflash$
*/



