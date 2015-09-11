package com.island.timus.ahundrend;

import java.util.Scanner;

public class T1087_Time_Take_Stone {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int totalNum = in.nextInt();
		int count = in.nextInt();
		int[] arr = new int[count];
		for (int i = 0; i < count; i++) {
			arr[i] = in.nextInt();
		}
		int[] f = new int[totalNum + 1];
		f[1] = 0;
		for (int i = 2; i < totalNum + 1; i++) {
			f[i] = 0;
			for (int j = 0; j < arr.length; j++) {
				if ((i > arr[j]) && (f[i - arr[j]] == 0)) {
					f[i] = 1;
					break;
				}
			}
		}
		System.out.println(f[totalNum] == 0 ? 2 : 1);

	}
}
