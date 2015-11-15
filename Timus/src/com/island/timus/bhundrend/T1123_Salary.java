package com.island.timus.bhundrend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigDecimal;

public class T1123_Salary {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, "ISO-8859-1"));
		PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out, "ISO-8859-1"));

		String numString = reader.readLine();
		if (numString.length() == 1) {
			System.out.println(numString);
			return;
		}

		int remain = numString.length() % 2;
		int middle = numString.length() / 2;
		String leftString = "";
		String rightString = "";
		String middleString = "";

		if (remain == 0) {
			leftString = numString.substring(0, middle);
			rightString = numString.substring(middle, numString.length());
		} else {
			leftString = numString.substring(0, middle);
			rightString = numString.substring(middle + 1, numString.length());
			middleString = numString.substring(middle, middle + 1);
		}

		BigDecimal leftNum = new BigDecimal(leftString);
		BigDecimal leftNum2 = new BigDecimal(new StringBuffer(leftString).reverse().toString());
		BigDecimal rightNum = new BigDecimal(rightString);

		int comparedValue = leftNum2.compareTo(rightNum);
		if (remain == 0) {
			if (comparedValue == -1) {
				leftNum = leftNum.add(new BigDecimal(1));
			}
			System.out.println(leftNum.toPlainString() + new StringBuffer(leftNum.toPlainString()).reverse().toString());
		} else {
			if (comparedValue == -1) {
				leftNum = new BigDecimal(leftNum.toString() + middleString);
				leftNum = leftNum.add(new BigDecimal(1));
				leftString = leftNum.toString().substring(0, leftNum.toString().length() - 1);
				middleString = leftNum.toString().substring(leftNum.toString().length() - 1, leftNum.toString().length());
			}
			System.out.println(leftString + middleString + new StringBuffer(leftString).reverse().toString());
		}

	}
}
