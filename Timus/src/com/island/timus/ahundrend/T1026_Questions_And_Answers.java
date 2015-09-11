package com.island.timus.ahundrend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class T1026_Questions_And_Answers {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, "ISO-8859-1"));
		PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out, "ISO-8859-1"));

		int firstListNum = Integer.parseInt(reader.readLine());
		int[] database = new int[firstListNum];
		for (int i = 0; i < firstListNum; i++) {
			database[i] = Integer.parseInt(reader.readLine());
		}
		quickSort(database, 0, firstListNum - 1);
		reader.readLine();

		int secondListNum = Integer.parseInt(reader.readLine());
		for (int i = 0; i < secondListNum; i++) {
			int value = Integer.parseInt(reader.readLine());
			writer.print(database[value - 1]);
			writer.print("\n");
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
}
