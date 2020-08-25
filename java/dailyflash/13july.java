/*
class Indian_Army {

	int cand1 = 500;
        static int sel1 = 100;
       static String training_area1 = "kanpur" ;
	static String state1 = "uttarpradesh";
	void selection1() {
	
		System.out.println(cand1+" `Candidates came for Indian Army Selection , out of which Number of candidates which got selected are "+sel1);
	}
	static void area1(){
	System.out.println("Training will be done in  "+ training_area1);
	System.out.println("State = "+ state1);
	System.out.println("\r\n");
	}

}       

class Indian_Navy {
        
	int cand2 = 400;
        static int sel2 = 150;
       static String training_area2 = "danapur" ;
	static String state2 = "bihar";
	void selection2() {
	
	System.out.println(cand2+" Candidates came for Indian Navy Selection , out of which Number of candidates which got selected are "+sel2);
	}
	static void area2() {
	System.out.println("Training will be done in  "+ training_area2);
	System.out.println("State = "+ state2);
	System.out.println("\r\n");
	}

}       
        
        
        
       


class Indian_Air_Force {
        
	int cand3 = 600;
        static int sel3 = 200;
        static String training_area3 = "ludhiana" ;
	static String state3 ="punjab";
	void selection3() {
	
	System.out.println(cand3+" Candidates came for Indian Air Force Selection , out of which Number of candidates which got selected are "+sel3);
	}
	static void area3(){
	System.out.println("Training will be done in "+ training_area3);
	System.out.println("State = "+ state3);
	System.out.println("\r\n");
	}
        

} 

class SenaBharti {

	public static void main(String[] args) {

	Indian_Air_Force obj3 = new Indian_Air_Force();
	obj3.selection3();
	obj3.area3();
	Indian_Navy obj2 = new Indian_Navy();
	obj2.selection2();
	obj2.area2();
	Indian_Army obj1 = new Indian_Army();
	obj1.selection1();
	obj1.area1();

	System.out.println("\r\n");
	
	}
}

O/p:
ketan@ketan-tuf-fx505dt:~/java/dailyflash$ java SenaBharti
600 Candidates came for Indian Air Force Selection , out of which Number of candidates which got selected are 200
Training will be done in ludhiana
State = punjab


400 Candidates came for Indian Navy Selection , out of which Number of candidates which got selected are 150
Training will be done in  danapur
State = bihar


500 Candidates came for Indian Army Selection , out of which Number of candidates which got selected are 100
Training will be done in  kanpur
State = uttarpradesh

*/
