 class redmi {

	static int no_of_devices_sold=130000;
	int series_no = 9;
	int cam_mp = 48;
	int price = 14999;
	int battery_capacity=5000;
	int processor = 720;

	void phoneKeySpecifications() {

	System.out.println("Device Name : Redmi Note " +series_no);
	System.out.println("Camera Specifications(in MP) : " +cam_mp );
	System.out.println("Battery Capacity(in mAh typical) : " +battery_capacity );
	System.out.println("Processor Specs : Qualcomm Snapdragon " +processor );
	System.out.println("G series based on 8nm process");
	System.out.println("\r\n");

}

	void businessInfo() {

	System.out.println("Price starts at Rs "+price );
	System.out.println("Number of devices sold: " +no_of_devices_sold);
	System.out.println("\r\n");
	}
}
