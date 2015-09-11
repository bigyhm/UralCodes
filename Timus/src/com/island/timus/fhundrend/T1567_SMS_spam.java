package com.island.timus.fhundrend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class T1567_SMS_spam {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, "ISO-8859-1"));
		PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out, "ISO-8859-1"));
		String input = reader.readLine();

		int value = 0;
		for (int i = 0; i < input.length(); i++) {
			char xChar = input.charAt(i);
			if (xChar == '.') {
				value = value + 1;
			} else if (xChar == ',') {
				value = value + 2;
			} else if (xChar == '!') {
				value = value + 3;
			} else if (xChar == ' ') {
				value = value + 1;
			} else {
				int xValue = (xChar - 96) % 3;
//				System.out.println(xValue);
				value = value + (xValue == 0 ? 3 : xValue);
			}
		}

		System.out.println(value);

	}
}
