// program to get sum of digits of the inputted number

class whiledemo {

        public static void main(String[] args) {

        int sum=0, num =247;

	//135 % 10 = 5
	//135 /10 = 13
	//13 % 10 =3
	//13 /10 = 1
	//1 % 10 =1
	//1  /10 = 1
	
	int rem =0;
        while(num!=0){  

	rem = num %10;

	sum  =sum + rem;

	num = num / 10;

                
        }
	System.out.println("Sum is  "+sum);
}
}
