 class realme {

	static int no_of_devices_sold=150000;
	int series_no = 6;
	int cam_mp = 64;
	int price = 14999;
	int battery_capacity=4200;
	int processor = 90;

	void phoneKeySpecifications() {

	System.out.println("Device Name : Realme " +series_no);
	System.out.println("Camera Specifications(in MP) : " +cam_mp );
	System.out.println("Battery Capacity(in mAh typical) : " +battery_capacity );
	System.out.println("Processor Specs : MediaTek Helio G " +processor );
	System.out.println("T based on 12nm process");
	System.out.println("\r\n");

}

	void businessInfo() {

	System.out.println("Price starts at Rs "+price );
	System.out.println("Number of devices sold: \n" +no_of_devices_sold);
	System.out.println("\r\n");
	}
}
