package com.island.timus.bhundrend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T1135_Recruits {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, "ISO-8859-1"));
		int num = Integer.parseInt(reader.readLine());
		int all = 0;
		String input = null;
		// Put the number of recruits in the [lines][0].
		boolean[] recruits = new boolean[num + 2];
		recruits[0] = true;
		recruits[num + 1] = false;
		while (all < num) {
			int be = all;
			input = reader.readLine();
			for (int j = 0; j < input.length(); j++) {
				recruits[be + j + 1] = (input.charAt(j) == '>' ? false : true);
				all++;
			}
		}

		int start = findStart(recruits, 0);
		int end = findEnd(recruits, num + 1);
		int counter = 0;
		while (true) {
			start = findStart(recruits, start);
			end = findEnd(recruits, end);
			int change = 0;
			for (int i = start; i <= end; i++) {
				while (recruits[i]) {
					i++;
				}
				if (i < end) {
					if (recruits[i + 1]) {
						recruits[i] = true;
						recruits[i + 1] = false;
						change++;
						counter++;
						i++;
					}
				}
			}

			if (change == 0) {
				break;
			}
		}
		System.out.println(counter);
	}

	private static int findStart(boolean[] recruits, int start) {
		int i = start;
		while (recruits[i]) {
			i++;
		}
		return i;
	}

	private static int findEnd(boolean[] recruits, int end) {
		int i = end;
		while (!recruits[i]) {
			i--;
		}
		return i;
	}
}