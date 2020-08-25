/*

class ifstmt {

	public static void main(String[] args) {

	int x =10 ,y=20;

	if ( x<y) {

	System.out.println(x+" is smaller");

	}

	System.out.println("Out of if");

	}


}
*/
/*
	class ifDemo   {

	public static void main(String[] args) {

		int x =10,y=20;

		if(x++>=10) {

		System.out.println(x+ "  is bigger ");

		}



	}


	}
*/


class logicalif {

	public static void main(String[] args) {
	int  x = 10 ;
	int y = 10;

	if( ++x <= --y) {

		System.out.println(" In if stmt ");
		System.out.println(x+" value of x ");
		System.out.println(y+" value of y");
	}
	else{
	
		System.out.println(" In else stmt ");
		System.out.println(x+" value of x ");
		System.out.println(y+" value of y");
	}
	}


}
