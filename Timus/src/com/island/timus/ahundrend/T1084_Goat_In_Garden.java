package com.island.timus.ahundrend;

import java.text.DecimalFormat;
import java.util.Scanner;

public class T1084_Goat_In_Garden {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double sideLength = in.nextDouble();
		double ropeLength = in.nextDouble();
		double diagonalLength = Math.sqrt(2) * sideLength;
		DecimalFormat df = new DecimalFormat("#.000");

		if (ropeLength <= sideLength / 2) {
			double area = Math.PI * ropeLength * ropeLength;
			System.out.println(df.format(area));
			return;
		}
		if (ropeLength >= diagonalLength / 2) {
			System.out.println(df.format(sideLength * sideLength));
			return;
		}
		double bigCircleArea =Math.PI * ropeLength * ropeLength;
		double innerSquaresideLength = Math.sqrt(ropeLength * ropeLength - sideLength * sideLength / 4);
		double angle = 2 * Math.asin(innerSquaresideLength / ropeLength);
		double fanArea = angle * ropeLength * ropeLength / 2;
		double triangleArea = innerSquaresideLength * sideLength / 2;
		double totalArea = bigCircleArea - 4 * (fanArea - triangleArea);

		System.out.println(df.format(totalArea));
	}
}
