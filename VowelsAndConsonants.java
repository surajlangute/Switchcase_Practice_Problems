package switchcase.problems;

import java.util.Scanner;

public class VowelsAndConsonants {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any Alphabet : ");
		char alpha = scan.next().charAt(0);
		switch (alpha) {
		case 'a':
			System.out.println("Its a vovel ");
			break;
		case 'e':
			System.out.println("Its a vovel ");
			break;
		case 'i':
			System.out.println("Its a vovel ");
			break;
		case 'o':
			System.out.println("Its a vovel ");
			break;
		case 'u':
			System.out.println("Its a vovel ");
			break;
		default:
			System.out.println("Its a Consonant ");
			break;

		}
	}

}
