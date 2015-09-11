package com.island.timus.ihundrend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T1881_Long_problem_statement {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, "ISO-8859-1"));

		String firstLine = reader.readLine();
		String[] all = firstLine.split(" ");
		int h = Integer.parseInt(all[0]);
		int w = Integer.parseInt(all[1]);
		int n = Integer.parseInt(all[2]);

		int lineNum = 0;
		int position = 0;
		for (int i = 0; i < n; i++) {
			String value = reader.readLine();
			if (position == 0) {
				position = value.length();
				lineNum++;
			} else {
//				if (value.equals(",") || value.equals(".") || value.equals("!") || value.equals("?")) {
//					if (position + 1 < w) {
//						position = position + 1;
//					} else if (position + 1 == w) {
//						position = w;
//					} else {
//						position = 1;
//						lineNum++;
//					}
//				} else {
					if (position + 1 + value.length() < w) {
						position = position + 1 + value.length();
					} else if (position + 1 + value.length() == w) {
						position = w;
					} else {
						position = value.length();
						lineNum++;
					}
//				}
			}
		}
		int re = lineNum % h;
		int pages = 0;
		if (re != 0) {
			pages = lineNum / h + 1;
		} else {
			pages = lineNum / h;
		}
		System.out.println(pages);
	}
}
