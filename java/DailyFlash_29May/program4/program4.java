class T20 {

	static String capt="Rohit Sharma";
	int toss=0;


	static void list() {

	System.out.println("Player lists");
	
	System.out.println(capt);
	T20 obj1 = new T20();
	System.out.println(obj1.toss);

	}


	void BatorBowl() {

	
	System.out.println("Decision");

	System.out.println(capt);

	System.out.println(toss);
	

	}


	public static void main(String[] args) {
	
	list();
	T20 obj = new T20();
	obj.BatorBowl();

	}

}
