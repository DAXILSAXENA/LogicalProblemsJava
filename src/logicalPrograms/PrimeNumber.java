package logicalPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void checkPrime(int number) {
		boolean flag = true;
		if (number == 1 || number == 0)
			flag = false;
		else {
			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0)
					flag = false;
			}
		}

		if (flag == false)
			System.out.println(number + " is not a prime number.");
		else
			System.out.println(number + " is a prime number.");
	}

	public static void main(String[] args) {
		System.out.print("Enter a positive number to find whether it is prime or not: ");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		checkPrime(number);
		scan.close();

	}

}