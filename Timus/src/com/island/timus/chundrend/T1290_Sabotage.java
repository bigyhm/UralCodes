package com.island.timus.chundrend;

import java.util.Scanner;

public class T1290_Sabotage {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int length = in.nextInt();
		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			array[i] = in.nextInt();
		}
		mergeSort(array);
		for (int i = length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}

	}

	public static void mergeSort(int[] array) {
		int length = array.length;
		int middle = length / 2;
		int[] left = new int[middle];
		int[] right = new int[length - middle];
		if (length > 1) {

			for (int i = 0; i < middle; i++) {
				left[i] = array[i];
			}

			for (int i = middle; i < length; i++) {
				right[i - middle] = array[i];
			}
			mergeSort(left);// 递归array的左半部分
			mergeSort(right);// 递归array的右半部分
			merge(array, left, right);// 数组左半部分、右半部分合并到Array

		}
	}

	// 合并数组，升序
	private static void merge(int[] result, int[] left, int[] right) {

		int i = 0, l = 0, r = 0;

		while (l < left.length && r < right.length) {

			if (left[l] < right[r]) {
				result[i] = left[l];
				i++;
				l++;
			} else {
				result[i] = right[r];
				i++;
				r++;
			}
		}

		while (r < right.length) {// 如果右边剩下合并右边的
			result[i] = right[r];
			r++;
			i++;
		}

		while (l < left.length) {
			result[i] = left[l];
			l++;
			i++;
		}
	}

}
