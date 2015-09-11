package com.island.timus.ahundrend;

import java.util.Scanner;

public class T1002_PhoneNumbers_1 extends Thread {

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
			if (result[0] != 0) {
				for (int j = 1; j < result[0]; j++) {
					System.out.print(originalDictionary[result[j + 1]] + " ");
				}
				System.out.println(originalDictionary[result[result[0] + 1]]);
			} else {
				System.out.println("No solution.");
			}
			phoneNumber = in.nextLine();
		}
		System.exit(0);
	}

	public static int[] getSolution(String phoneNumber, String[] dictionary) {
		int[][] solution = new int[2][phoneNumber.length() + 2];
		solution = runLoop(phoneNumber, dictionary, solution);
		return solution[0];
	}

	public static int[][] runLoop(String phoneNumber, String[] dictionary, int[][] solution) {
		String phoneNumberCopy = phoneNumber;
		int depth = solution[1][0];
		int position = solution[1][1];
		// 根据传入的路径，将号码切除
		for (int i = 0; i < depth; i++) {
			phoneNumber = phoneNumber.substring(dictionary[solution[1][i + 2]].length(), phoneNumber.length());
		}
		// 根据传入的位置，寻找号码的起始位置
		for (int j = position; j < dictionary.length; j++) {
			int m = depth + 2;
			if (phoneNumber.startsWith(dictionary[j])) {
				solution[1][m] = j;
				m = m + 1;
				solution[1][0]++;
				phoneNumber = phoneNumber.substring(dictionary[j].length(), phoneNumber.length());
				while (true) {
					int l = 0;

					if (phoneNumber.isEmpty()) {
						if (solution[0][0] == 0) {
							for (int o = 0; o < solution[1][0] + 2; o++) {
								solution[0][o] = solution[1][o];
							}
						} else if (solution[0][0] > solution[1][0]) {
							for (int o = 0; o < solution[1][0] + 2; o++) {
								solution[0][o] = solution[1][o];
							}
						}
						if (solution[1][0] >= 2) {
							if (solution[1][0] > solution[0][0]) {
								int position2 = solution[0][0];
								// The unexplored world
								solution[1][1] = solution[1][position2] + 1;
								solution[1][0] = solution[0][0] - 2;
							} else {
								int position2 = solution[1][0];
								// The unexplored world
								solution[1][1] = solution[1][position2] + 1;
								solution[1][0] = solution[1][0] - 2;
							}
							solution = runLoop(phoneNumberCopy, dictionary, solution);
						} else {
							return solution;
						}
						break;
					}
					for (l = 0; l < dictionary.length; l++) {
						if (phoneNumber.startsWith(dictionary[l])) {
							solution[1][m] = l;
							m = m + 1;
							solution[1][0]++;
							phoneNumber = phoneNumber.substring(dictionary[l].length(), phoneNumber.length());
							break;
						}
					}
					if (l == dictionary.length) {
						if (solution[1][0] >= 1) {
							int position2 = solution[1][0] + 1;
							// The unexplored world
							solution[1][1] = solution[1][position2] + 1;
							solution[1][0] = solution[1][0] - 1;
							solution = runLoop(phoneNumberCopy, dictionary, solution);
						} else {
							break;
						}
					} else {
						continue;
					}
				}
			}
		}
		return solution;
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
