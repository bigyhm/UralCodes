package com.island.timus.chundrend;

import java.text.DecimalFormat;
import java.util.Scanner;

public class T1263_Elections {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int candiCount = in.nextInt();
		int[] candiVotes = new int[candiCount];
		for (int i = 0; i < candiCount; i++) {
			candiVotes[i] = 0;
		}
		int elecNum = in.nextInt();
		for (int i = 0; i < elecNum; i++) {
			int candiNum = in.nextInt();
			candiVotes[candiNum - 1]++;
		}
		DecimalFormat df = new DecimalFormat(".00");
		for (int i = 0; i < candiCount; i++) {
			if (candiVotes[i] == 0) {
				System.out.println("0.00%");
			} else {
				double result = ((double) candiVotes[i]) / ((double) elecNum) * 100d;
				String resultStr = df.format(result);
				System.out.println(resultStr + "%");
			}
		}
	}
}
