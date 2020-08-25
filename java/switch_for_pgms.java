class switch1 {

	public static void main(String[] args ) {
	int floor = 2;

	switch(floor) {

	case 1 : {

			char ch = 'S'; // S =shopping  , F =food

			switch(ch) {

				case 'S' : 

				case's' : System.out.println("Shopping ");
				  		break;

				case 'F' : 

				case 'f' : System.out.println("Nusta Khayacha");
				 		break;

				default : System.out.println(" Service Not Available ");
			       			break;
			}
	}
			break;

	case 2: {
		
			char ch = 'M'; // M = Movie   , P = Playstation

			switch(ch) {

				case 'M' : 

				case'm' : System.out.println("Nepal ");
				  		break;

				case 'P' : 

				case 'p' : System.out.println("GTA V");
				 		break;

				default : System.out.println(" Service Not Available ");
			       			break;
			}
	}
			break;

	case 3 : System.out.println("Service Not Available ");
		 break ;
	}
	}
}
