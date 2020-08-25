class LapSpec {

	int x =6;
	static int y =20;
	int z=30;


	void performance_spec(){
	System.out.println("Dual Channel 4GB LPDDR5 2666 MHz RAM");

	System.out.println("120 Hz IPS FHD Display");

	System.out.println("MIL-STD 810G");
	LapSpec obj2 = new LapSpec();

	System.out.println(obj2.x);
	System.out.println("6 Cores AMD RYZEN 5 3550H WITH RADEON  VEGA GFX");
	}

	static void GPU_SPEC() {

	System.out.println("4GB LPDDR5 NVIDIA GEFORCE 1650 GRAPHICS ");
	}




}
	class GFX {

		public static void main(String[] args) {
		LapSpec obj1 = new LapSpec();
		obj1.performance_spec();

		LapSpec.GPU_SPEC();
		}
	}
