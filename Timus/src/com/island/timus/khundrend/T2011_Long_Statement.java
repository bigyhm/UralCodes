package com.island.timus.khundrend;

import java.util.Scanner;

public class T2011_Long_Statement {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int a = 0;
		int b = 0;
		int c = 0;
		if (num <= 2) {
			System.out.println("No");
		} else {
			for (int i = 0; i < num; i++) {
				int value = in.nextInt();
				if (value == 1) {
					a++;
				} else if (value == 2) {
					b++;
				} else {
					c++;
				}
			}
			if (num == 3) {
				if (a == 1 && b == 1 && c == 1) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			} else if (num == 4) {
				if ((a == 2 && b == 2) || (a == 2 && c == 2) || (c == 2 && b == 2) || (a > 0 && b > 0 && c > 0)) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			} else if (num == 5) {
				if ((a >= 2 && b >= 2) || (a >= 2 && c >= 2) || (c >= 2 && b >= 2) || (a > 0 && b > 0 && c > 0)) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			} else {
				if ((a > 0 && b > 0) || (a > 0 && c > 0) || (c > 0 && b > 0)) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}

			}

		}

	}
}
