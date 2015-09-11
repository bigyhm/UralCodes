package com.island.timus.ghundrend;

import java.util.Scanner;

public class T1644_A_Whole_Lot_of_Walnuts {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int length = Integer.parseInt(in.nextLine());
		int[] all = new int[length];
		int small = -1;
		int big = length;
		for (int i = 0; i < length; i++) {
			String value = in.nextLine();
			String[] results = value.split(" ");
			int pa = Integer.parseInt(results[0]);
			String status = results[1];
			if (status.trim().equals("hungry")) {
				small++;
				all[small] = pa;
			} else {
				big--;
				all[big] = pa;
			}
		}
		quickSort(all, 0, small);
		quickSort(all, big, length - 1);
		if (length == 0) {
			System.out.println(10);
			return;
		} else if (small == -1) {
			if (all[big] <= 2) {
				System.out.println("Inconsistent");
			} else if (all[big] >= 10) {
				System.out.println(10);
			} else {
				System.out.println(all[big]);
			}
		} else if (big == length) {
			if (all[small] >= 10) {
				System.out.println("Inconsistent");
			} else {
				System.out.println(10);
			}
		} else {
			if (all[small] >= all[big]) {
				System.out.println("Inconsistent");
			} else if (all[big] <= 2) {
				System.out.println("Inconsistent");
			} else if (all[small] >= 10) {
				System.out.println("Inconsistent");
			} else if (all[big] >= 10) {
				System.out.println(10);
			} else {
				System.out.println(all[big]);
			}
		}
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
