package module3;

import java.util.Scanner;

public class IfDemo3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter three numbers num1, num2, num3");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " is greatest number");
		} else if (num2 > num3 && num2 > num1) {
			System.out.println(num2 + " is greatest number");
		} else {
			System.out.println(num3 + " is greatest among 3 nos");
		}
	}
}
