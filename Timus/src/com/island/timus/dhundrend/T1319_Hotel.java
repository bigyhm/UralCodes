package com.island.timus.dhundrend;

import java.util.Scanner;

public class T1319_Hotel {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] a = new int[n][n];
		a[0][0] = 1;
		int counter = 1;
		counter++;
		int i = 0, j = 0;

		while (true) {
			if (i == n - 1 && j == 0) {
				break;
			}
			if (j == 0) {
				j = i + 1;
				i = 0;
				a[i][j] = counter;
				counter++;
			} else {
				j--;
				i++;
				a[i][j] = counter;
				counter++;
			}
		}

		while (true) {
			if (i == n - 1 && j == n - 1) {
				break;
			}
			if (i == n - 1) {
				int tmp = j;
				j = i;
				i = tmp + 1;
				a[i][j] = counter;
				counter++;
			} else {
				j--;
				i++;
				a[i][j] = counter;
				counter++;
			}
		}

		for (i = 0; i < n; i++) {
			for (j = n - 1; j >= 0; j--) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}

	}
}
