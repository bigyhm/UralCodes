package com.island.timus.bhundrend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class T1196_History_Exam_2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, "ISO-8859-1"));
		PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out, "ISO-8859-1"));
		int n = Integer.parseInt(reader.readLine());
		int counter = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			int value = Integer.parseInt(reader.readLine());
			map.put(value, 1);
		}
		int m = Integer.parseInt(reader.readLine());
		for (int i = 0; i < m; i++) {
			int stValue = Integer.parseInt(reader.readLine());
			if (map.containsKey(stValue)) {
				counter++;
			}

		}
		System.out.println(counter);
	}

}
