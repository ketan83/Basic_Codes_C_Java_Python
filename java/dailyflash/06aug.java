import java.util.Scanner;

/*
class program5 {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		int i , x,y;
		System.out.println("Enter Number ");
                                x = obj.nextInt();

		for(i= 1 ;i<=10 ;i++) {

			y  =  x * i;
			System.out.println(y+"\t");

		}
		System.out.println("\r\n");
	}
}

O/p:


ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program5
Enter Number
3
3
6
9
12
15
18
21
24
27
30


*/

/*

class program4 {

        public static void main(String[] args) {

                Scanner obj = new Scanner(System.in);
                int i ,j, x,y;
                System.out.println("Enter Number ");
                                x = obj.nextInt();

				for ( i =x ; i>=1 ;i--) {

					if(i%5==0) {

						System.out.println("Divisible by 5 is "+i);
					}
                                   
					

				}
					
                                        System.out.println("Reverse Order \n");
  					for ( j =x ; j>=1 ;j--) {


                                               

                                        System.out.println( j+"\t" );

                                }
}

}


O/p :
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ javac 06aug.java
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program4
Enter Number
100
Divisible by 5 is 100
Divisible by 5 is 95
Divisible by 5 is 90
Divisible by 5 is 85
Divisible by 5 is 80
Divisible by 5 is 75
Divisible by 5 is 70
Divisible by 5 is 65
Divisible by 5 is 60
Divisible by 5 is 55
Divisible by 5 is 50
Divisible by 5 is 45
Divisible by 5 is 40
Divisible by 5 is 35
Divisible by 5 is 30
Divisible by 5 is 25
Divisible by 5 is 20
Divisible by 5 is 15
Divisible by 5 is 10
Divisible by 5 is 5
Reverse Order

100
99
98
97
96
95
94
93
92
91
90
89
88
87
86
85
84
83
82
81
80
79
78
77
76
75
74
73
72
71
70
69
68
67
66
65
64
63
62
61
60
59
58
57
56
55
54
53
52
51
50
49
48
47
46
45
44
43
42
41
40
39
38
37
36
35
34
33
32
31
30
29
28
27
26
25
24
23
22
21
20
19
18
17
16
15
14
13
12
11
10
9
8
7
6
5
4
3
2
1
ketan@ketan-tuf-fx505dt:~/java/dailyflash$
*/

/*
class program3 {

	public static void main(String[] args) {
		
	Scanner obj = new Scanner(System.in);
			char ch1 ,ch2;
int i;
				for( i=0 ; i< 5; i++) {

				System.out.println("AbAbAbAbAb");


				}
	}
}

O/p:
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program3
AbAbAbAbAb
AbAbAbAbAb
AbAbAbAbAb
AbAbAbAbAb
AbAbAbAbAb
ketan@ketan-tuf-fx505dt:~/java/dailyflash$
*/

/*
class program2 {

        public static void main(String[] args) {

                Scanner obj = new Scanner(System.in);
                int i ,j, year,marks;
                System.out.println("ENter Student's year ");
                                year = obj.nextInt();

                System.out.println("Enter marks of student ");
                                marks = obj.nextInt();

				switch(year) {

					case 1 : System.out.println("1st year Student is not  eligible for education scholarship ");
                                        		break;    
                                        
					case 2 : System.out.println("2nd year Student is not  eligible for education scholarship ");
                                        		break;    


					case 3 :switch(marks) {
					
						case 67 : System.out.println(" 1st year students are not eligible for education scholarship ");
									break;

						case 72: System.out.println(" 2nd year students are not eligible for education scholarship ");
									break;

						case 90 : if( (year==3) && (marks> 75)) {

											 System.out.println("STudent is eligible for education scholarship ");
											}
										break;
					}

					
				}

				}
	}

O/p:
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ javac 06aug.java
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program2
ENter Student's year 
1
Enter marks of student 
90
1st year Student is not  eligible for education scholarship 
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ vim 06aug.java
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program2
ENter Student's year 
3
Enter marks of student 
78
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ vim 06aug.java
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ javac 06aug.java
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program2
ENter Student's year 
3
Enter marks of student 
90
STudent is eligible for education scholarship 
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ 

*/


/*
class program1 {

        public static void main(String[] args) {

                Scanner obj = new Scanner(System.in);
                int i ,j, month,y;11111
                System.out.println("ENter month number ");
                                month = obj.nextInt();


                                switch(month) {

                                  case 1 : System.out.println(" January has 31 days ");
				      		break;	   

                                  case 2 : System.out.println(" February has 28 days ( 29 in leap  year ) ");
				      		break;	   
                                                
                                  case 3 : System.out.println(" March has 31 days ");
				      		break;

                                  case 4 : System.out.println(" April has 31 days ");
				      		break;	 

                                  case 5 : System.out.println(" May has 3 days ");
				      		break;

                                  case 6 : System.out.println(" June has 30 days ");
				      		break;

                                  case 7 : System.out.println(" July has 31 days ");
				      		break;	 

                                  case 8 : System.out.println(" August has 31 days ");
				      		break;

                                  case 9 : System.out.println(" September has 30 days ");
				      		break;	

                                  case 10 : System.out.println(" October has 31 days ");
				      		break;	

                                  case 11 : System.out.println(" November has 30 days ");
				      		break;

                                  case 12 : System.out.println(" December has 31 days ");
				      		break;	   
                                }
        }
}
O/p:

ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program1
ENter month number
7
 July has 31 days
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java program1
ENter month number
8
 August has 31 days
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ javac 06aug.java
*/
