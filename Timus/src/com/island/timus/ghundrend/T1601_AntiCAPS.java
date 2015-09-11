package com.island.timus.ghundrend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class T1601_AntiCAPS {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, "ISO-8859-1"));
		PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out, "ISO-8859-1"));

		String input = "";
		int flag = 0;

		while ((input = reader.readLine()) != null) {
			if (input.startsWith("-")) {
				writer.print("-");
				int kk = 1;
				for (; kk < input.length(); kk++) {
					if ((input.charAt(kk) + "").equals(" ")) {
						writer.print((input.charAt(kk) + "").toLowerCase());
					} else {
						writer.print((input.charAt(kk) + ""));
						break;
					}
				}
				for (int i = kk + 1; i < input.length(); i++) {
					int cursor = i;
					if (input.charAt(cursor - 1) == ' ') {
						cursor--;
					}
					if (input.charAt(cursor - 1) == '?' || input.charAt(cursor - 1) == '.'
							|| input.charAt(cursor - 1) == '!') {
						writer.print(input.charAt(i));
					} else {
						writer.print((input.charAt(i) + "").toLowerCase());
					}
				}
				if (input.charAt(input.length() - 1) == '?' || input.charAt(input.length() - 1) == '.'
						|| input.charAt(input.length() - 1) == '!') {
					flag = 0;
				} else {
					flag = 1;
				}
				writer.print("\n");
				writer.flush();
			} else {
				if (flag == 1) {
					writer.print((input.charAt(0) + "").toLowerCase());
				} else {
					writer.print(input.charAt(0));
				}
				for (int i = 1; i < input.length(); i++) {
					int cursor = i;
					if (input.charAt(cursor - 1) == ' ') {
						cursor--;
					}
					if (input.charAt(cursor - 1) == '?' || input.charAt(cursor - 1) == '.'
							|| input.charAt(cursor - 1) == '!') {
						writer.print(input.charAt(i));
					} else {
						writer.print((input.charAt(i) + "").toLowerCase());
					}
				}
				if (input.charAt(input.length() - 1) == '?' || input.charAt(input.length() - 1) == '.'
						|| input.charAt(input.length() - 1) == '!') {
					flag = 0;
				} else {
					flag = 1;
				}
				writer.print("\n");
				writer.flush();
			}
		}
	}
}
