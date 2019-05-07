package Learn1;
import java.util.Scanner;
public class _12_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Type your name: ");
		String s = scan.next();
		System.out.print("Type your age: ");
		int i = scan.nextInt();
		System.out.println();
		System.out.println("Name: " + s);
		System.out.println("Age: " + i);


	}

}
