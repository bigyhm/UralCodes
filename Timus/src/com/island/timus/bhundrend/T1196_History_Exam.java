package com.island.timus.bhundrend;

import java.util.Scanner;

public class T1196_History_Exam {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int counter = 0;
		long[] tList = new long[n];
		for (int i = 0; i < n; i++) {
			tList[i] = in.nextLong();
		}
		int m = in.nextInt();
		for (int i = 0; i < m; i++) {
			long stValue = in.nextLong();
			int isOrnot = find(tList, stValue);
			if (isOrnot == 1) {
				counter++;
			}
		}
		System.out.println(counter);
	}

	public static int find(long[] array, long value) {
		int low = 0;
		int high = array.length - 1;

		while (low <= high) {
			int middle = (low + high) / 2;
			if (array[middle] < value) {
				low = middle + 1;
			} else if (array[middle] > value) {
				high = middle - 1;
			} else {
				return 1;
			}
		}
		return -1;

	}

}
