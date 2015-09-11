package com.island.timus.khundrend;

import java.util.Scanner;

public class T2005_Taxi_for_Programmers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] a = new int[6][6];
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < 6; j++) {
				a[i][j] = in.nextInt();
			}
		}
		int S1, S2, S3, S4;

		S1 = a[1][2] + a[2][3] + a[3][4] + a[4][5];
		S2 = a[1][3] + a[3][2] + a[2][4] + a[4][5];
		S3 = a[1][3] + a[3][4] + a[4][2] + a[2][5];
		S4 = a[1][4] + a[4][3] + a[3][2] + a[2][5];

		if (S1 <= S2 && S1 <= S3 && S1 <= S4) {
			System.out.println(S1);
			System.out.println("1 2 3 4 5");
		}

		else if (S2 <= S1 && S2 <= S3 && S2 <= S4) {
			System.out.println(S2);
			System.out.println("1 3 2 4 5");
		}

		else if (S3 <= S1 && S3 <= S2 && S3 <= S4) {
			System.out.println(S3);
			System.out.println("1 3 4 2 5");
		}

		else if (S4 <= S1 && S4 <= S2 && S4 <= S3) {
			System.out.println(S4);
			System.out.println("1 4 3 2 5");
		}

	}
}
