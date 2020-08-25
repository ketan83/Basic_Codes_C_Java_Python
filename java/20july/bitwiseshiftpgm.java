class BitwiseShift {

 public static void main(String[] args) {

	int num1 =-12;
//	int res  = num1<<2;

//	System.out.println(res);  //-48 , Bitwise Left Shift 

	int num2 =95;
	int res  = num2>>4;      // bitwise right shift

	System.out.println(res);  // 5

	int num3 =-95;
	int res1  = num3>>4;    // bitwise right shift

	System.out.println(res1);  //- 5

	int num4 =-125;
	int res2  = num4>>4;       // bitwise right  shift pe jo bahar jayega wo discard ho jayega

	System.out.println(res2);  //- 8

	int num5 =20;
	int res3  = num5>>>2;       // bitwise  unsigned right  shift pe jo bahar jayega wo discard ho jayega

	System.out.println(res3);  // 5

	int num6 = -35;
	int res4  = num4>>>25;       // bitwise  unsigned right  shift pe jo bahar jayega wo discard ho jayega

	System.out.println(res4);  //num>>5= 134217724 , num>>25=

 }


}
