package logicalPrograms;

import java.util.Scanner;

public class PerfectNumber {

	public static void perfectNumberCheck(int num) {
		int i = 1;
		int sum = 0;
		for (i = 1; i <= num / 2; i++) {
			if (num % i == 0)
				sum += i;
		}
		if (sum == num)
			System.out.println(num + " is a perfect number");
		else
			System.out.println(num + " is not a perfect number");

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("When the number is equal to the sum of its positive divisors excluding the number, it is called a Perfect Number:");
		System.out.println("Enter the number to check if it is Perfect number or not: ");
		int number = scan.nextInt();
		perfectNumberCheck(number);
		scan.close();

	}

}