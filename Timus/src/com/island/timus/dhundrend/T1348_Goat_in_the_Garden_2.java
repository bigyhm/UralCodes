package com.island.timus.dhundrend;

import java.text.DecimalFormat;
import java.util.Scanner;

public class T1348_Goat_in_the_Garden_2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int x1 = in.nextInt();
		int y1 = in.nextInt();

		int x2 = in.nextInt();
		int y2 = in.nextInt();

		int x0 = in.nextInt();
		int y0 = in.nextInt();

		int line = in.nextInt();

		double k = 0;
		double b = 0;
		double c = 0;

		if (y1 != y2 && x1 == x2) {
			k = 1;
			b = 0;
			c = -x1;
		} else {
			k = (y2 - y1 + 0d) / (x2 - x1 + 0d);
			b = -1;
			c = y2 - k * x2;
		}
		DecimalFormat df = new DecimalFormat("#0.00");
		double min = 0;
		double length1 = 0;
		double length2 = 0;
		double max = 0;

		if (x1 == x2 && y1 == y2) {
			min = Math.sqrt(Math.pow(x1 - x0, 2) + Math.pow(y1 - y0, 2));
			max = min;
		} else {
			min = Math.abs(k * x0 + b * y0 + c) / Math.sqrt(k * k + b * b);
			length1 = Math.sqrt(Math.pow(x1 - x0, 2) + Math.pow(y1 - y0, 2));
			length2 = Math.sqrt(Math.pow(x2 - x0, 2) + Math.pow(y2 - y0, 2));
			max = length1;

			if (min == 0) {
				if (max < length2) {
					max = length2;
					min = length1;
				} else {
					min = length2;
				}
				if (y1 != y2 && x1 == x2) {
					if ((y1 >= y0 && y2 <= y0) || (y1 <= y0 && y2 >= y0)) {
						min = 0.00d;
					} else {
						min = length1 < length2 ? length1 : length2;
					}
				} else if (y1 == y2 && x1 != x2) {
					if ((x1 >= x0 && x2 <= x0) || (x1 <= x0 && x2 >= x0)) {
						min = 0.00d;
					} else {
						min = length1 < length2 ? length1 : length2;
					}
				} else {
					if ((x1 >= x0 && x2 <= x0) || (x1 <= x0 && x2 >= x0)) {
						min = 0.00d;
					} else {
						min = length1 < length2 ? length1 : length2;
					}
				}
			} else {
				if (max < length2) {
					max = length2;
					// min = length1;
				} else {
					// min = length2;
				}
				double xj = 0;
				double yj = 0;
				if (y1 != y2 && x1 == x2) {
					yj = y0;
					xj = -c;
					if ((y1 >= yj && y2 <= yj) || (y1 <= yj && y2 >= yj)) {
						//
					} else {
						min = length1 < length2 ? length1 : length2;
					}
				} else if (y1 == y2 && x1 != x2) {
					xj = x0;
					if ((x1 >= xj && x2 <= xj) || (x1 <= xj && x2 >= xj)) {
						//
					} else {
						min = length1 < length2 ? length1 : length2;
					}
				} else {
					double cj = y0 + 1 / k * x0;
					xj = (cj - c) / (k + 1 / k);
					yj = k * xj + c;
					if ((x1 >= xj && x2 <= xj) || (x1 <= xj && x2 >= xj)) {
						//
					} else {
						min = length1 < length2 ? length1 : length2;
					}
				}

			}
		}

		if (line >= min) {
			min = 0.00d;
		} else {
			min = min - line;
		}
		if (line >= max) {
			max = 0.00d;
		} else {
			max = max - line;
		}
		System.out.println(df.format(min));
		System.out.println(df.format(max));
	}

}
