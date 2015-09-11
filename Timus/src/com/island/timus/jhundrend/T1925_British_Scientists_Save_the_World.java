package com.island.timus.jhundrend;

import java.util.Scanner;

public class T1925_British_Scientists_Save_the_World {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int sumKey = 0;
		int sumInput = 0;
		for (int i = 0; i < n; i++) {
			sumKey = sumKey + in.nextInt();
			sumInput = sumInput + in.nextInt();
		}
		sumKey = sumKey + k;
		if (sumKey >= sumInput + 2 * (n + 1)) {
			System.out.println(sumKey - sumInput - 2 * (n + 1));
		} else {
			System.out.println("Big Bang!");
		}

	}
}
