package com.island.timus.jhundrend;

import java.text.DecimalFormat;
import java.util.Scanner;

public class T1902_Neo_Venice {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int t = in.nextInt();
		int s = in.nextInt();
		DecimalFormat df = new DecimalFormat("#.00000");
		for (int i = 0; i < n; i++) {
			int value = in.nextInt();
			double time = (double) (t + value + s) / 2d;
			String res = df.format(time);
			System.out.println(res);
		}
	}
}
