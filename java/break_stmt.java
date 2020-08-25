class breakdemo {

	public static void main(String[] args) {

		int  i = 1;

		while(i<=50) {


			if( i%5==0 || i%7==0) {
				i++;
				break;
				}
			else{
				System.out.println(i);
				}
			i++;
			}

		System.out.println("COme out of the loop");

	}
}
