package com.island.timus.jhundrend;

import java.util.Scanner;

public class T1935_Tears_of_Drowned {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = in.nextInt();
		}
		quickSort(arr, 0, num - 1);
		int p = arr[0];
		int sum = p;
		for (int i = 1; i < num; i++) {
			sum = sum + arr[i];
			p = arr[i];
		}
		sum = sum + p;
		System.out.println(sum);
	}

	private static void quickSort(int[] a, int low, int high) {
		if (low >= high) {
			return;
		}
		int i = low, j = high;
		int key = a[i];
		while (i < j) {
			while (i < j && key <= a[j]) {
				j--;
			}
			a[i] = a[j];

			while (i < j && key >= a[i]) {
				i++;
			}
			a[j] = a[i];
		}
		a[i] = key;
		quickSort(a, low, i - 1);
		quickSort(a, i + 1, high);
	}

}
