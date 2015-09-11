package com.island.timus.chundrend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T1203_Scientific_Conference {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, "ISO-8859-1"));

		int lineNum = Integer.parseInt(reader.readLine());
		int max = 0;
		int[][] meetings = new int[lineNum][2];
		int[] weights = new int[lineNum];
		for (int i = 0; i < lineNum; i++) {
			String startEnd = reader.readLine();
			String[] nums = startEnd.split(" ");
			meetings[i][0] = Integer.parseInt(nums[0]);
			meetings[i][1] = Integer.parseInt(nums[1]);
			weights[i] = meetings[i][1] - meetings[i][0];
			if (max < meetings[i][1]) {
				max = meetings[i][1];
			}
		}

		int[][] longestTime = new int[2][max + 1];
		for (int k = 0; k < lineNum; k++) {
			for (int i = 1; i <= max; i++) {
				if (longestTime[1][i] == 0) {
					if (meetings[k][1] == i) {
						longestTime[0][i] = getMax(longestTime[0][i - weights[k]] + 1, longestTime[1][i]);
						if (i + 1 < max) {
							longestTime[0][i + 1] = longestTime[0][i];
							i++;
						}
					}
				} else {
					if (meetings[k][1] <= i + 1) {
						longestTime[0][i] = getMax(longestTime[0][i - weights[k]] + 1, longestTime[1][i]);
						if (i + 1 < max) {
							longestTime[0][i + 1] = longestTime[0][i];
							i++;
						}
					}
				}
			}

			for (int i = 0; i < max + 1; i++) {
				longestTime[1][i] = longestTime[0][i];
			}

		}

		System.out.println(longestTime[1][lineNum - 1]);

	}

	private static int getMax(int calcultoredValue, int orginalValue) {
		int max = calcultoredValue;
		if (max < orginalValue) {
			max = orginalValue;
		}
		return max;
	}
}
