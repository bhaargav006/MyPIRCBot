import java.io.*;
import java.util.Scanner;


public class temp {

	
	public static void main(String[] args) throws IOException {
		Scanner s=new Scanner(System.in);
		int a;
		a=s.nextInt();
		System.out.println("A is: " + a);
		PrintWriter fw=new PrintWriter("temp.txt");
		fw.println(a);
		fw.close();
		s.close();
	}

}
