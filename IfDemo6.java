package module3;

public class IfDemo6 {
	public static void main(String[] args) {

		int a = 100;
		int b = 200;
		int c = 300;
		if (a == b) {
			System.out.println(" a and b are same");
		} else if (a != b) {
			System.out.println("both are different");
		} else if (a > b || a > c) {
			System.out.println("any one of the condtion is true");
		} else {
			System.out.println("invalid input");
		}
	}
}
