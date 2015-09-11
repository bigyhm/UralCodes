package com.island.timus.fhundrend;

import java.util.Scanner;

public class T1581_Teamwork {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int[][] arr = new int[2][2 * num];
		arr[0][0] = in.nextInt();
		arr[1][0] = 1;
		int currentCount = 0;
		for (int i = 1; i < num; i++) {
			int value = in.nextInt();
			if (value != arr[0][currentCount]) {
				currentCount++;
				arr[0][currentCount] = value;
				arr[1][currentCount] = 1;
			} else {
				arr[1][currentCount]++;
			}
		}

		for (int i = 0; i <= currentCount; i++) {
			System.out.print(arr[1][i] + " " + arr[0][i] + " ");
		}
	}

}
