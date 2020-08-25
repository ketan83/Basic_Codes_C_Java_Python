class kutumb {  

	int mob  =1;
	int laptop =1;
	static int tv =1 ;


	void display() {

	System.out.println("Instance Display");


	}


	static void staticdisplay() {

	System.out.println("Static Display");

	}

	public static void main(String[] args) {

	kutumb obj1 = new kutumb();
	obj1.display();
	obj1.staticdisplay();

	kutumb obj2 =new kutumb();
	obj2.display();
	obj2.staticdisplay();


	}
}	
