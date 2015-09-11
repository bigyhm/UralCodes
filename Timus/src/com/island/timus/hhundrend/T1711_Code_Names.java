package com.island.timus.hhundrend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class T1711_Code_Names {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, "ISO-8859-1"));
		PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out, "ISO-8859-1"));
		int count = Integer.parseInt(reader.readLine());
		String[] names = new String[count];
		for (int i = 0; i < count; i++) {
			names[i] = reader.readLine();
		}
		String sequenceStr = reader.readLine();
		String[] sequenceArray = sequenceStr.split(" ");
		int[] sequence = new int[count];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		String[] selectedNames = new String[count];
		for (int i = 0; i < count; i++) {
			sequence[i] = Integer.parseInt(sequenceArray[i]);
			map.put(i, sequence[i] - 1);
		}
		for (int i = 0; i < count; i++) {
			String nameAll = names[map.get(i)];
			String[] nameAllsplit = nameAll.split(" ");
			Arrays.sort(nameAllsplit);
			boolean possible = false;
			String key = "";
			for (int j = 0; j < 3; j++) {
				possible = judgeIfPossible(selectedNames, i, nameAllsplit[j]);
				if (possible) {
					key = nameAllsplit[j];
					break;
				}
			}
			if (possible) {
				selectedNames[i] = key;
			} else {
				System.out.println("IMPOSSIBLE");
				return;
			}
		}
		for (int i = 0; i < count; i++) {
			System.out.println(selectedNames[i]);
		}

	}

	private static boolean judgeIfPossible(String[] selectedNames, int i, String name) {
		if (i == 0) {
			return true;
		}
		int value = selectedNames[i - 1].compareTo(name);
		if (value <= 0) {
			return true;
		}
		return false;
	}
}
