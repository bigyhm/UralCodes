package com.island.timus.bhundrend;

import java.util.Scanner;

public class T1100_Final_Standings {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int length = in.nextInt();
		int[][] values = new int[2][length];
		for (int i = 0; i < length; i++) {
			values[0][i] = in.nextInt();
			values[1][i] = in.nextInt();
		}
		quickSort(values, 0, length - 1);
		for (int i = 0; i < length; i++) {
			System.out.print(values[0][length - i - 1] + " ");
			System.out.println(values[1][length - i - 1]);
		}
	}

	private static void quickSort(int[][] values, int start, int end) {
		if (start >= end) {
			return;
		}
		int i = start;
		int j = end;
		int keyNum = values[0][start];
		int key = values[1][start];

		while (i < j) {
			while (i < j && values[1][j] >= key) {
				j--;
			}
			values[0][i] = values[0][j];
			values[1][i] = values[1][j];
			while (i < j && values[1][i] <= key) {
				i++;
			}
			values[0][j] = values[0][i];
			values[1][j] = values[1][i];
		}
		values[0][i] = keyNum;
		values[1][i] = key;
		quickSort(values, start, i - 1);
		quickSort(values, i + 1, end);

	}

}
