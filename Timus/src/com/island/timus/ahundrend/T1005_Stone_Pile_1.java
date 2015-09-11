package com.island.timus.ahundrend;

import java.util.Scanner;

public class T1005_Stone_Pile_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		int[] weights = new int[count];

		for (int i = 0; i < count; i++) {
			weights[i] = in.nextInt();
		}
		weights = selectSort(weights);
		int sum = 0;

		for (int i = 0; i < count; i++) {
			sum = sum + weights[i];
		}
		int middle = sum / 2;
		int[] solution = new int[count];
		int[] discrepancy = new int[count];

		int cursor = 0;
		int cursor2 = 0;
		int solutionSum = 0;
		for (int i = count - 1, j = 0; i > 0; i--, j++) {
			solutionSum = solutionSum + weights[i];
			solution[j] = solutionSum;
			discrepancy[j] = solutionSum - middle;
			if (discrepancy[j] >= 0) {
				cursor = j;
				break;
			}
		}

		if (cursor == 0 || discrepancy[cursor] == 0) {
			System.out.println(Math.abs(sum - 2 * solution[cursor]));
			return;
		} else {
			solutionSum = solution[cursor - 1];
			for (int i = 0, j = cursor + 1; i < count; i++, j++) {
				solutionSum = solutionSum + weights[i];
				solution[j] = solutionSum;
				discrepancy[j] = solutionSum - middle;
				if (discrepancy[j] >= 0) {
					cursor2 = j;
					break;
				}
			}
		}
		if (discrepancy[cursor2] == 0) {
			System.out.println(Math.abs(sum - 2 * solution[cursor]));
			return;
		} else {
			int minIndex = cursor;
			if (Math.abs(discrepancy[minIndex]) >= Math.abs(discrepancy[cursor - 1])) {
				minIndex = cursor - 1;
			}
			if (Math.abs(discrepancy[minIndex]) >= Math.abs(discrepancy[cursor2])) {
				minIndex = cursor2;
			}
			if (Math.abs(discrepancy[minIndex]) >= Math.abs(discrepancy[cursor2 - 1])) {
				minIndex = cursor2 - 1;
			}
			System.out.println(Math.abs(sum - 2 * solution[minIndex]));
			return;
		}
	}

	private static int[] selectSort(int[] arr) {
		int min = 0;
		int temp = 0;
		if (arr == null || arr.length == 0) {
			return null;
		}
		for (int i = 0; i < arr.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			if (min != i) {
				temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
		return arr;
	}
}
