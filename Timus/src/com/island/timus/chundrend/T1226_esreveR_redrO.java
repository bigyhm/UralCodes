package com.island.timus.chundrend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class T1226_esreveR_redrO {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, "ISO-8859-1"));
		PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out, "ISO-8859-1"));
		String line = "";
		while ((line = reader.readLine()) != null) {
			String[] lineSplit = line.split(" ");
			reverse(lineSplit);
			String lineReversed = "";
			for (int i = 0; i < lineSplit.length - 1; i++) {
				lineReversed = lineReversed + lineSplit[i] + " ";
			}
			lineReversed = lineReversed + lineSplit[lineSplit.length - 1];
			writer.println(lineReversed);
		}
		writer.flush();

	}

	private static void reverse(String[] lineSplit) {
		for (int i = 0; i < lineSplit.length; i++) {
			String head = "";
			String tail = "";
			String word = lineSplit[i];
			if (!Character.isLetter(word.charAt(0))) {
				head = word.charAt(0) + "";
				word = word.substring(1, word.length());
			}
			if (!Character.isLetter(word.charAt(word.length() - 1))) {
				tail = word.charAt(word.length() - 1) + "";
				word = word.substring(0, word.length() - 1);
			}
			StringBuffer sb = new StringBuffer(word);
			sb = sb.reverse();
			word = head + sb.toString() + tail;
			lineSplit[i] = word;
		}
	}

}
