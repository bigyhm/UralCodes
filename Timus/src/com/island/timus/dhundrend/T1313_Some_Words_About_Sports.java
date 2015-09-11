package com.island.timus.dhundrend;

import java.util.Scanner;

public class T1313_Some_Words_About_Sports {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int[][] pixels = new int[number][number];
		for (int i = 0; i < number; i++) {
			for (int j = 0; j < number; j++) {
				pixels[i][j] = in.nextInt();
			}
		}

		System.out.print(pixels[0][0] + " ");
		if (number != 1) {
			int p = 0, q = 0;
			int count = (number * number - number) / 2 + number;
			for (int k = 1; k < count; k++) {
				if (p == 0) {
					q++;
					p = q;
					q = 0;
				} else {
					p--;
					q++;
				}
				System.out.print(pixels[p][q] + " ");
			}
			p = 0;
			q = number - 1;
			for (int k = 1; k < number * number - count; k++) {
				if (q == number - 1) {
					p++;
					q = p;
					p = number - 1;
				} else {
					p--;
					q++;
				}
				System.out.print(pixels[p][q] + " ");
			}
			System.out.println(pixels[number - 1][number - 1]);
		}
	}

	private static void sort(int[] array) {
		int length = array.length;
		if (length <= 1) {
			return;
		}
		for (int i = 0; i < length - 1; i++) {
			int min = array[i];
			int k = i;
			for (int j = i + 1; j < length; j++) {
				if (min > array[j]) {
					min = array[j];
					k = j;
				}
			}
			int temp = array[i];
			array[i] = min;
			array[k] = temp;
		}

	}

	private static void quickSort(int[] array, int low, int high) {
		if (low >= high) {
			return;
		}
		int i = low, j = high;
		int key = array[low];
		while (i < j) {
			while (i <= j && key < array[j]) {
				j--;
			}
			array[i] = array[j];
			while (i < j && key > array[i]) {
				i++;
			}
			array[j] = array[i];
		}
		array[i] = key;
		quickSort(array, low, i - 1);
		quickSort(array, i + 1, high);
	}
}
