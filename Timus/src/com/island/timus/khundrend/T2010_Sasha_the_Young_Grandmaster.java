package com.island.timus.khundrend;

import java.util.Scanner;

public class T2010_Sasha_the_Young_Grandmaster {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int x = in.nextInt();
		int y = in.nextInt();

		int king = 0;
		if ((x == 1 && y == 1) || (x == 1 && y == n) || (x == n && y == 1) || (x == n && y == n)) {
			king = 3;
		}
		if ((x == 1 && y != 1 && y != n) || (x == n && y != 1 && y != n) || (y == 1 && x != 1 && x != n) || (y == n && x != 1 && x != n)) {
			king = 5;
		}
		if (x > 1 && x < n && y > 1 && y < n) {
			king = 8;
		}
		System.out.println("King: " + king);
		int knight = 0;
		
		
	}
}
