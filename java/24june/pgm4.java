// a code to create infinite no. of stacks(threads) in java without loop or recursion

class MyThread extends Thread {

	public void run() {

	System.out.println(Thread.currentThread().getName());
	MyThread t = new MyThread();
	t.start();
	}
}


	class Demo {
	
		public static void main(String[] args) {

			MyThread t = new MyThread();
			t.start();
		}

	}
