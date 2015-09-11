package com.island.timus.hhundrend;

import java.util.Scanner;

public class T1712_Cipher_Grille {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] position = new int[4][2];
		char[][] keys = new char[4][4];
		int k = 0;
		for (int i = 0; i < 4; i++) {
			String value = in.nextLine();
			for (int j = 0; j < 4; j++) {
				if (value.charAt(j) == 'X') {
					position[k][0] = i;
					position[k][1] = j;
					k++;
				}
			}
		}

		for (int i = 0; i < 4; i++) {
			String value = in.nextLine();
			for (int j = 0; j < 4; j++) {
				keys[i][j] = value.charAt(j);
			}
		}

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 4; j++) {
				System.out.print(keys[position[j][0]][position[j][1]] + "");
			}

			for (int m = 0; m < 4; m++) {
				int tmp = position[m][0];
				position[m][0] = position[m][1];
				position[m][1] = 3 - tmp;
			}
			sort(position);
		}
		System.out.print("\n");
	}

	private static void sort(int[][] position) {

		for (int i = 0; i < 3; i++) {
			int minI = position[i][0];
			int minJ = position[i][1];
			for (int j = i + 1; j < 4; j++) {
				if (minI < position[j][0]) {
					continue;
				} else if (minI == position[j][0]) {
					if (minJ > position[j][1]) {
						int tmp = minJ;
						minJ = position[j][1];
						position[j][1] = tmp;
					}
				} else {
					int tempI = minI;
					int tempJ = minJ;
					minI = position[j][0];
					minJ = position[j][1];
					position[j][0] = tempI;
					position[j][1] = tempJ;
				}
			}
			position[i][0] = minI;
			position[i][1] = minJ;
		}
	}

}
