package com.island.timus.chundrend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T1297_Palindrome {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, "ISO-8859-1"));
		String value = reader.readLine();
		int maxLength = 0;
		int innerMaxLength = 0;
		String maxValue = "";
		String innermaxValue = "";
		int fromStart = 0;
		int fromEnd = 0;
		int restriction = 0;

		for (int i = 0; i < value.length(); i++) {
			fromStart = i;
			fromEnd = value.length() - i - 1;
			restriction = fromStart < fromEnd ? fromStart : fromEnd;
			if (restriction < maxLength / 2) {
				continue;
			}
			innerMaxLength = 1;
			innermaxValue = String.valueOf(value.charAt(i));
			for (int j = 1; j < restriction + 1; j++) {
				if (value.charAt(i - j) == value.charAt(i + j)) {
					innerMaxLength = innerMaxLength + 2;
					innermaxValue = String.valueOf(value.charAt(i - j)) + innermaxValue + String.valueOf(value.charAt(i + j));
				} else {
					break;
				}
			}
			if (innerMaxLength > maxLength) {
				maxLength = innerMaxLength;
				maxValue = innermaxValue;
			}

			innerMaxLength = 0;
			innermaxValue = "";
			for (int j = 0; j < restriction + 1; j++) {
				if (i - j < 0 || i + j + 1 > value.length() - 1) {
					break;
				}
				if (value.charAt(i - j) == value.charAt(i + j + 1)) {
					innerMaxLength = innerMaxLength + 2;
					innermaxValue = String.valueOf(value.charAt(i - j)) + innermaxValue + String.valueOf(value.charAt(i + j + 1));
				} else {
					break;
				}
			}
			if (innerMaxLength > maxLength) {
				maxLength = innerMaxLength;
				maxValue = innermaxValue;
			}
		}
		System.out.println(maxValue);
	}
}
