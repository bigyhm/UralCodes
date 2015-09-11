package com.island.timus.ghundrend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T1654_Cipher_Message_2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, "ISO-8859-1"));
		char[] values = new char[200050];
		int length = 0;
		char input = (char) reader.read();
		while (input >= 97 && input <= 122) {
			if (length > 0) {
				if (values[length - 1] == input) {
					length--;
				} else {
					values[length] = input;
					length++;
				}
			} else {
				values[0] = input;
				length++;
			}
			input = (char) reader.read();
		}

		for (int i = 0; i < length; i++) {
			System.out.print(values[i]);
		}

	}
}
