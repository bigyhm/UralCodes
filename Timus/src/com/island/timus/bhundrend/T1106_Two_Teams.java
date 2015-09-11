package com.island.timus.bhundrend;

import java.util.Scanner;

public class T1106_Two_Teams {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int[] pre = new int[num + 1];
		for (int i = 0; i < num; i++) {
			int value = in.nextInt();
			while (value != 0) {
				pre[value] = i;
				value = in.nextInt();
			}
		}

	}
}
