package com.island.timus.bhundrend;

import java.util.Scanner;

public class T1178_Akbardins_Roads {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int townNums = in.nextInt();
		long[][] locations = new long[townNums][3];
		for (int i = 0; i < townNums; i++) {
			locations[i][0] = in.nextInt();
			locations[i][1] = in.nextInt();
			locations[i][2] = i + 1;
		}
		quickSort(locations, 0, townNums - 1);

		for (int i = 0; i < townNums - 1; i++) {
			System.out.println(locations[i][2] + " " + locations[i + 1][2]);
			i++;
		}
	}

	private static void quickSort(long[][] arr, int low, int high) {
		if (low >= high) {
			return;
		}
		int i = low, j = high;
		long[] key = arr[i];
		while (i < j) {
			while (i < j && key[0] <= arr[j][0]) {
				if (key[0] == arr[j][0] && key[1] > arr[j][1]) {
					long key0 = key[0];
					long key1 = key[1];
					long key2 = key[2];

					key[0] = arr[j][0];
					key[1] = arr[j][1];
					key[2] = arr[j][2];

					arr[j][0] = key0;
					arr[j][1] = key1;
					arr[j][2] = key2;
				}
				j--;
			}
			arr[i][0] = arr[j][0];
			arr[i][1] = arr[j][1];
			arr[i][2] = arr[j][2];
			while (i < j && key[0] >= arr[i][0]) {
				if (key[0] == arr[i][0] && key[1] < arr[i][1]) {
					long key0 = key[0];
					long key1 = key[1];
					long key2 = key[2];

					key[0] = arr[i][0];
					key[1] = arr[i][1];
					key[2] = arr[i][2];

					arr[i][0] = key0;
					arr[i][1] = key1;
					arr[i][2] = key2;
				}
				i++;
			}
			arr[j][0] = arr[i][0];
			arr[j][1] = arr[i][1];
			arr[j][2] = arr[i][2];
		}
		arr[i][0] = key[0];
		arr[i][1] = key[1];
		arr[i][2] = key[2];

		quickSort(arr, low, i - 1);
		quickSort(arr, i + 1, high);
	}
}
