class Family {

	int laptop =1;
	int mob=1;
	static int  tv =1;


	 void ketan() {

	System.out.println("mob="+mob);
	
	System.out.println("laptop="+laptop);

	System.out.println("tv="+tv);
	}


	void vikas() {

	
	System.out.println("mob="+mob);
	
	System.out.println("laptop="+laptop);
	

	System.out.println("tv="+tv);

	

	}


	public static void main(String[] args) {
	
	Family obj1 = new Family();

	obj1.mob=0;
	obj1.laptop=0;	
	obj1.ketan();
	Family obj2 = new Family();
	obj2.vikas();

	}

}
