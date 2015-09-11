package com.island.timus.ghundrend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T1654_Cipher_Message {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, "ISO-8859-1"));
		char[] values = new char[200050];
		char input = (char) reader.read();
		int length = 0;
		for (int i = 0; i < 200050 && input >= 97 && input <= 122; i++) {
			values[i] = input;
			length++;
			input = (char) reader.read();
		}

		while (true) {
			int times = 0;
			for (int i = 0; i < length - 1; i++) {
				while (values[i] == 65 && i < length - 1) {
					i++;
				}
				int a = values[i];
				int ori = i;

				while (values[i + 1] == 65 && i < length - 1) {
					i++;
				}
				int b = values[i + 1];
				if (a == b && a >= 97 && a <= 122) {
					values[ori] = 'A';
					values[i + 1] = 'A';
					times++;
				}
			}
			if (times == 0) {
				break;
			}
		}
		for (int i = 0; i < length; i++) {
			if (values[i] != 65) {
				System.out.print(values[i]);
			}
		}

	}
}
