
	class Core2Web {

	static int tot_student_count = 2500;
	int batch_student_count=0;

	void dispStudentCount() {

			System.out.println("\r\n");
	System.out.println("Total Student COunt = "+tot_student_count);
	System.out.println("Batch Student COunt = "+batch_student_count);
			System.out.println("\r\n");

}
	}

	class C2WAppAdmin {

		static int totallogincount=1200;
		int videocount=0;

		void dispStat() {
	
			System.out.println("\r\n");
			System.out.println("Total Login count ="+totallogincount);
			System.out.println("Video count ="+videocount);
			System.out.println("\r\n");

			}

}


	class Mentor {

	public static void main(String[] args) {

			Core2Web java9 = new Core2Web();
		       java9.batch_student_count=370;
	       		java9.dispStudentCount();	       

			Core2Web ppa5  = new Core2Web();
		       ppa5.batch_student_count=290;
	       		ppa5.dispStudentCount();
	 
       			C2WAppAdmin python1 = new C2WAppAdmin();
			python1.videocount=25;
			python1.dispStat();
			python1.totallogincount=1000;

       			C2WAppAdmin os = new C2WAppAdmin();
			os.videocount=150;
			os.dispStat();
	}			
	}

	
