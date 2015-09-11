package com.island.timus.ghundrend;

import java.io.IOException;
import java.util.Scanner;

public class T1639_Chocolate2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();

		int value = m * n - 1;
		int re = value % 2;
		if (re == 1) {
			System.out.println("[:=[first]");
		} else {
			System.out.println("[second]=:]");
		}

	}
}
