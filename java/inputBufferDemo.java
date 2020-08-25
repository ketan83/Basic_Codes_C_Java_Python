import java.lang.io.*;


class InputProgram {

	public static void main(String[] args) {

	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br= new BufferedReader(isr);

	String input = br.readLine();
	System.out.println(input);
	}
}
