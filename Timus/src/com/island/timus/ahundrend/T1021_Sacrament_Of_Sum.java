package com.island.timus.ahundrend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class T1021_Sacrament_Of_Sum {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, "ISO-8859-1"));
		PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out, "ISO-8859-1"));

		int firstListNum = Integer.parseInt(reader.readLine());
		int[] firstArray = new int[firstListNum];
		for (int i = 0; i < firstListNum; i++) {
			int value = Integer.parseInt(reader.readLine());
			firstArray[i] = value;
		}

		int secondListNum = Integer.parseInt(reader.readLine());
		int[] secondArray = new int[secondListNum];
		for (int i = 0; i < secondListNum; i++) {
			int value = Integer.parseInt(reader.readLine());
			secondArray[i] = value;
		}
		int counter = 0;

		if (firstListNum <= secondListNum) {
			quickSort(secondArray, 0, secondListNum - 1);
			for (int i = 0; i < firstListNum; i++) {
				int needed = 10000 - firstArray[i];
				boolean ff = partFind(secondArray, 0, secondListNum - 1, needed);
				if (ff) {
					counter++;
					break;
				}
			}
		} else {
			quickSort(firstArray, 0, firstListNum - 1);
			for (int i = 0; i < secondListNum; i++) {
				int needed = 10000 - secondArray[i];
				boolean ff = partFind(firstArray, 0, firstListNum - 1, needed);
				if (ff) {
					counter++;
					break;
				}
			}
		}

		if (counter >= 1) {
			writer.print("YES");
		} else {
			writer.print("NO");
		}
		writer.flush();
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

	private static boolean partFind(int[] arr, int low, int high, int value) {
		if (low > high) {
			return false;
		}
		int middle = (low + high) / 2;
		if (arr[middle] == value) {
			return true;
		} else if (arr[middle] > value) {
			return partFind(arr, low, middle - 1, value);
		} else {
			return partFind(arr, middle + 1, high, value);
		}
	}
}
