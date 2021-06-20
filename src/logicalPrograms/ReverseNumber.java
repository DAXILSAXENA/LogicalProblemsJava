package logicalPrograms;

import java.util.Scanner;

public class ReverseNumber {

	static int reverseNumberComputation(int num) {
		int rev_num = 0;
		while (num > 0) {
			rev_num = rev_num * 10 + num % 10;
			num = num / 10;
		}
		return rev_num;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to find its Reverse:");
		int number = scan.nextInt();
		reverseNumberComputation(number);
		System.out.println("Reverse of no. is " + reverseNumberComputation(number));
		scan.close();
	}
}