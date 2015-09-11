package com.island.timus.ghundrend;

import java.util.Scanner;

public class T1688_Team_GOV {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		int times = in.nextInt();
		long all = 0;
		for (int i = 0; i < times; i++) {
			all = all + in.nextInt();
			float divied = (float) (all / 3.0);
			if (divied > n) {
				System.out.println("Free after " + (i + 1) + " times.");
				return;
			}
		}
		System.out.println("Team.GOV!");
	}
}
