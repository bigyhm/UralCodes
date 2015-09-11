package com.island.timus.fhundrend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class T1545_Hieroglyphs {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, "ISO-8859-1"));
		PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out, "ISO-8859-1"));

		int number = Integer.parseInt(reader.readLine());
		int[][] map = new int[number][number + 1];
		for (int i = 0; i < number; i++) {
			for (int j = 0; j < number + 1; j++) {
				map[i][j] = 0;
			}
		}

		for (int i = 0; i < number; i++) {
			String input = reader.readLine();
			char key = input.charAt(0);
			char value = input.charAt(1);
			int j = 0;
			for (; j < number; j++) {
				if (map[j][0] == 0 || map[j][0] == key) {
					map[j][0] = key;
					break;
				}
			}

			for (int k = 1; k < number + 1; k++) {
				if (map[j][k] == 0) {
					map[j][k] = value;
					break;
				}
			}
		}
		String pointer = reader.readLine();
		char po = pointer.charAt(0);

		int m = 0;
		for (; m < number; m++) {
			if (map[m][0] == po) {
				break;
			}
		}

		// sort
		if (m != number) {
			int[] map2 = new int[number];
			int length = 0;
			for (int i = 0; i < number; i++) {
				if (map[m][i + 1] != 0) {
					map2[i] = map[m][i + 1];
					length++;
				} else {
					break;
				}
			}

			quickSort(map2, 0, length - 1);

			if (length > 0) {
				for (int i = 0; i < length; i++) {
					char v = (char) map2[i];
					System.out.println(pointer + v);
				}
			} else {
				System.out.println("");
			}
		} else {
			System.out.println("");
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
