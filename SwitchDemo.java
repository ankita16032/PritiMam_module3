package module3;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		switch (num) {
		case 5:
			System.out.println("Movie Time");
			break;
		case 6:
			System.out.println("Super saturday");
			break;
		case 7:
			System.out.println("Sleepy sunday");
			break;
		default:
			System.out.println("working day");

		}
	}
}
