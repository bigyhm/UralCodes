package com.island.timus.chundrend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class T1209_1_10_100 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, "ISO-8859-1"));
		PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out, "ISO-8859-1"));

		int max = Integer.MIN_VALUE;
		int num = Integer.parseInt(reader.readLine());
		int[] list = new int[num];
		for (int i = 0; i < num; i++) {
			list[i] = Integer.parseInt(reader.readLine());
			if (list[i] > max) {
				max = list[i];
			}
		}

		int[] book = new int[max];
		buildUp(book, max);

		for (int i = 0; i < num; i++) {
			writer.print(book[list[i] - 1]);
			writer.print(" ");
		}
		writer.flush();
	}

	private static void buildUp(int[] book, int max) {
		int counter = 1;
		for (int i = 0; i < max; counter++) {
			book[i] = 1;
			i = i + counter;
		}

	}
}
