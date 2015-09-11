package com.island.timus.hhundrend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class T1723_Sandros_Book {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, "ISO-8859-1"));
		PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out, "ISO-8859-1"));

		char input = (char) reader.read();
		int max = 97;

		while (input >= 97 && input <= 122) {
			if (max <= input) {
				max = input;
			}
			input = (char) reader.read();
		}

		char output = (char) max;
		System.out.println(output);

	}
}
