package com.island.timus.bhundrend;

import java.util.Scanner;

public class T1197_Lonesome_Knight {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int groups = Integer.parseInt(in.nextLine());
		for (int i = 0; i < groups; i++) {
			String value = in.nextLine().trim();
			int height = value.charAt(0) - 'a';
			int length = Integer.parseInt(value.charAt(1) + "");
			int counter = 0;
			if (length - 2 >= 1) {
				if (height >= 1) {
					counter++;
				}
				if (height <= 6) {
					counter++;
				}
			}
			if (length + 2 <= 8) {
				if (height >= 1) {
					counter++;
				}
				if (height <= 6) {
					counter++;
				}
			}

			if (height - 2 >= 0) {
				if (length >= 2) {
					counter++;
				}
				if (length <= 7) {
					counter++;
				}
			}

			if (height + 2 <= 7) {
				if (length >= 2) {
					counter++;
				}
				if (length <= 7) {
					counter++;
				}
			}
			System.out.println(counter);
		}
	}
}
