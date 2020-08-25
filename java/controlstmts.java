class switchpgm2 {

	public static void main(String[] args) {
/*
		byte x = 128;

		switch(x) {

		case 128 : System.out.println("First Case");
			   break;

		case 2: System.out.println("Second Case");
	     		break;

		In case of byte error  will come up as :
			controlstmts.java:5: error: incompatible types: possible lossy conversion from int to byte
		byte x = 128;
		         ^
controlstmts.java:9: error: incompatible types: possible lossy conversion from int to byte
		case 128 : System.out.println("First Case");
		     ^
2 errors
ketan@ketan-tuf-fx505dt:~/java$

		}
		*/
				/*
				String s = new String("ketan");
				switch(s) {


                case "Ketan" : System.out.println("First Case");
                           break;
					case "ketan": System.out.println("Second Case");
                        				break;
				}
				*/

				boolean x  = true;
				switch(x) {


                case true : System.out.println("First Case");
                           break;
					case false: System.out.println("Second Case");
                        				break;
				}
	}

}
