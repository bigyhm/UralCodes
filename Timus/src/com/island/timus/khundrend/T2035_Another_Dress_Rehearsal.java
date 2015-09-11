package com.island.timus.khundrend;

import java.util.Scanner;

public class T2035_Another_Dress_Rehearsal {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long X = in.nextLong();
		long Y = in.nextLong();
		long C = in.nextLong();
		if (X + Y < C) {
			System.out.println("Impossible");
		} else {
			if (Y >= C) {
				System.out.println(0 + " " + C);
			} else if (X >= C) {
				System.out.println(C + " " + 0);
			} else {
				System.out.println(X + " " + (C - X));
			}
		}
	}
}
