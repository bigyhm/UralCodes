package com.island.timus.ihundrend;

import java.util.Scanner;

public class T1820_Ural_Steaks {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		if (a < b) {
			System.out.println(2);
		} else {
			int c = a * 2 % b;
			if (c == 0) {
				System.out.println(a * 2 / b);
			} else {
				System.out.println(a * 2 / b + 1);
			}
		}
	}
}