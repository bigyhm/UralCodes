package com.island.timus.bhundrend;

import java.util.Scanner;

public class T1110_Power {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int y = in.nextInt();
		int counter = 0;
		for (int i = 0; i < m; i++) {
			double power = 1;
			for (int j = 0; j < n; j++) {
				power = power * i % m;
			}
			double value = power % m;
			if (value == y) {
				counter++;
				System.out.print(i + " ");
			}
		}
		if (counter == 0) {
			System.out.print(-1);
		}

	}
}
