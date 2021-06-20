package logicalPrograms;

import java.util.*;

public class CouponNumber {
	int num;
	int arr[] = new int[1000];

	void generateCouponNumber() {
		int count = 0;
		for (int i = 1; i <= num; i++) {

			arr[i] = (int) (Math.floor(Math.random() * 900) + 100);
			int temp = arr[i];
			for (int j = 0; j < i; j++) {
				if (arr[j] == temp) {
					i--;

				}
			}
			count++;

		}
		for (int k = 1; k < num; k++) {
			System.out.println(arr[k]);
		}
		System.out.println("Total number of counts require to generate " + num + " different coupon numbers are " + count);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many different 3 digit coupons you want");
		CouponNumber object = new CouponNumber();
		object.num = scan.nextInt();
		object.generateCouponNumber();
		scan.close();
	}
}
