package com.island.timus.bhundrend;

import java.util.Scanner;

public class T1100_Final_Standings_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int length = in.nextInt();
		int[][] values = new int[2][length];
		for (int i = 0; i < length; i++) {
			values[0][i] = in.nextInt();
			values[1][i] = in.nextInt();
		}
		mergeSort(values);
		for (int i = 0; i < length; i++) {
			System.out.print(values[0][length - i - 1] + " ");
			System.out.println(values[1][length - i - 1]);
		}
	}

	public static void mergeSort(int[][] array) {

		int length = array[1].length;
		int middle = length / 2;
		int[][] left = new int[2][middle];
		int[][] right = new int[2][length - middle];
		if (length > 1) {

			for (int i = 0; i < middle; i++) {
				left[0][i] = array[0][i];
				left[1][i] = array[1][i];
			}

			for (int i = middle; i < length; i++) {
				right[0][i - middle] = array[0][i];
				right[1][i - middle] = array[1][i];
			}
			mergeSort(left);// 递归array的左半部分
			mergeSort(right);// 递归array的右半部分
			merge(array, left, right);// 数组左半部分、右半部分合并到Array

		}
	}

	// 合并数组，升序
	private static void merge(int[][] result, int[][] left, int[][] right) {

		int i = 0, l = 0, r = 0;

		while (l < left[1].length && r < right[1].length) {

			if (left[1][l] < right[1][r]) {
				result[1][i] = left[1][l];
				result[0][i] = left[0][l];
				i++;
				l++;
			} else {
				result[1][i] = right[1][r];
				result[0][i] = right[0][r];
				i++;
				r++;
			}
		}

		while (r < right[1].length) {// 如果右边剩下合并右边的
			result[1][i] = right[1][r];
			result[0][i] = right[0][r];
			r++;
			i++;
		}

		while (l < left[1].length) {
			result[1][i] = left[1][l];
			result[0][i] = left[0][l];
			l++;
			i++;
		}
	}

}
