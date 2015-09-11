package com.island.timus.jhundrend;

import java.util.Scanner;

public class T1910_Titan_Ruins_Hidden_Entrance {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int length = in.nextInt();
		int[] arr = new int[length];
		int max = Integer.MIN_VALUE;
		int middle = 0;
		for (int i = 0; i < length; i++) {
			arr[i] = in.nextInt();
		}
		for (int i = 0; i <= length - 3; i++) {
			int value = arr[i] + arr[i + 1] + arr[i + 2];
			if (value > max) {
				max = value;
				middle = i + 1;
			}
		}

		System.out.print(max + " ");
		System.out.println(middle + 1);
	}

}
