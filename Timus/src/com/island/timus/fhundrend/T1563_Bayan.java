package com.island.timus.fhundrend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class T1563_Bayan {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(reader.readLine());
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < num; i++) {
			String value = reader.readLine();
			if (map.containsKey(value)) {

			} else {
				map.put(value, i);
			}
		}
		System.out.println(num - map.size());

	}
}
