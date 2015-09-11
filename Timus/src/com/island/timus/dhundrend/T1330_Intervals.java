package com.island.timus.dhundrend;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class T1330_Intervals {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, "ISO-8859-1"));
		PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out, "ISO-8859-1"));

		int count = Integer.parseInt(reader.readLine());
		int[] numArray = new int[count + 1];
		int sum = 0;
		for (int i = 1; i <= count; i++) {
			numArray[i] = Integer.parseInt(reader.readLine()) + sum;
			sum = numArray[i];
		}

		int pairNum = Integer.parseInt(reader.readLine());

		for (int i = 0; i < pairNum; i++) {
			String line = reader.readLine();
			String[] bouder = line.split(" ");
			int start = Integer.parseInt(bouder[0]);
			int end = Integer.parseInt(bouder[1]);
			int total = numArray[end] - numArray[start - 1];
			writer.println(total);
		}
		writer.flush();
	}
}
