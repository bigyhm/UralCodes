package com.island.timus.jhundrend;

import java.util.Scanner;

public class T1924_Four_Imps {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int re = ((n + 1) * n / 2) % 2;
		if (re == 1) {
			System.out.println("grimy");
		} else {
			System.out.println("black");
		}
	}
}
