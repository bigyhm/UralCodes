package com.island.timus.dhundrend;

import java.util.Scanner;

public class T1327_Fuses {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();

		int first = a / 2;
		int second = 0;

		if (b % 2 == 1) {
			second = b / 2 + 1;
			System.out.println(second - first);
		} else {
			second = b / 2;
			System.out.println(second - first);
		}

	}
}
