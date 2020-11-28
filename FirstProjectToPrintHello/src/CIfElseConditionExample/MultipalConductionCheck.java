package CIfElseConditionExample;

public class MultipalConductionCheck {

	public static void main(String[] args) {

		int a = 55;
		if (a <= 10) {
			System.out.println("line on One");
		}

		else if (a >= 10 && a <= 30) {
			System.out.println("line on Two");
		}
		else if (a >= 30 && a <= 80) {
			System.out.println("Line on Three");
		}
		else if (a <= 80 && a > 80) {
			System.out.println("Line on Four and Final Line is that");
		}

		else {
			System.out.println("Mula Ramrari Hereraa haan");
		}

	}

}
