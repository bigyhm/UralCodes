package com.island.timus.ehundrend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class T1404_Easy_to_Hack {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, "ISO-8859-1"));
		PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out, "ISO-8859-1"));
		String value = reader.readLine();
		int length = value.length();
		char[] result = new char[length];
		char former = 'a';
		char next = 'b';
		for (int i = 0; i < length; i++) {
			former = value.charAt(i);
			char original = (char) (((former + 21) - 'a') % 26 + 'a');
			for (int j = 0; j < length - 1 && result[j] != '\0'; j++) {
				original = (char) ((original - result[j]) % 26 + 'a');
				while (original < 'a') {
					original = (char) (original + 26);
				}
			}
			result[i] = original;
		}
		for (int i = 0; i < length; i++) {
			System.out.print(result[i]);
		}
	}
}
