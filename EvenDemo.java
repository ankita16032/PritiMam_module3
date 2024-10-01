package module3;

import java.util.Scanner;

public class EvenDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		num=2;
		while(num<=20)
		{
			if(num%2==0)
			System.out.println(num+" is odd no");
			num++;
		}
	}
}
