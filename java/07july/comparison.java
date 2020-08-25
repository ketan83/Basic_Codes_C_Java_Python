class stats {

	public static void main (String[] args){

	realme pune = new realme();
	pune.phoneKeySpecifications();
	pune.businessInfo();
	redmi mumbai = new redmi();
	mumbai.phoneKeySpecifications();
	mumbai.no_of_devices_sold=170000;
	mumbai.businessInfo();

	System.out.println("\r\n");

	redmi chennai = new redmi();
	chennai.phoneKeySpecifications();
	chennai.businessInfo();
	realme bangalore = new realme();
	bangalore.phoneKeySpecifications();
	bangalore.no_of_devices_sold=190000;
	bangalore.businessInfo();




	}




}
