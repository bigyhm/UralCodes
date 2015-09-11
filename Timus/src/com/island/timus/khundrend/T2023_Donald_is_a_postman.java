package com.island.timus.khundrend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class T2023_Donald_is_a_postman {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, "ISO-8859-1"));
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Alice", 1);
		map.put("Ariel", 1);
		map.put("Aurora", 1);
		map.put("Phil", 1);
		map.put("Peter", 1);
		map.put("Olaf", 1);
		map.put("Phoebus", 1);
		map.put("Ralph", 1);
		map.put("Robin", 1);

		map.put("Bambi", 2);
		map.put("Belle", 2);
		map.put("Bolt", 2);
		map.put("Mulan", 2);
		map.put("Mowgli", 2);
		map.put("Mickey", 2);
		map.put("Silver", 2);
		map.put("Simba", 2);
		map.put("Stitch", 2);

		map.put("Dumbo", 3);
		map.put("Genie", 3);
		map.put("Jiminy", 3);
		map.put("Kuzko", 3);
		map.put("Kida", 3);
		map.put("Kenai", 3);
		map.put("Tarzan", 3);
		map.put("Tiana", 3);
		map.put("Winnie", 3);

		int letCount = Integer.parseInt(reader.readLine());
		int position = 1;
		int steps = 0;
		for (int i = 0; i < letCount; i++) {
			String value = reader.readLine();
			int goTopo = map.get(value);
			steps = steps + Math.abs(goTopo - position);
			position = goTopo;
		}
		System.out.println(steps);
	}

}
