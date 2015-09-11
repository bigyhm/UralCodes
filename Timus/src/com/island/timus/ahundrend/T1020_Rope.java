package com.island.timus.ahundrend;

import java.util.Scanner;

public class T1020_Rope {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nailsNum = in.nextInt();
		double nailRadius = in.nextDouble();
		double[][] nails = new double[nailsNum][2];
		for (int i = 0; i < nailsNum; i++) {
			nails[i][0] = in.nextDouble();
			nails[i][1] = in.nextDouble();
		}

		double length = 0.000;
		for (int i = 0; i < nailsNum - 1; i++) {
			length = length
					+ Math.sqrt(Math.pow(nails[i + 1][1] - nails[i][1], 2) + Math.pow(nails[i + 1][0] - nails[i][0], 2));
		}
		length = length
				+ Math.sqrt(Math.pow(nails[nailsNum - 1][1] - nails[0][1], 2)
						+ Math.pow(nails[nailsNum - 1][0] - nails[0][0], 2));

		length = length + Math.PI * nailRadius * 2;
		java.text.DecimalFormat df = new java.text.DecimalFormat("0.00");
		System.out.println(df.format(length));
	}
}
