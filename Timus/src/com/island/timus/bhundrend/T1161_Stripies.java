package com.island.timus.bhundrend;

import java.text.DecimalFormat;
import java.util.Scanner;

public class T1161_Stripies {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		double[] arr = new double[num];
		for (int i = 0; i < num; i++) {
			arr[i] = in.nextInt();
		}
		quickSort(arr, 0, num - 1);
		DecimalFormat df = new DecimalFormat("#.00");
		int length = num - 1;
		while (length != 0) {
			double value = 2d * Math.sqrt(arr[length - 1] * arr[length]);
			length--;
			arr[length] = value;
			quickSort(arr, 0, length);
		}
		System.out.println(df.format(arr[0]));
	}

	private static void quickSort(double[] a, int low, int high) {
		if (low >= high) {
			return;
		}
		int i = low, j = high;
		double key = a[i];
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
