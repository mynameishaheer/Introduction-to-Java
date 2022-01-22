import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter your age: ");
		int age = Integer.parseInt( sc.next() );
		
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);		
	}
}
