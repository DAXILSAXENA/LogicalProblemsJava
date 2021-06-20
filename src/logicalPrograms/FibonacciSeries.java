package logicalPrograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void fibonacciSeries(int element) {
		int number1 = 0, number2 = 1, number3;

		// printing 0 and 1
		System.out.print(number1 + " " + number2);

		// loop starts from 2 because 0 and 1 are already printed
		for (int i = 2; i < element; i++) {
			number3 = number1 + number2;
			System.out.print(" " + number3);
			number1 = number2;
			number2 = number3;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements you want to print in the fibonacci series: ");
		int element = scan.nextInt();
		fibonacciSeries(element);
		scan.close();
	}

}