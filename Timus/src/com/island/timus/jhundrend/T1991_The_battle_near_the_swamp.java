package com.island.timus.jhundrend;

import java.util.Scanner;

public class T1991_The_battle_near_the_swamp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int leftBooms = 0;
		int leftDroids = 0;

		for (int i = 0; i < n; i++) {
			int booms = in.nextInt();
			if (booms >= k) {
				leftBooms = leftBooms + booms - k;
			} else {
				leftDroids = leftDroids + k - booms;
			}
		}
		System.out.println(leftBooms + " " + leftDroids);
	}
}
