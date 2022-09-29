package switchcase.problems;

import java.util.Scanner;

public class OddEvenCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = scan.nextInt();

		switch (num % 2) {
		case 0:
				System.out.println(num +" is Even ..");
				break;
		case 1:
				System.out.println(num +" is Odd..");
						}
	}
}
