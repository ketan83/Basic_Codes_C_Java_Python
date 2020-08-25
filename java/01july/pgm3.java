class CoronaMah {

	int count = 170000;

	void precaution() {

		System.out.println("Stay Safe");
		System.out.println("Count="+count);
	}

	static void impDecisions() {

System.out.println("CM's Decision");
	}

	public static void main(String[] args) {

	CoronaMah june28 = new CoronaMah();
	june28.precaution();
	impDecisions();

	CoronaMah june29 = new CoronaMah();
	june29.count=175000;
	june29.precaution();


	}






}
