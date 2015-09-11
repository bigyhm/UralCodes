package com.island.timus.ahundrend;

import java.util.Scanner;

public class T1022_Genealogical_Tree {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int lines = in.nextInt();
		lines++;
		int[][] path = new int[lines][lines];
		for (int i = 1; i < lines; i++) {
			for (int j = 1; j < lines; j++) {
				path[i][j] = Integer.MAX_VALUE;
			}
		}
		for (int i = 1; i < lines; i++) {
			int value = in.nextInt();
			while (value != 0) {
				path[i][value] = 1;
				value = in.nextInt();
			}
		}
		for (int i = 1; i < lines; i++) {
			for (int j = 1; j < lines; j++) {
				for (int k = 1; k < lines; k++) {
					if (path[i][j] != Integer.MAX_VALUE) {
						k = j;
					} else {

					}
				}

			}
		}
	}
}
