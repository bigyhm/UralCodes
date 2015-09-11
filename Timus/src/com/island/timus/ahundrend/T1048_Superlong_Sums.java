package com.island.timus.ahundrend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class T1048_Superlong_Sums {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, "ISO-8859-1"));
		PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out, "ISO-8859-1"));
		int len = Integer.parseInt(reader.readLine());
		int[][] arr = new int[2][len + 1];
		for (int i = 1; i < len + 1; i++) {
			String str = reader.readLine();
			String[] values = str.split(" ");
			arr[0][i] = Integer.parseInt(values[0]);
			arr[1][i] = Integer.parseInt(values[1]);
		}
		int key = 0;
		for (int i = len; i > 0; i--) {
			int value = arr[0][i] + arr[1][i] + key;
			if (value >= 10) {
				key = 1;
				arr[0][i] = value % 10;
			} else {
				key = 0;
				arr[0][i] = value;
			}
		}
		if (key == 1) {
			writer.print(1);
		} else {
			for (int i = 1; i < len + 1; i++) {
				writer.print(arr[0][i]);
			}
		}
		writer.flush();
	}
}
