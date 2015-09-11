package com.island.timus.ehundrend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class T1496_Spammer {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, "ISO-8859-1"));
		PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out, "ISO-8859-1"));
		int num = Integer.parseInt(reader.readLine());
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < num; i++) {
			String value = reader.readLine();
			if (map.containsKey(value)) {
				int count = map.get(value);
				count++;
				map.put(value, count);
			} else {
				map.put(value, 1);
			}
		}

		Iterator iter = map.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry entry = (Map.Entry) iter.next();
			String key = (String) entry.getKey();
			int value = (int) entry.getValue();
			if (value >= 2) {
				System.out.println(key);
			}
		}

	}

}
