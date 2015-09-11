package com.island.timus.ahundrend;

import java.util.Scanner;

public class T1005_Stone_Pile_2 {

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
		int solutionSum = weights[count - 1];
		solution[0] = solutionSum;
		discrepancy[0] = middle - solutionSum;
		for (int i = count - 2, j = 1; i >= 0 && discrepancy[j - 1] > 0; i--, j++) {
			i = getNextI(weights, discrepancy[j - 1], i);
			if (i == -1) {
				break;
			}
			solutionSum = solutionSum + weights[i];
			solution[j] = solutionSum;
			discrepancy[j] = middle - solutionSum;
			cursor = j;
		}
		System.out.println(Math.abs(sum - 2 * solution[cursor]));
		return;
	}

	private static int getNextI(int[] weights, int iValue, int length) {
		int i = 0;
		for (i = 0; i <= length; i++) {
			if (iValue >= weights[i]) {
				continue;
			} else {
				break;
			}
		}
		if (i >= 1) {
			if (iValue >= weights[i - 1]) {
				return i - 1;
			}
		}
		return -1;
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
