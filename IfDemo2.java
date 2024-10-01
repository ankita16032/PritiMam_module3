package module3;

import java.util.Scanner;

public class IfDemo2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers as num1 and num2: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		if (num1 > num2) {
			System.out.println(num1 + " is greatest no");
		} else if (num1 < num2) {
			System.out.println(num2 + " is greatest no");
		} else {
			System.out.println("numbers are same");
		}
	}
}
