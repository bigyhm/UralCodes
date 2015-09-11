package com.island.timus.ahundrend;

import java.util.Scanner;

public class T1002_PhoneNumbers_2 {
	public static int[] keys = { 2, 2, 2, 3, 3, 3, 4, 4, 1, 1, 5, 5, 6, 6, 0, 7, 0, 7, 7, 8, 8, 8, 9, 9, 9, 0 };

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String phoneNumber = in.nextLine();

		while (!phoneNumber.equals("-1")) {
			int k = Integer.parseInt(in.nextLine());
			String[] originalDictionary = new String[k];
			String[] dictionary = new String[k];
			for (int j = 0; j < k; j++) {
				originalDictionary[j] = in.nextLine();
				dictionary[j] = getKey(originalDictionary[j]);
			}
			int[] result = getSolution(phoneNumber, dictionary);
			if (result != null) {
				int j = 0;
				for (; j < result.length - 1; j++) {
					System.out.print(originalDictionary[result[j]] + " ");
				}
				System.out.println(originalDictionary[result[j]]);
			} else {
				System.out.println("No solution.");
			}
			phoneNumber = in.nextLine();
		}
		System.exit(0);
	}

	private static int[] getSolution(String phoneNumber, String[] dictionary) {
		int pnLength = phoneNumber.length();
		int[][] solution = new int[2][pnLength + 1];
		solution[0][0] = 0;
		for (int i = 1; i < pnLength + 1; i++) {
			solution[0][i] = pnLength + 1;
		}
		for (int i = 0; i < pnLength; i++) {
			for (int j = 0; j < dictionary.length; j++) {
				int n = dictionary[j].length();
				if (pnLength - i < n || !dictionary[j].equals(phoneNumber.substring(i, n + i))) {
					continue;
				} else {
					if (solution[0][i + n] <= solution[0][i] + 1) {
						continue;
					} else {
						solution[0][i + n] = solution[0][i] + 1;
						solution[1][i + n] = j;
					}
				}
			}
		}
		if (solution[0][pnLength] > pnLength) {
			return null;
		}

		int[] result = new int[solution[0][pnLength]];

		for (int i = result.length; i > 0; i--) {
			result[i - 1] = solution[1][pnLength];
			pnLength = pnLength - dictionary[solution[1][pnLength]].length();
		}
		return result;
	}

	public static String getKey(String input) {

		String result = "";
		for (int i = 0; i < input.length(); i++) {
			int value = keys[input.charAt(i) - 'a'];
			result = result + value;
		}
		return result;
	}

}
