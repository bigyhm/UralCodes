package com.island.timus.bhundrend;

import java.util.Scanner;

public class T1149_Sinus_Dances {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();

		int fucked = 1;
		int counter = 0;
		while (true) {
			if (fucked <= k && fucked * 2 <= n) {
				fucked = fucked * 2;
				counter++;
			} else {
				break;
			}
		}

		int left = n - fucked;
		int leftleft = left % k;
		if (leftleft == 0) {
			counter = counter + left / k;
		} else {
			counter = counter + left / k + 1;
		}
		System.out.println(counter);
	}
}
