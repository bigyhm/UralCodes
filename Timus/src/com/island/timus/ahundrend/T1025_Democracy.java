package com.island.timus.ahundrend;

import java.util.Scanner;

public class T1025_Democracy {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[101];
		int k = in.nextInt();
		for (int i = 0; in.hasNext(); i++) {
			arr[i] = in.nextInt();
		}
		SelectSort ss = new SelectSort();
		arr = ss.sort(arr,k);
		int m = k / 2 + 1;
		int sum = 0;
		for (int i = 0; i < m; i++) {
			sum = sum + arr[i] / 2 + 1;
		}
		System.out.println(sum);
	}
}

class SelectSort {
	public int[] sort(int[] arr, int k) {
		int temp = 0;
		int minIndex = 0;
		if (arr == null || arr.length == 0) {
			return arr;
		}
		for (int i = 0; i < k - 1; i++) {
			minIndex = i;
			for (int j = i+1; j < k; j++) {
				if (arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
		return arr;
	}
}
