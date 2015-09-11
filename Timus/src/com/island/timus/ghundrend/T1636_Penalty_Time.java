package com.island.timus.ghundrend;

import java.io.IOException;
import java.util.Scanner;

public class T1636_Penalty_Time {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner in = new Scanner(System.in);
		int t1 = in.nextInt();
		int t2 = in.nextInt();
		int[] rejects = new int[10];
		int value = 0;
		for (int i = 0; i < 10; i++) {
			rejects[i] = in.nextInt();
			value = value + 20 * rejects[i];
		}
		if (t2 - value >= t1) {
			System.out.println("No chance.");
		} else {
			System.out.println("Dirty debug :(");
		}

	}

}
