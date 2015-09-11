package com.island.timus.khundrend;

import java.util.Scanner;

public class T2012_About_Grisha_N {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int value = in.nextInt();
		int left = (12 - value) * 3;
		if (left <= 16) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}
}
