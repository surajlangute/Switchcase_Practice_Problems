package switchcase.problems;

import java.util.Scanner;

public class CalculatorCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number 1 : ");
		int num1 = scan.nextInt();
		
		System.out.println("Enter number 2 : ");
		int num2 = scan.nextInt();
		
		System.out.println("Enter operator from : + , - , * , / ");
		String operator = scan.next();
		
		switch (operator) {
		case "+":
				System.out.println("Addition is : " + (num1 + num2));
				break;
		case "-":
				System.out.println("Subtraction is : " + (num1 - num2));
				break;
		case "*":
				System.out.println("Multiplication  is : " + (num1 * num2));
				break;
		case "/":
				System.out.println("Division  is : " + (num1 / num2));
			
							}
	}

}
