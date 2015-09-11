package com.island.timus.bhundrend;

import java.util.Scanner;

public class T1142_Relations {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int value = in.nextInt();
		while (value != -1) {
			int cal = 1;
			for (int j = value; j > 0; j--) {
				cal = cal * j;
			}
			cal = cal * (value - 1);
			cal = cal + 1;
			System.out.println(cal);
			value = in.nextInt();
		}
	}
}
